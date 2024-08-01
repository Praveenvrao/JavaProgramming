package Package5;

public class forloop {

	public static void main(String[] args) {
		// writing 1....10
		for (int i=1;i<=20;i++)
		{
			System.out.println(i);
			i++;
		}
		
		//Writing even numbers
		for (int j=2;j<=22;j+=2)
		{
			System.out.println(j);
		}
		
		//Writing odd numbers
		for (int k =1; k<=10;k++) {
			if (k%2!=0)
			System.out.println(k + " Odd number");
		}

	}

}
