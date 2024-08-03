package Package7;

import java.util.Scanner;

public class Takingoutputfrom_keypad {

	public static void main(String[] args) {
		// Taking single output from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Enter your age ");
		int age = sc.nextInt();
        System.out.println("Enter your city ");
        Object city = sc.next();
        
        System.out.println("Your name is "+ name + " Your age is "+ age + " your city is "+ city);
		

	}

}
