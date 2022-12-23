package P;

public class Pattern {

	public static void main(String[] args) {

		// Increasing order

//		*
//		**
//		***
//		****
//		*****
//		******

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// ------------------------------------------------------
		// dec order
//		*****
//		****
//		***
//		**
//		*

		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
		// ------------------------------------------------------

//		
//		    *
//		   **  
//		  ***
//		 ****
//		*****

		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// pyramid
//		  *
//	     * *
//	    * * *
//	   * * * *
//	  * * * * *
//	 * * * * * *

		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}

			System.out.println();
		}

	}

}
