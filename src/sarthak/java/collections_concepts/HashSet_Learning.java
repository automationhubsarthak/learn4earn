package collections_concepts;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet_Learning {

	public static void main(String[] args) {
	//Set interface - not ordered
		//duplicates are not allowed
		
		SortedSet<String> hs = new TreeSet<String>();
		hs.add("Donkey");
		hs.add("Monkey");
		hs.add("tiger");
		hs.add("lion");
		//hs.add(null);
		hs.add("Dog");
		hs.add("Donkey1");
		hs.add("Monkey2");
		hs.add("tiger2");
		hs.add("lion3");
		
		hs.add("Dog1");
		
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
