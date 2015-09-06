package com.maxiaohua.genealogy.fw.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;


public abstract class LDAPUtil {

	
	private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

	
	private static final String HEXITS = "0123456789abcdef";

	
	private static byte[] codes = new byte[256];

	static {
		for (int i = 0; i < 256; i++) {
			codes[i] = -1;
		}
		for (int i = 65; i <= 90; i++) {
			codes[i] = (byte) (i - 65);
		}
		for (int i = 97; i <= 122; i++) {
			codes[i] = (byte) (26 + i - 97);
		}
		for (int i = 48; i <= 57; i++) {
			codes[i] = (byte) (52 + i - 48);
		}
		codes[43] = 62;
		codes[47] = 63;
	}

	
	private static byte[] fromHex(
			String saltString) {
		saltString = saltString.toLowerCase();
		byte[] b = new byte[(saltString.length() + 1) / 2];
		int j = 0;

		int nybble = -1;
		for (int i = 0; i < saltString.length(); i++) {
			int h = HEXITS.indexOf(saltString.charAt(i));
			if (h >= 0) {
				if (nybble < 0) {
					nybble = h;
				} else {
					b[(j++)] = (byte) ((nybble << 4) + h);
					nybble = -1;
				}
			}
		}
		if (nybble >= 0) {
			b[(j++)] = (byte) (nybble << 4);
		}
		if (j < b.length) {
			byte[] b2 = new byte[j];
			System.arraycopy(b, 0, b2, 0, j);
			b = b2;
		}
		return b;
	}

    public static String generateToken(String decript) {
        try {
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
 
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
	
	public static String generateDigest(
			String password,
			String saltHex,
			String alg) {
		MessageDigest sha = null;
		try {
			sha = MessageDigest.getInstance(alg);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		String encode = null;
		if (sha != null) {
			byte[] salt = new byte[0];
			if (saltHex != null) {
				salt = fromHex(saltHex);
			}

			String label = "{SSHA}";

			if (alg.startsWith("SHA")) {
				label = salt.length > 0 ? "{SSHA}" : "{SHA}";
			} else if (alg.startsWith("MD5")) {
				label = salt.length > 0 ? "{SMD5}" : "{MD5}";
			}

			sha.reset();
			sha.update(password.getBytes());
			sha.update(salt);

			byte[] pwhash = sha.digest();

			StringBuffer digest = new StringBuffer(label);
			digest.append(new String(StringUtil.encodeBase64(concatenate(pwhash, salt))));
			encode = digest.toString();
		}
		return encode;
	}

	
	private static byte[] concatenate(
			byte[] pwhash,
			byte[] salt) {
		byte[] b = new byte[pwhash.length + salt.length];
		System.arraycopy(pwhash, 0, b, 0, pwhash.length);
		System.arraycopy(salt, 0, b, pwhash.length, salt.length);
		return b;
	}

	
	private static byte[][] split(
			byte[] src,
			int num) {
		byte[] salt;
		byte[] pwhash;
		if (src.length <= num) {
			pwhash = src;
			salt = new byte[0];
		} else {
			pwhash = new byte[num];
			salt = new byte[src.length - num];
			System.arraycopy(src, 0, pwhash, 0, num);
			System.arraycopy(src, num, salt, 0, salt.length);
		}
		byte[][] lr = { pwhash, salt };
		return lr;
	}

	
	public static char[] encode(
			byte[] data) {
		char[] out = new char[(data.length + 2) / 3 * 4];

		int i = 0;
		for (int index = 0; i < data.length; index += 4) {
			int val = 0xFF & data[i];
			val <<= 8;
			if (i + 1 < data.length) {
				val |= 0xFF & data[(i + 1)];
			}
			val <<= 8;
			if (i + 2 < data.length) {
				val |= 0xFF & data[(i + 2)];
			}
			out[(index + 3)] = alphabet[64];
			val >>= 6;
			out[(index + 2)] = alphabet[64];
			val >>= 6;
			out[(index + 1)] = alphabet[(val & 0x3F)];
			val >>= 6;
			out[index] = alphabet[(val & 0x3F)];

			i += 3;
		}

		return out;
	}

	
	public static byte[] decode(
			char[] data) {
		int tempLen = data.length;
		for (int ix = 0; ix < data.length; ix++) {
			if ((data[ix] > 'ÿ') || (codes[data[ix]] < 0)) {
				tempLen--;
			}

		}

		int len = tempLen / 4 * 3;
		if (tempLen % 4 == 3) {
			len += 2;
		}
		if (tempLen % 4 == 2) {
			len++;
		}

		byte[] out = new byte[len];

		int shift = 0;
		int accum = 0;
		int index = 0;

		for (int ix = 0; ix < data.length; ix++) {
			int value = 0;
			if (data[ix] > 'ÿ') {
				value = -1;
			} else {
				value = codes[data[ix]];
			}

			if (value < 0) {
				continue;
			}
			accum <<= 6;
			shift += 6;
			accum |= value;
			if (shift < 8) {
				continue;
			}
			shift -= 8;
			out[(index++)] = (byte) (accum >> shift & 0xFF);
		}

		if (index != out.length) {
			throw new ApplicationException("Miscalculated data length (wrote " + index + " instead of " + out.length + ")");
		}

		return out;
	}

	
	public static boolean verifyPassword(
			String digest,
			String password) {
		boolean result = false;
		String alg = null;
		int size = 0;

		if (digest.regionMatches(true, 0, "{CRYPT}", 0, 7)) {
			digest = digest.substring(7);
		}
		if (digest.regionMatches(true, 0, "{SHA}", 0, 5)) {
			digest = digest.substring(5);
			alg = "SHA-1";
			size = 20;
		} else if (digest.regionMatches(true, 0, "{SSHA}", 0, 6)) {
			digest = digest.substring(6);
			alg = "SHA-1";
			size = 20;
		} else if (digest.regionMatches(true, 0, "{MD5}", 0, 5)) {
			digest = digest.substring(5);
			alg = "MD5";
			size = 16;
		} else if (digest.regionMatches(true, 0, "{SMD5}", 0, 6)) {
			digest = digest.substring(6);
			alg = "MD5";
			size = 16;
		}

		MessageDigest sha = null;
		try {
			sha = MessageDigest.getInstance(alg);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		if (sha != null) {
			byte[][] hs = split(decode(digest.toCharArray()), size);
			byte[] hash = hs[0];
			byte[] salt = hs[1];

			sha.reset();
			sha.update(password.getBytes());
			sha.update(salt);
			byte[] pwhash = sha.digest();
			result = MessageDigest.isEqual(hash, pwhash);
		}

		return result;
	}
}