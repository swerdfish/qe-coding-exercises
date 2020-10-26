package qece.reverse;

public class ReversingStrings {
	
	public static String sbReverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public static String charArrReverse(String s) {
		char[] sChars = s.toCharArray();
		for (int i=0; i<sChars.length/2; i++) {
			char temp = sChars[i];
			sChars[i] = sChars[sChars.length-1-i];
			sChars[sChars.length-1-i] = temp;
		}
		return String.valueOf(sChars);
	}
	
	public static String charAtReverse(String s) {
		char[] chars = new char[s.length()];
		for (int i=0; i<s.length()/2; i++) {
			chars[i] = s.charAt(s.length()-1-i);
			chars[s.length()-1-i] = s.charAt(i);
		}
		if (s.length()%2==1) chars[s.length()/2] = s.charAt(s.length()/2);
		return String.valueOf(chars);
	}

}
