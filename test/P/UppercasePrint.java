package P;

public class UppercasePrint {

	public static void main(String[] args) {
		String str = "Rakesh AS Aremallenahalli";
		String uppercase = "";
		String lowercase = "";
		char[] s1 = str.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] >= 'A' && s1[i] <= 'Z') {
				uppercase = uppercase + s1[i];
			} else {
				lowercase = lowercase + s1[i];
			}
		}
		System.out.println("uppercases are " + uppercase);
//		System.out.println("lowercases are " + lowercase);

	}

}
