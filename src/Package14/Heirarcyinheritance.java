package Package14;

class HA{
	int a=11;
	void HAM1() {
		System.out.println("This is HA parent class and a value is "+ a);
	}
}

class HB extends HA{
	int b = 55;
	void HBM1() {
		System.out.println("This is HB parent class and inherited HA and a and b value is "+ a +" and "+ b);
	}
}

class HC extends HA{
	int c = 5;
	void HCM1() {
		System.out.println("This is HC parent class and inherited HA and a and c value is "+ a +" and "+ c);
	}
	
}

public class Heirarcyinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HB objhb = new HB();
		System.out.println(objhb.a);
		System.out.println(objhb.b); 
		objhb.HAM1();
		objhb.HBM1();
		HC objhc = new HC();
		System.out.println(objhc.a);
		System.out.println(objhc.c);
		objhc.HAM1();
		objhc.HCM1();

	}

}
