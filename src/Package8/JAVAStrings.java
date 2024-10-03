package Package8;

public class JAVAStrings {

	public static void main(String[] args) {
		// length()
		String s = "Welcome";
		System.out.println(s.length());
		System.out.println("WELCOMES".length());
		
		//concat()
		String s1 = "   JAVA1  _ ";
		String s2 = "welcome";
		String s3 = "Java3";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3).concat(s1));
		
		//trim()
		System.out.println(s1.trim());
		
		//contains()
		System.out.println(s.contains("come"));
		System.out.println(s.contains("HP"));
		
		//CharAt()
		System.out.println(s2.charAt(2));
		System.out.println(s.charAt(3));
		
		//Equals() equalignorecase()
		System.out.println(s1.equals(s3));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//replace 
		System.out.println(s.replace("Wel", "COME"));
		
		//Substring
		System.out.println(s.substring(3,7));
		
		//toUppercase()  //toLowercase()
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s4 = "Selenium@gmail,com";
		//Split
		String a[] = s4.split("@");
		String b[] = a[1].split(",");
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		

	}

}
