package collections_concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Learning {

	public static void main(String[] args) {

		// in Automation most of the time you will be using String
		List<String> list = new ArrayList<String>();
		// ArrayList behaves like a normal array but can dynamically change its size
		// which an Array cannot.

		list.add("Jan");
		list.add("Feb");
		list.add("Mar");
		list.add("Apr");
		list.add("May");
		list.add("June");
		System.out.println(list);
        list.add("June");
        list.add("July");
		System.out.println(list);
		list.add(2, "Aug");
		System.out.println(list);
		// internal working of ArrayList // size = n + n/2 + 1 = 10 +10/2 + 1 = 16
		
		List<String> newlist = new ArrayList<String>();
		newlist.add("Denim");
		newlist.add("World");
		
		list.addAll(newlist);
		System.out.println("After adding the new list : " + list);
		
		System.out.println(list.get(5));
		
		list.remove(String.valueOf("Denim"));
		System.out.println(list);
		
		/*
		 * list.clear(); System.out.println(list);
		 */
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		for(String element : list) {
			System.out.println(element);
		}
	
		System.out.println("**************-*******************************");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
