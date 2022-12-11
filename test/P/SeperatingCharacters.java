package P;

public class SeperatingCharacters {

	public static void main(String[] args) {
		String Str = "ASR@7892931377_rakeshgowda(*^*&^*7Raki";
		String Alpha = " ";
		String numeric = " ";
		String special = " ";

		for (int i = 0; i < Str.length(); i++) {
			char ch = Str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				Alpha = Alpha + ch;

			} else if (ch >= 48 && ch <= 57) {
				numeric = numeric + ch;
			} else
				special = special + ch;

		}
		System.out.println("Alpha cases are :" + Alpha);
		System.out.println("numeric cases are :" + numeric);
		System.out.println("Special charcaters are:" + special);

	}

}
