package Package9;

public class mutableandimmutable {

	public static void main(String[] args) {
		//String is immutable
		
		String s = "WELCOME";
		s.concat(" to java");
		System.out.println(s);

		String T = new String("WELCOME");
		T.concat(" to java");
		System.out.println(T);
		
		//Stringbuffer and Stringbuilder are mutable
		
		StringBuffer sb1 = new StringBuffer("Automation");
		sb1.append(" Testing");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Mobile ");
		sb2.append("Testing");
		System.out.println(sb2);
	}

}
