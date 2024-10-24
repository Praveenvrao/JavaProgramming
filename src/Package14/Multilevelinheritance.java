package Package14;

class MultilevelA {
	int x=10;
	void Am1() {
		System.out.println(x);
	}
}
	
class MultilevelB extends A {
	int y =44;
	void Bm1() {
		System.out.println(y);
	}
}

class MultilevelC extends B{
	int z=99;
	void Cm1() {
		System.out.println(z);
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultilevelC objc = new MultilevelC();
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		objc.Am1();
		objc.Bm1();
		objc.Cm1();

		

	}

}
