package Package10;

public class OOPS1 {
	//Variables
	String Empname;
	int empid;
	int empsalary;
	String empcity;
	
	//Method
	void displayEmpinfo() {
		System.out.println(Empname);
		System.out.println(empid);
		System.out.println(empsalary);
		System.out.println(empcity);

	}

	public static void main(String[] args) {
		
		OOPS1 object1 = new OOPS1();
		object1.Empname = "Praveen";
		object1.empid = 2323;
		object1.empsalary = 20000;
		object1.empcity = "HYD";
		//calling method
		object1.displayEmpinfo();
		
		OOPS1 object2 = new OOPS1();
		object2.Empname = "RAM";
		object2.empid = 233;
		object2.empsalary = 20000;
		object2.empcity = "WGL";
		
	//calling methods
		object2.displayEmpinfo();
		
		

	}

}
