package Package3;

public class Increment_decrement_oprts {

	public static void main(String[] args) {
		// Increment oprtrs
		int a = 50, b = 100;
		//Post increment
		a++;
		System.out.println(a); //51
		a+=5;
		System.out.println(a); //56
		//pre increment
		int res= ++a;
		System.out.println(res); //57
		int RES= --a;
		System.out.println(RES); //56
		b-=5;
		System.out.println(b); //95
		b*=2;
		System.out.println(b); //190
		b/=2;
		System.out.println(b); //95
		b%=5;
		System.out.println(b); //0
	}

}
