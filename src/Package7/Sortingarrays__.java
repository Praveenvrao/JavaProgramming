package Package7;

import java.util.Arrays;
import java.util.Collections;

public class Sortingarrays__ {

	public static void main(String[] args) {
		// Sorting arrays approach 1
		//int []a = {2,3,4,8,4,1,0,88,77};
		/*System.out.println("Array before sorting" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting" + Arrays.toString(a));*/
		
		//Sorting array approach2
		
		/*System.out.println("Array before sorting" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting" + Arrays.toString(a));*/
		
		//Sorting approach 3 descending order
		Integer []a = {2,3,4,8,4,1,0,88,77};
		System.out.println("Array before sorting" + Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after descending sorting "+ Arrays.toString(a));



	}

}
