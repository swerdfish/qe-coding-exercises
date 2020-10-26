package qece.search;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
	
	public static <T extends Comparable<T>> boolean search(T x, List<T> a) {
		List<T> b = a.stream().collect(Collectors.toList());
		Collections.sort(b);
		while (b.size() > 1) {
			T midVal = b.get(b.size()/2);
			if (x.equals(midVal)) {
				return true;
			}
			else if (x.compareTo(midVal) > 0) {
				b = b.subList(b.size()/2, b.size());
			} else {
				b = b.subList(0, b.size()/2);
			}
		}
		return x.equals(b.get(0));
	}

}
