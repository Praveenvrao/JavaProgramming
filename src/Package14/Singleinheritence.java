package Package14;

class A {
	int a=10;
	void Am1() {
		System.out.println(a);
	}
}
	
class B extends A {
	int b =44;
	void Bm1() {
		System.out.println(b);
	}
}


public class Singleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objb = new B();
		A obja = new A();
		System.out.println(objb.a);
		objb.a = 11;
		System.out.println(objb.b);
		System.out.println(objb.a);
		objb.Am1();
		objb.Bm1();
		
	}
}



