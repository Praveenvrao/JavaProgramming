package Package6;

public class single_two_dim_array_asn {

	public static void main(String[] args) {
		// 1.asn find sum of elements in array
		/*int[] a = {1,2,3,4,5};
		int sum = 0;
		int i;
		for (i=0;i<a.length;i++) {
			sum = sum +a[i];
		}
		System.out.println("sum of elemtns in array is - "+ sum);
		*/
		
		//2. Print even and odd number from array
		/*int []a = {1,2,3,4,5,6};
		int i;
		int even_count = 0;
		int odd_count = 0;
		for (i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+ " is a even number");
				even_count++;
			}
			else {
				System.out.println(a[i]+ " is a odd number");
				odd_count++;
			}

		}
		System.out.println("Even number count is "+ even_count);
		System.out.println("Odd number count is "+ odd_count);
		*/
		
		// Check given number is prime number or not
		int a[] = {1,2,4,5,6,7,9,11,14,66, 89,57};
		int i;
		int j;
		for (i=0; i<a.length;i++) {
			if (a[i]>1) {
				int count = 0;
				for(j=1;j<=a[i];j++) {
					if(a[i]%j==0) {
						count++;
					}
				}if (count == 2) {
					System.out.println(a[i] + " is a prime number");
				}else {
					System.out.println(a[i]+ " is not a prime number");
				}
			}else {
				System.out.println(a[i]+ " It's not a prime number");
			}
		}
	}

}
