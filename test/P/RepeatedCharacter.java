package P;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
//	public static void repeatChar(String str) {
//		Map<Character, Integer> CharMap = new HashMap<Character, Integer>();
//		char[] s = str.toCharArray();
//		for (char ch : s) {
//			if (CharMap.containsKey(ch)) {
//				CharMap.put(ch, CharMap.get(ch) + 1);
//			} else {
//				CharMap.put(ch, 1);
//			}
//		}
//		System.out.println(str + " : " + CharMap);
//	}
//
//	public static void main(String[] args) {
//		repeatChar("RakeshGowda");
//	}

	public static void repeatchar(String str1) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char[] Str = str1.toCharArray();
		for (char ch : Str) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);

			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(str1 + ":" + charMap);
	}

	public static void main(String[] args) {

		repeatchar("RakeshAS Gowda");

	}
}
