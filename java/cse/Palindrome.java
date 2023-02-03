package cse;

public class Palindrome {

	public static void main(String[] args) {
		String str = "level";
		String str2 = "";
//		char[] ch = str.toCharArray();
		for (int i = str.length()-1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		
		System.out.println(str2);
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}

	}

}
