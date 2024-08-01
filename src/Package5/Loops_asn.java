package Package5;

public class Loops_asn {

	public static void main(String[] args) {
		//1. Reverse a number  1234
		int num = 12347635;
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
		
	}

}
