package Package16;

interface Shape{
	int width = 10;
	int length = 20; //final & static variable when it screated in Interface
	void circle();
	
	default void square() {
		System.out.println("This is square method for default method in interface");
	}
	static void rectangle() {
		System.out.println("This is a rectangle mthod for styatic method exmple in interface");
	}
}

public class Interfacedemoclass implements Shape {
	public void circle() {
		System.out.println("This is circle absrtact method created in interface and implemented in Class");
		System.out.println(width + length );
	}
	void triangle() {
		System.out.println("This is triangle method from only Interfacedemoclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Interfacedemoclass obj1 = new Interfacedemoclass();
		obj1.circle();
		obj1.square();
		Shape.rectangle();
		System.out.println(Shape.width);
		System.out.println(Shape.length);
		obj1.triangle();*/
		
		Shape obj2 = new Interfacedemoclass();
		obj2.circle();
		obj2.square();
		Shape.rectangle();
		//obj2.triangle(); //We can't call this


	}

}
