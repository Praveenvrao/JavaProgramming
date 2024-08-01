package Package5;

public class Loops_asn {

	public static void main(String[] args) {
		//1. Reverse a number  1234
		int num = 987656;
		int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is "+ rev);
		
		//2. Checking palindrome or not
		int number = 3233;
		int original_number = number;
		int rev_num = 0;
		
		while(number != 0) {
			rev_num = rev_num*10 + number%10;
			number= number/10;
		}
		if(rev_num == original_number) {
			System.out.println(original_number + " is a palindrome number");
		}
		else {
			System.out.println(original_number + " is not a palindrome number");
		}
		
		// Counting number of digits in number
		/*int k = 87654;
		int count = 0;
		while(k !=0) {
			k = k/10;
			count++;
		}
		System.out.println(count);*/
		
		//Counting even and odd digits in number
		int j = 76543892;
		int count = 0;
		int even_count = 0;
		int odd_count = 0;
		
		while(j!=0) {
			j = j/10;
			count++;
			if (j%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Total digits count of the number is "+ count);
		System.out.println("Total even digits count of the number is "+ even_count);
		System.out.println("Total digits count of the number is "+ odd_count);
		
		//Finding sum of the digits in number
		
		int l = 645300;
		int sum = 0;
		
		while(l !=0) {
			sum = sum+(l%10);
			l/=10;
		}
		System.out.println("Sum of the number is - " + sum);

	}

}
