package arrays;

public class Array_Types {

	public static void main(String[] args) {
		// Array - collection of similar data types
		//we can store a fixed set of elements
		//index-based. Index begins from 0
		//nth element is stored in (n-1)th index in Java Array
		
		int i = 10;
		i = 11;
		i = 12;
		
		int j[] = {10, 11, 12, 13, 14, 15};
		char c[] = {'1' , '%'};
		char[] c1 = {'3' , '*'};
		
		
		
		//arrays - retrieve or sort the data as per your logical whim and fancy
		//declaration of an array
		
		//representation is done by []
		//datatype[] variablename;
		//datatype variablename[];
		
		//one dimensional array
		//multi dimensional arrays
		
		//instantiating an array
		
		int m[];    //declaring an array
		
		m = new int[10];      //allocation of memory to the array
		
		
		int n[] = new int[20];        //instantiating an array
		                               //what is 20 - length of the array, number of elements in the array
		                                //what is the name of the array - n
		
		//array literal. 
		//we use array literal when we know the size of the array
		int l[] = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int k[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//if I ask what is the size of this integer array k?
		System.out.println("The size of the array is :" + k.length);
		//print all the elements of the array ??
		
		for(int z=0 ; z<k.length ; z++) {
			System.out.print(" " + k[z]);
		}
		
		System.out.println();
		
		
		
		int x[] = {100, 200, 300, 400};
		System.out.println("Length of the array is :" + x.length);
		for(int y=0 ; y<x.length ; y++) {
			System.out.println(x[y]);
		}
		
		
		
		
		

	}

}
