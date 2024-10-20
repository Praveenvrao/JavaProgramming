package Package12;

public class Add {
	
	int x = 10;
	int y = 20;
	
	void operation() {
		System.out.println(x+y);
	}
	void operation(int x, int y) {
		System.out.println(x*y);
	}
	void operation(int x, double y) {
		System.out.println(x+y);
	}
	void operation(double x, int y) {
		System.out.println(x+y);
	}
	void operation(int x, int y, double z) {
		System.out.println(x+y+z);
	}

}
