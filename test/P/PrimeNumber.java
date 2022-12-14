package P;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 2; i <= 50; i++) {
		
			boolean flag = true;
			for (int j = 2; j <= i; i++) {
				if (i % i == 0) {
					flag = false;
				}

			}
			if (flag == true) {
				System.out.println("Given number is prime number" + i);
			} else {
				System.out.println("Given number is not an prime number" + i);
			} 
		}

	}

}
