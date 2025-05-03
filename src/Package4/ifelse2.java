package Package4;

public class ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "Mon";
		if (day.equals("Mon") || day.equals("Tuesday") || day.equals("Wed")|| day.equals("Thursday")||day.equals("Friday")) {
			System.out.println("The day is "+ day + " and is working day");
		}
		else if (day.equals("Sat") || day.equals("Sun")) {
			System.out.println("The day is "+ day + " and it is not a working day");
		}
		else {
			System.out.println("Invalid day");
		}
		

	}

}
