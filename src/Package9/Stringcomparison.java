package Package9;

public class Stringcomparison {

	public static void main(String[] args) {
		// Case 1 string comparison
		/*
		 * String s1 = "welcome"; String s2 = "welcome"; System.out.println(s1==s2);
		 * System.out.println(s1.equals(s2));
		 */
		//Case 2
		/*
		 * String s1 = "welcome"; String s2 = new String("welcome");
		 * System.out.println(s1==s2); System.out.println(s1.equals(s2));
		 */
		//Case 3 
		/*
		 * String s1 = new String("welcome"); String s2 = new String("welcome");
		 * System.out.println(s1==s2); System.out.println(s1.equals(s2));
		 */
		
		//Case 4
		String s1 = "welcome"; 
		String s2 = new String("welcome");
		String s3 = s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s1);
		System.out.println(s2==s3);
	}

}
