package Package18;

import java.util.Scanner;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a value a");
			int a = sc.nextInt();
			System.out.println("Enter a value b");
			int b = sc.nextInt();
			System.out.println(a+b);

		} 
		catch(Exception e) {
			System.out.println("Entered invalid data...");
		}
		finally {
			System.out.println("Program executed...");
		}

	}

}
