package Package11;

public class Studentdata {
	
	String name;
	int rollno;
	char grade;
	
	void printstudentdata() {
		System.out.println(name +" "+ rollno +" "+ grade);
	}
	
	void setstudentdata(String stname, int Rno, char gr) {
		name = stname;
		rollno = Rno;
		grade = gr;
		
	}

}
