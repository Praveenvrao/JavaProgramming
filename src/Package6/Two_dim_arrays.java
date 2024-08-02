package Package6;
/* 1. Declare an array
 * 2. add values to an array
 * 3. find size of an array
 * 4. read single value from an array
 * 5. read multiple values from an array
 */

public class Two_dim_arrays {

	public static void main(String[] args) {
		// approach1 two dimensianl arrays
		/*int a[][] = new int [2][2];
		//int [][]a = new int [][];
		 a[0][0] = 200;
		 a[0][1] = 100;
		 a[1][0] = 222;
		 a[1][1] = 333;
		 int i;
		 int j;
		 for (int arr[]: a) {
			 for (int x : arr) {
				 System.out.print(x + " ");
			 }
			 System.out.println();
		 }*/
		int a[][] = {{100,200}, {222,333}};
		int r;
		int c;
		 for (r=0; r<a.length;r++) {
			 for(c=0; c<a[r].length;c++) {
				 System.out.print(a[r][c] + " ");
			 }
			 System.out.println();
		 }

	}

}
