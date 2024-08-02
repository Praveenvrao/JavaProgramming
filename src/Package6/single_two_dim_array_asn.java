package Package6;

public class single_two_dim_array_asn {

	public static void main(String[] args) {
		// 1.asn find sum of elements in array
		int[] a = {1,2,3,4,5};
		int sum = 0;
		int i;
		for (i=0;i<a.length;i++) {
			sum = sum +a[i];
		}
		System.out.println("sum of elemtns in array is - "+ sum);

	}

}
