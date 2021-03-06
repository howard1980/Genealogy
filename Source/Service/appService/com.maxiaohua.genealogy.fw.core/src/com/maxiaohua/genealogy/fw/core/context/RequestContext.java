package com.maxiaohua.genealogy.fw.core.context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.maxiaohua.genealogy.fw.core.message.Message;


public class RequestContext {
	
	public static enum Key {
		
		All {
			@Override
			public String toString() {
				return "All";
			}
		},
		
		SQLSession {
			@Override
			public String toString() {
				return "SQLSession";
			}
		},
		
		LDAPContext {
			@Override
			public String toString() {
				return "LDAPContext";
			}
		},
		
		Transaction {
			@Override
			public String toString() {
				return "Transaction";
			}
		},
		
//		UserInfo {
//			@Override
//			public String toString() {
//				return "UserInfo";
//			}
//		},
		
//		LogonInfo {
//			@Override
//			public String toString() {
//				return "LogonInfo";
//			}
//		},
		
//		HttpSessionId {
//			@Override
//			public String toString() {
//				return "HttpSessionId";
//			}
//		},
		
		SystemId {
			@Override
			public String toString() {
				return "sysId";
			}
		},
		
		UserId {
			@Override
			public String toString() {
				return "userId";
			}
		},
		
//		WechetPayToken {
//			@Override
//			public String toString() {
//				return "wechetPayToken";
//			}
//		},
		
		Request {
			@Override
			public String toString() {
				return "Request";
			}
		},
		
		Response {
			@Override
			public String toString() {
				return "Response";
			}
		},
		
//		LoginId {
//			@Override
//			public String toString() {
//				return "loginId";
//			}
//		},
		
		AppId {
			@Override
			public String toString() {
				return "appId";
			}
		},
		
//		IpAddress {
//			@Override
//			public String toString() {
//				return "ipAddress";
//			}
//		},
		
//		WsNo {
//			@Override
//			public String toString() {
//				return "wsNo";
//			}
//		},
		
//		HostName {
//			@Override
//			public String toString() {
//				return "hostName";
//			}
//		},
		
//		Keys4PutToSession {
//			@Override
//			public String toString() {
//				return "Keys4PutToSession";
//			}
//		},
		
		FileName {
			@Override
			public String toString() {
				return "FileName";
			}
		},
		
		FileContent {
			@Override
			public String toString() {
				return "FileContent";
			}
		},
		
		ServiceStartTime {
			@Override
			public String toString() {
				return "ServiceStartTime";
			}
		}
	}

	
	private static ThreadLocal<RequestContext> contextHolder = new ThreadLocal<RequestContext>();
	
	private static byte[] block = new byte[0];

	
	public static RequestContext open() {
		RequestContext context = contextHolder.get();
		synchronized (block) {
			if (context == null) {
				context = new RequestContext();
				contextHolder.set(context);
			}
		}
		return context;
	}

	
	public static void close() {
		contextHolder.remove();
	}

	
	private Map<Key, Object> container = new HashMap<Key, Object>();

	
	private List<Key> keys4PutToSession = new ArrayList<Key>();

	
	private List<Key> keys4RemoveFromSession = new ArrayList<Key>();

	
	private List<Message> messageList = new ArrayList<Message>();

	
	private RequestContext() {
	}

	
	public List<Message> getMessageList() {
		return messageList;
	}

	
	public void addMessage(
			Message message) {
		this.messageList.add(message);
	}

	
	public Object getElement(
			Key key) {
		return container.get(key);
	}

	
	public void putElement(
			Key key,
			Object obj) {
		container.put(key, obj);
	}

	
	public void removeElement(
			Key key) {
		container.remove(key);
	}

	
	public Set<Key> elementKeys() {
		return container.keySet();
	}

	
	public Collection<Object> elementValues() {
		return container.values();
	}

	
	public boolean containsElement(
			Key key) {
		boolean exist = true;
		if (getElement(key) == null) {
			exist = false;
		}
		return exist;
	}

	
	public List<Key> getKeys4PutToSession() {
		return keys4PutToSession;
	}

	
	public List<Key> getKeys4RemoveFromSession() {
		return keys4RemoveFromSession;
	}

	
	public void putElementToSession(
			Key key,
			Object obj) {
		keys4PutToSession.add(key);
		container.put(key, obj);
	}

	
	public void removeElementFromSession(
			Key key) {
		keys4RemoveFromSession.add(key);
	}
}