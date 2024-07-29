package Package3;

public class Operators {

	public static void main(String[] args) {
		// Arithmatic oprtrs + - * % /
		
		int a = 10, b = 20;
		System.out.println("The sum of the a, b is "+ (a+b));
		System.out.println("The Substraction of the a, b is "+ (a-b));
		System.out.println("The Multiply of the a, b is "+ (a*b));
		System.out.println("The percantage of the a, b is "+ (a%b));
		System.out.println("The division of the a, b is "+ (a/b));
		
		//Relational/comparison oprtrs > >= < <= != ==
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		//Logical oprtrs && || !
		boolean b1 = a>b;
		boolean b2 = a<b;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);

	}

}
