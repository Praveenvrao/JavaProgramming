package Package15;

class Cricket{
	String team1 = "IND";
	String team2 = "NZ";
	void Test() {
		System.out.println("Test match between nz and india");
	}
	void T20() {  //Method overloading 
		String t20team1 = "SA";
		String t20team2 = "IND";
		System.out.println("T20 match between SA and IND");
	}
	
}
class WTC extends Cricket
{
	String team1 = "IND";
	String team2 = "SA";
	void Test() {  //method overriding
		System.out.println("WTC Cycle test match between SA and IND");
	}
	void T20(String t20team3) { //methodoverloading
		String t20team1 = "SA";
		String t20team2 = "IND";
		System.out.println("T20 triseries between "+ " " +t20team1+" " + t20team2 +" " + t20team3);
	}
}

public class methodoverridingmethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WTC obj1 = new WTC();
		System.out.println(obj1.team1);
		System.out.println(obj1.team2);
		obj1.Test();
		obj1.T20();
		obj1.T20("AUS");
		
		Cricket obj2 = new Cricket();
		obj2.Test();
		obj2.T20();
		
		

		

	}

}
