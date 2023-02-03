package P;

import java.util.HashMap;
import java.util.Map;

public class AllInOne {

	public static void main(String[] args) {
		String s1 = "Rakesh Gowda";
		char[] arr = s1.toCharArray();

		Map<Character, Integer> chmap = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (chmap.containsKey(ch)) {
				chmap.put(ch, chmap.get(ch) + 1);
			} else {
				chmap.put(ch, 1);

			}

		}
		System.out.println(s1 + "'s repeated characters " + chmap);

	}

}
