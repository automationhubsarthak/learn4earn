package string_operations;

public class SCP_SLP {

	public static void main(String[] args) {
		//String Constant Pool or String Literal Pool
		//Whenever we create an object using the new keyword, the object gets a memory allocation in the Heap Area
		
		//There are 5 memory areas in Java
		//Method Area
		//Heap Area [ SCP/SLP - Where in you can manipulate the size]
		//Stack Area
		//PC Register
		//Native methodArea
		
		String S1 = new String();	//only 1 object is created here. Object is stored in Heap Area
		String S2 = new String("Selenium"); //1st object is stored in heap area
		                                   // 2nd object is stored in SCP/SLP area
		
		//can we delete the objects created inside the SCP/SLP area by the concept of Garbage Collector?
		//Answer is No
		
		String S3 = "Python"; // 1 object will be created. Directly in the SCP/SLP area.
		
		String S4 = new String("Java"); //2 objects will be created. 
		String S5 = new String("Perl"); //2 objects will be created.
		String S6 = new String("Java"); //1 object will be created in Heap memory
		
		String S7 = ".Net";
		String S8 = "Java"; //0 objects
		
		
	
	

	}

}
