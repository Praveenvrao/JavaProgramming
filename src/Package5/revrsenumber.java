package Package5;

import java.util.Scanner;

public class revrsenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int number = scanner.nextInt();
		int reverse = 0;
		while (number != 0){
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number/10;
		}
		
		System.out.println(" The reverse number of number is " + reverse);
		scanner.close();

	}

}
