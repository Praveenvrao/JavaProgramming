package Package11;

public class Greetingmainclass {

	public static void main(String[] args) {
		Greetings object1 = new Greetings();
		
		object1.m1();
		
		String r1 = object1.m2();
		System.out.println(r1);
		
		object1.m3("Praveen");
		
		int r2= object1.m4(44);
		System.out.println(r2);

	}

}
