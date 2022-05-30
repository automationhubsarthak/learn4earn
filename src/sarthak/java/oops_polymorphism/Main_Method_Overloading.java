package oops_polymorphism;

public class Main_Method_Overloading {

	public static void main(String[] args) {
		System.out.println("This is the method where the control is supposed to be");
		main(10);
		main(args = new String[3], args = new String[4]);
	}
	
	public static void main(int a) {
		System.out.println("this is a main method with int type parameter");
		
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is the main method with multiple String array arguments");
		
	}

}
