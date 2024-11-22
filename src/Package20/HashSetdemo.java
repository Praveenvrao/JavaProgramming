package Package20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <Object> myset = new HashSet();
		myset.add("JOS");
		myset.add("Buttler");
		myset.add("JOS");
		myset.add(111);
		myset.add(false);
		myset.add(11.8);
		
		//Size of Hashset
		System.out.println(myset.size());
		
		//Printing Hashset
		System.out.println(myset);
		
		//removing element
		myset.remove(false);
		System.out.println(myset);
		
		//converting Hashset to arraylist
		ArrayList al1 = new ArrayList(myset);
		System.out.println(al1);
		System.out.println(al1.get(2));
		
		//Reading elements using for each loop
		for(Object x:myset) {
			System.out.println(x);
		}
		
		//Reading elements using Iterator
		
		Iterator <Object> IT = myset.iterator();
		
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}

	}

}
