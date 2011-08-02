package arrayEg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author arleen
 *
 */
public class ArrayExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		int count = 0;
		int counteven = 0;
		int countodd = 0;

		System.out.println("Enter the numbers to be checked for even and odd.Enter 900 for results.");
		Scanner sc = new Scanner(System.in);
		Integer input = sc.nextInt();
		while (input != 900) {
			a1.add(count, input);
			count++;
			input = sc.nextInt();
		}

/*		for (Integer i : a1) {
			System.out.println(" test " + ((i % 2 == 0) ? "even " : " odd "));
		}
*/
		Object arr[] = a1.toArray();
		for (int i = 0; i < count; i++) {
			if ((Integer) arr[i] == 0) {
				System.out.println("Neither even nor odd");
			}

			else if (((Integer) arr[i] % 2) == 0) {
				System.out.println("Even:" + arr[i]);
				counteven++;
			} else {
				System.out.println("Odd:" + arr[i]);
				countodd++;
			}
		}
		System.out.println("No. of Even:" + counteven);
		System.out.println("No. of Odd:" + countodd);
	}
}
