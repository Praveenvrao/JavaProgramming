package Package7;

public class Array_linearsearch {

	public static void main(String[] args) {
		// Search an element in array - linear search
		int []a = {5,4,33,4,32,232,555};
		int expected_num = 555;
		boolean status = false;
		/*for (int i=0;i<=a.length-1;i++) {
			if (a[i]==expected_num) {
				System.out.println("Expected element found "+a[i]);
				status = true;
				break;
			}
		}
		if (status == false) {
			System.out.println("Expecte element not found");
		}*/
		
		//Using enhanced for loop
		for(int x :a) {
			if (x == expected_num) {
				System.out.println(x + " is expected element and its found");
				status = true;
				break;
			}
		}
		if (status = false) {
			System.out.println("Expecte element not found");
		}

	}

}
