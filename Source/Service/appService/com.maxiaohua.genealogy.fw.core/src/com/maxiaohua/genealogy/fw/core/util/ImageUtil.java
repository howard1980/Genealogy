package com.maxiaohua.genealogy.fw.core.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.spi.IIORegistry;
import javax.imageio.stream.ImageInputStream;

import com.sun.media.imageioimpl.plugins.tiff.TIFFImageReaderSpi;
import com.sun.media.imageioimpl.plugins.tiff.TIFFImageWriterSpi;


public class ImageUtil {
	
	public static String IMAGE_TYPE_GIF = "GIF";
	
	public static String IMAGE_TYPE_JPG = "JPG";
	
	public static String IMAGE_TYPE_JPEG = "JPEG";
	
	public static String IMAGE_TYPE_BMP = "BMP";
	
	public static String IMAGE_TYPE_PNG = "PNG";
	
	public static String IMAGE_TYPE_PSD = "PSD";
	
	public static String IMAGE_TYPE_TIF = "TIF";
	
	public static String IMAGE_TYPE_TIFF = "TIFF";

	
	static {
		IIORegistry registry = IIORegistry.getDefaultInstance();
		registry.registerServiceProvider(new TIFFImageWriterSpi());
		registry.registerServiceProvider(new TIFFImageReaderSpi());
	}

	
	public static final String getFormatName(
			byte[] srcImage) {
		String formatName = null;
		try {
			ByteArrayInputStream inputStream = new ByteArrayInputStream(srcImage);
			ImageInputStream iis = ImageIO.createImageInputStream(inputStream);
			Iterator<ImageReader> iter = ImageIO.getImageReaders(iis);
			if (iter.hasNext()) {
				ImageReader reader = iter.next();
				formatName = reader.getFormatName();
				iis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (StringUtil.isNotEmpty(formatName)) {
			formatName = formatName.toUpperCase();
		}
		return formatName;
	}

	
	public static final byte[] convert(
			byte[] srcImage,
			String targetFormatName) {
		byte[] changedImage = null;

		try {
			BufferedImage src = ImageIO.read(new ByteArrayInputStream(srcImage));
			ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			ImageIO.write(src, targetFormatName, outStream);
			changedImage = outStream.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return changedImage;
	}
}