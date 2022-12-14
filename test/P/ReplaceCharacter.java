package P;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s1 = "Rakesh Gowda";
//		String s3 = s1.replace(" ", "_");
//		System.out.println(s3);
		String s4 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == ' ') {
				s4 = s4 + "-";
			} else {
				s4 = s4 + ch;

			}

		}
		System.out.println(s4);

	}
}
