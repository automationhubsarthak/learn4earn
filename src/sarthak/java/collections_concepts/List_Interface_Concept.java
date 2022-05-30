package collections_concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class List_Interface_Concept {

	public static void main(String[] args) {
	//List interface extends Collection interface which indirectly extends Iterable interface
    //ordered format
	//duplicates are allowed
    //implemented by ArrayList, LinkedList, Vector and Stack
		
	
		/*
		 * List li1 = new LinkedList(); List li2 = new Vector(); List li3 = new Stack();
		 */
		
		/*
		 * String[] students = new String[20]; students[19] = "Gundeep";
		 * System.out.println(students[19]); students[20] = "Rucha";
		 * System.out.println(students[20]);
		 */
		
		
		
		List list = new ArrayList(); //list has no finite size. It dynamically increases
		
		list.add("BMW");
		list.add("Mercedes");
		list.add("Audi");
		list.add("Jaguar");
		
		System.out.println(list.size());
		

	}

}
