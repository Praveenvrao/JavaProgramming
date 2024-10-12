package Package9;

public class StringsRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach1 with string methods
		String s = "Automation Testing";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse of string is " + rev);
		
		//Approach 2 without string methods
		String T = "Mobile";
		String REV = "";
		
		char a[] = T.toCharArray();
		for(int j =a.length-1;j>=0;j--) {
			REV = REV+a[j];
		}
		System.out.println("Reverse of string is " + REV);
		
		//Approach3 using Stringbuffer
		StringBuffer sb = new StringBuffer("Testing");
		System.out.println("String revrse is "+sb.reverse());
		
		//Approach4 using StringBuilder
		StringBuilder sb1 = new StringBuilder("CHarging");
		System.out.println("String revrse is "+sb1.reverse());
		
	}

}
