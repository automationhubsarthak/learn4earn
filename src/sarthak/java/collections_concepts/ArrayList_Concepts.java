package collections_concepts;

import java.util.ArrayList;

public class ArrayList_Concepts {
	//ArrayList cannot be used for primitive data types

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=1 ; i<=5 ; i++) {
			al1.add(i);
			System.out.println(al1);
		}
		
		//al1.remove(2);
		//System.out.println(al1);
		
		for(int j=0 ; j<al1.size(); j++) {
			System.out.print(al1.get(j) +  " ");
		}

	}

}
