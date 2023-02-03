package cse;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacters {

	public static void main(String[] args) {
		String str = "level";
		char[] arr = str.toCharArray();
		Map<Character, Integer> chmap = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (chmap.containsKey(ch)) {
				chmap.put(ch, chmap.get(ch) + 1);
			} else {
				chmap.put(ch, 1);
			}
		}

		System.out.println(chmap);
	}

}
