package Package20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Object> mylist = new ArrayList<Object>();
		mylist.add("JAVA");
		mylist.add(333);
		mylist.add('C');
		mylist.add(true);
		mylist.add("JAVA");
		mylist.add("Python");
		mylist.add(333);
		
		System.out.println(mylist.size());
		/*//Size of an array
		System.out.println(mylist.size());
		
		//Printing arralist
		System.out.println(mylist);
		//removing element from array
		mylist.remove(4);
		System.out.println("Arraylist after removing element "+ mylist);	
		
		//Inserting element
		mylist.add(4,"JAVA2");
		System.out.println("Arraylist after inserting "+ mylist);
		
		//Modifying element in an arraylist
		mylist.set(4,"CSHOP");
		System.out.println("After modifying an element in an arraylist "+ mylist);
		
		//Getting an specific element
		System.out.println(mylist.get(5));*/
		
		//Reading all the elements from araylist
		//1- Using normal loop
		
		for(int i=0; i<mylist.size()-1; i++)
		{
			System.out.println(mylist.get(i));
		}
		
		
		//2 - Using for each loop
		
		System.out.println("Using for each loop");
		for(Object x:mylist) {
			System.out.println(x);
		}
		
		//3 - Using Iterator
		System.out.println("Using for Iterator");
		
		Iterator <Object> IT = mylist.iterator();
		
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add("JAVA");
		mylist2.add("Python");
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		

		
		

	}

}
