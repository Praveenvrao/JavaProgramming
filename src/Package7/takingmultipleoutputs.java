package Package7;

import java.util.Arrays;
import java.util.Scanner;

public class takingmultipleoutputs {

	public static void main(String[] args) {
		// Taking multiple outputs from Keyboard
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<=a.length-1;i++) {
			System.out.println("Enter the value of "+ a[i]);
					a[i] = sc.nextInt();
			
		}
		System.out.println("Printing array values...");
		System.out.println(Arrays.toString(a));

	}

}
