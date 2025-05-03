package Package5;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number to check prime or not : ");
		int number = scanner.nextInt();
		boolean Prime = true;
		
		if (number <=1) {
			Prime = false;
		} else {
			for (int i=2;i<number;i++) {
				if(number%i == 0) {
					Prime = false;
					break;
				}
			}
		}
		if(Prime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
		
		
}
}


