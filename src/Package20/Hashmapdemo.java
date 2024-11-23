package Package20;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap HM = new HashMap();
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
		//Adding elements key, value pairs
		hm.put(1, "David");
		hm.put(2, "Warner");
		hm.put(3, "shaw");
		hm.put(1, "Miller");
		hm.put(4, "Kane");

		
		//printing HashMap
		System.out.println(hm);
		
		//Removing element
		hm.remove(3);
		System.out.println(hm);
		
		//getting all the keys and values
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		

		
		

	}

}
