package Package3;

public class Swappingnumbers_asn {

	public static void main(String[] args) {
		//Logic1 Using + and - without third variable
		/*int a = 5, b = 7;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);*/
		
		//logic2 Using * and / without third variable
		// Variables values should not be zero
		/*int a = 5, b = 7;
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a);
		System.out.println(b);*/
		
		//Logic3 Using XOR operator 
		int a = 5, b = 7;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
		
		//Logic 4 Using single statment
		int x = 10, y = 20;
		y = x+y-(x=y);
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
