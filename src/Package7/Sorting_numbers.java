package Package7;

import java.util.Arrays;

public class Sorting_numbers {

	public static void main(String[] args) {
		// Sorting
		int []a = {2,3,4,8,4,1,0,88,77};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting " + Arrays.toString(a));
		
		String []b = {"John", "buttler", "Kennedy", "ROY"};
		System.out.println("Before sorting "+ Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting "+ Arrays.toString(b));

	}

}
