package P;

import java.util.HashMap;
import java.util.Map;

public class AllInOne {

	public static void main(String[] args) {
		String s1 = "Rakesh gowda";
		char[] arr = s1.toCharArray();
		String s2 = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'g') {
				s2 = s2 + 'G';

			} else {
				s2 = s2 + arr[i];
			}

		}
		System.out.println("After replacing character " + s2);

	}
}
