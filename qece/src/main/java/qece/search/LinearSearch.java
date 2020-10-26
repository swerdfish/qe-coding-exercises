package qece.search;

import java.util.List;

public class LinearSearch {
	
	public static <T> boolean search(T x, T[] a) {
		for (int i=0; i<a.length; i++) {
			if (x.equals(a[i])) return true;
		}
		return false;
	}
	
	public static <T> boolean search(T x, List<T> a) {
		for (int i=0; i<a.size(); i++) {
			if (x.equals(a.get(i))) return true;
		}
		return false;
	}
	
	public static boolean search(char x, String s) {
		for (int i=0; i<s.length(); i++) {
			if (x==s.charAt(i)) return true;
		}
		return false;
	}
	
	public static <T> int indexOf(T x, T[] a) {
		for (int i=0; i<a.length; i++) {
			if (x.equals(a[i])) return i;
		}
		return -1;
	}
	
	public static <T> int indexOf(T x, List<T> a) {
		for (int i=0; i<a.size(); i++) {
			if (x.equals(a.get(i))) return i;
		}
		return -1;
	}
	
	public static int indexOf(char x, String s) {
		for (int i=0; i<s.length(); i++) {
			if (x==s.charAt(i)) return i;
		}
		return -1;
	}

}
