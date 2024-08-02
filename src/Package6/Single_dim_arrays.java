package Package6;
/* 1. Declare an array
 * 2. add values to an array
 * 3. find size of an array
 * 4. read single value from an array
 * 5. read multiple values from an array
 */

public class Single_dim_arrays {

	public static void main(String[] args) {
		// array approach 1
		/*int a[] = new int[5];
		a[0] = 100;
		a[2] = 200;
		a[1] = 300;
		a[3] = 400;
		a[4] = 500;
		System.out.println(a.length);
		System.out.println(a[4]);
		System.out.println(a[0]+a[2]);
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(i);
		}*/
		
		int a[] = {100, 200, 300, 400, 500,600};
		int i;
		System.out.println(a.length);
		System.out.println(a[3]);
		for (int x : a) {
			System.out.println(x);
		}
		for (i=0;i<=a.length-1;i++)
		{
			System.out.println();
		}

	}

}
