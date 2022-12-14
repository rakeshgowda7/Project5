package P;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String Str = "Rakesh Aremallenahalli";
		char[] arr = Str.toCharArray(); // Converts given string into character array

		// Counts each character present in the string
		for (int i = 0; i <= arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) { // if we convert to array no need to mention <= only mention <
														// because index starts with 0
				if (arr[i] == arr[j] && arr[i] != ' ') {
					count++;
					arr[j] = '0'; // Set string[j] to 0 to avoid printing visited character
				}

			}

			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && arr[i] != '0') {
				System.out.println(arr[i]);
			}
		}

	}

}
