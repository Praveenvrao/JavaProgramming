package Package15;

class Final1{
	 final String name = "JOHN";
	 final void method1() {
		System.out.println("This method used for final");
	}
	void method2() {
		System.out.println("This is the method example for Super keyword");
	}
}
class Final2 extends Final1{
	String name = "Jos";
	//void method1() { //As it is final method can't override
		
	//}
	void method2(){
		System.out.println("This is method is for super example");
		super.method2();
	}
	
}


public class Final_super_keywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final2 object1 = new Final2();
		System.out.println(object1.name);
		object1.method2();

	}

}
