package Package7;

import java.util.Arrays;

public class Sortingelements_loop {

	public static void main(String[] args) {
		// Sorting elemeents using loop - Ascending order
		
		/*int []a = {2,3,4,8,4,1,0,88,77};
		int n = a.length;
		System.out.println("Array before sorting "+ Arrays.toString(a));
		for (int i=0;i<n-1; i++) {
			for (int j = 0;j<n-1;j++ ) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array after sorting "+ Arrays.toString(a));
		*/
		// Sorting elemeents using loop - Descending order
		int []a = {2,3,4,8,4,1,0,88,77};
		int n = a.length;
		System.out.println("Array before sorting "+Arrays.toString(a));
		
		for (int i=0; i<n-1; i++) {
			for (int j=0;j<n-1; j++) {
				if (a[j]<a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array after descending sorting "+ Arrays.toString(a));

	}

}
