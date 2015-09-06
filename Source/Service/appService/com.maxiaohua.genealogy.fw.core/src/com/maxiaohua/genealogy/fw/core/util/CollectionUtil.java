package com.maxiaohua.genealogy.fw.core.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;


abstract public class CollectionUtil {
	
	public static boolean isEmpty(
			Collection<?> value) {
		return value == null || value.isEmpty();
	}

	
	public static boolean isNotEmpty(
			Collection<?> value) {
		return value != null && !value.isEmpty();
	}

	
	public static <E> boolean isNotEmpty(
			E[] value) {
		return value != null && value.length > 0;
	}

	
	public static <E> boolean isEmpty(
			E[] value) {
		return value == null || value.length == 0;
	}

	
	public static <E extends Comparable<? super E>> List<E> sortAsc(
			List<E> value,
			final String... keys) {
		return sort(false, value, keys);
	}

	
	public static <E extends Comparable<? super E>> List<E> sortDesc(
			List<E> value,
			final String... keys) {
		return sort(true, value, keys);
	}

	
	private static <E extends Comparable<? super E>> List<E> sort(
			final boolean desc,
			List<E> value,
			final String... keys) {
		Collections.sort(value, new Comparator<E>() {
			
			@SuppressWarnings("unchecked")
			@Override
			public int compare(
					E element1,
					E element2) {
				if (element1 == null || element2 == null) {
					
					return 0;
				}

				if (keys == null) {
					return element1.compareTo(element2);
				}

				for (int i = 0; i < keys.length; i++) {
					
					Object obj1 = element1 instanceof Map ? ((Map<?, ?>) element1).get(keys[i]) : BeanUtil.getBeanProperty(element1, keys[i]);
					
					Object obj2 = element2 instanceof Map ? ((Map<?, ?>) element2).get(keys[i]) : BeanUtil.getBeanProperty(element2, keys[i]);
					if (obj1 == null || obj2 == null) {
						
						continue;
					}
					if (obj1 instanceof Comparable<?> && obj2 instanceof Comparable<?>) {
						
						@SuppressWarnings("rawtypes")
						int result = ((Comparable) obj1).compareTo((Comparable) obj2);
						if (result == 0) {
							continue;
						}
						if (desc) {
							
							return result > 0 ? -1 : 1;
						} else {
							
							return result > 0 ? 1 : -1;
						}
					}
					
					continue;
				}
				if (desc) {
					
					return element1.compareTo(element2) > 0 ? -1 : 1;
				} else {
					
					return element1.compareTo(element2) > 0 ? 1 : -1;
				}
			}
		});
		return value;
	}

}