package Package3;

public class Ternary_oprtrs {

	public static void main(String[] args) {
		// Ternary oprtrs
		// Syntax var = expression ? a : b;
		int a = 50, b= 70;
		int x = (a>b)? a : b;
		System.out.println(x);
		int age = 34;
		String y = (age >= 18) ? "Eligible" : "Not eligible";
		System.out.println(y);
		
		//Swapping numbers
		int c = 10, d = 20;
		int e;
		e = c;
		c = d;
		d = e;
		System.out.println(c);
		System.out.println(d);
	}

}
