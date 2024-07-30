package Package4;

public class Controlstatements_asn {

	public static void main(String[] args) {
		// largest of 2 numbers using ternary oprtrs
		/*int a = 45, b= 55;
		int x = (a>b)? a: b;
		System.out.println(x);*/
		
		//Largest of 3 numbers
		/*int a=60, b=19, c=44;
		if (a>b && a>c) {
			System.out.println("Larger number is a which is "+a);
		}
		else if (b>a && b>c) {
			System.out.println("Larger number is b which is"+b);
		}
		else
		{
			System.out.println("Larger number is c which is "+c);
		}*/
		
		
		//Print week number based on weekname
		String weekname = "monday";
		switch (weekname) {
		case "Sunday" : System.out.println(1); break;
		case "Monday" : System.out.println(2); break;
		case "Tuesday" : System.out.println(3); break;
		case "Wednesday" : System.out.println(4); break;
		case "Thursday" : System.out.println(5); break;
		case "Friday" : System.out.println(6); break;
		case "Saturday" : System.out.println(7); break;
		default : System.out.println("ERROR : Invalid weekname");
		}
	}

}
