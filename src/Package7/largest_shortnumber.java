package Package7;

public class largest_shortnumber {

	public static void main(String[] args) {
		// Find the largest number in array 
		/*int a[] = {1,22,33,55,44,77,9};
		int largest = a[0];
		for (int i =0;i<a.length;i++) {
			if (a[i]> largest) {
				largest = a[i];
			}
		}
		System.out.println("The largest number is "+ largest);
		
		*/

		// Find the shortest number in array 
		int a[] = {1,22,33,55,0,77,9};
		int shortest = a[0];
		for (int i =0;i<a.length;i++) {
			if(a[i]<shortest) {
				shortest = a[i];
			}
		}
		System.out.println("The shortest number is "+ shortest);
	}

}

