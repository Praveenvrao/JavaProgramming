package Package4;

public class Nestedifelse_statement {

	public static void main(String[] args) {
		// Nested if else
		int age = 22;
		if (age >= 18) {
			if (age >=18 && age <= 30)
			{
				System.out.println("Adult age");
			}
			else if (age >=31 && age <= 55) {
				System.out.println("Normal age");
			}
			else {
				System.out.println("Old age");
			}
		}
		else {
			System.out.println("Childhood age");
		}

	}

}
