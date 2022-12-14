package P;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "madam";
//		char[] s2 = s1.toCharArray();   --> converted to character array
		String s3 = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			
			s3 = s3 + s1.charAt(i);
//			s3 = s3 + s2[i];   --->if we converted to character array

		}
		if (s1.equals(s3)) {
			System.out.println("Given string " + s1 + "  is a palindrome");
		} else {
			System.out.println("Given string " + s1 + " is not a palindrome");
		}

	}

}

