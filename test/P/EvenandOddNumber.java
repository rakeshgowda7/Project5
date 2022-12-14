package P;

public class EvenandOddNumber {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i+ " is even number");
			}
		}
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i+ " is odd number");

			}
		}
	}
}