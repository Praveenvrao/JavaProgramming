package Package12;

public class Box {
	
	double Height, width, depth;
	Box(){
		Height = depth = width = 0;
	}
	Box (double h, double d, double w){
		Height = h;
		depth = d;
		width = w;
		
	}
	Box(double len){
		Height = depth = width = len;
	}
	
	void volume() {
		System.out.println((Height*depth*width));
	}

}
