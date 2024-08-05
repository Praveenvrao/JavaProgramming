package Package7;

public class missingnumber_array {

	public static void main(String[] args) {
		// Finding missing number in range of numbers in array
		
		int []a = {1,2,3,5,6};
		int sum1 = 0;
		for(int i=0;i<a.length;i++) {
			sum1 = sum1+a[i];
		}
		System.out.println("Sum of the array numbers is "+ sum1);
		
		int sum2 = 0;
		for(int i=1;i<=6;i++) {
			sum2 = sum2 +i;
		}
		System.out.println("Sum of the range numbers is "+sum2);
		System.out.println("The missing number is "+ (sum2-sum1));

	}

}
