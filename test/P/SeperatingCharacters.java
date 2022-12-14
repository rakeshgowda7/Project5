package P;

public class SeperatingCharacters {

	public static void main(String[] args) {
		String Str = "ASR@7892931377_rakeshgowda(*^*&^*7Raki";
		String Alpha = " ";
		String numeric = " ";
		String special = " ";
		char[] arr = Str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
//			char ch = Str.charAt(i);
			if ((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z')) {
				Alpha = Alpha + arr[i];

			} else if (arr[i] >= 48 && arr[i] <= 57) {
				numeric = numeric + arr[i];
			} else
				special = special + arr[i];

		}
		System.out.println("Alpha cases are :" + Alpha);
		System.out.println("numeric cases are :" + numeric);
		System.out.println("Special charcaters are:" + special);

	}

}
