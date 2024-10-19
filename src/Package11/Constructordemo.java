package Package11;

public class Constructordemo {
	int x,y;
	
	Constructordemo(){
		x = 200;
		y = 400;
	}
	Constructordemo(int a, int b){
		x=a;
		y=b;
	}
	
	void Printsum() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructordemo obj= new Constructordemo();
		//Constructordemo obj= new Constructordemo(10,20);

		obj.Printsum();

	}

}
