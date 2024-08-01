package Package5;

public class jumpingstatements {

	public static void main(String[] args) {
		// using jump statements
		/*for (int i =1;i<=51;i++) {
			if (i%5==0) {
				//System.out.println("It's divisible by 5");
				continue;
			}
			System.out.println(i);
		}*/
		
		for (int i =1;i<=51;i++) {
			if (i%50==0) {
				//System.out.println("It's divisible by 5");
				break;
			}
			System.out.println(i);
		}

	}

}
