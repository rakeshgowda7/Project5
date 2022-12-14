package P;

public class SumofFactorialNumber {

	public static void main(String[] args) {
		int no = 1247;
		int sum = 0;
		while (no != 0) {
			int fact = 1;
			int num = no / 10;
			for (int i = num; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			no = no / 10;
		}
		System.out.println(sum);
	}

}
