package P;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {

	public static void main(String[] args) {
		String Str1 = "Rakesh AS Gowdaa";
		char[] arr = Str1.toCharArray();
		Map<Character, Integer> charmap= new HashMap<Character, Integer>();
		for(char ch : arr) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch,charmap.get(ch)+1 );
			}
			else {
				charmap.put(ch, 1);
			}
		}
		System.out.println(Str1 +":"+ charmap);
		
	}

}