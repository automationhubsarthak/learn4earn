package methods_functions;

public class Method_Concepts {

	//what is a method ? - it is an independent unit of execution. It is kind of like a factory
	//you supply some raw material and you end up getting an end product.
	//types of methods in java?
	//1. User-defined method
	//2. Standard Library Methods
	
	public static void main(String[] args) {
		//main method is where the execution happens
		int m = addNumbers();
		System.out.println(m);
		
		String Str4 = mandeepString();
		System.out.println(Str4);
		
		Method_Concepts objref = new Method_Concepts();
		objref.helloWorld();
		
		bedroom1();
		objref.bedroom();

		locker1();
		objref.locker();
		
	}
	
	//declare a method
	
	//returntype methodName() {
	
      //write your logic
       //}
	
	
	public static int addNumbers() {
		int i = 10;
		int j = 20;
		int sum = i + j;
		return sum;
		
		
		
	}
	
	public static String mandeepString() {
		String Str1 = "Python" ; 
		String Str2 = "Java";
		String Str3 = Str1 + Str2;
		return Str3;
	}
	
	/*
	 * char richChar() { char c1 = '$'; //36 char c2 = 'H'; //72 char c3 = c1 + c2;
	 * //ASCII values return c3; }
	 */
	
	public void helloWorld() {
		System.out.println("Hello to this World of Java");
		
		
	}
	
	//private, protected, default
	
	private void bedroom() {
		System.out.println("This is bedroom private method");
	}
	
	private static void bedroom1() {
		System.out.println("This is a static bedroom private method");
	}
	
	protected void locker() {
		System.out.println("This is locker method");
	}
	
	protected static void locker1() {
		System.out.println("This is static locker method");
	}
	
	//default methods are only allowed in interfaces. Not in Classes
	/*
	 * default static void trying() {
	 * 
	 * }
	 * 
	 * default void trying1() {
	 * 
	 * }
	 */

}
