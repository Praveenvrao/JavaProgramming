package Package5;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to print its multiplication table");
		int number = scanner.nextInt();
		
		System.out.println("Multiplication table of "+ number + " is ");
		for (int i =1; i<=10;i++) {
			int result = number * i;
			System.out.println(number +" X "+ i + " = "+ result);
		}

	}

}
