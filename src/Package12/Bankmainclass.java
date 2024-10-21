package Package12;

public class Bankmainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank_En b1 = new Bank_En();
		//System.out.println(b1.Accno);
		
		Bank_En b2 = new Bank_En();
		b2.setAccno(66);
		b2.setName("John cena");
		b2.setBranch("HYD");
		b2.setIFSC(78778);
		System.out.println(b2.getAccno());
		System.out.println(b2.getName());
		System.out.println(b2.getBranch());
		System.out.println(b2.getIFSC());
		

	}

}
