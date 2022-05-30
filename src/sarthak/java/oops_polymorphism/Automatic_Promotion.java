package oops_polymorphism;

public class Automatic_Promotion {

	public static void main(String[] args) {
		
		Automatic_Promotion ap = new Automatic_Promotion();
		
		ap.display(23l);
		ap.display(10); //this is int I have declared and it is automatically converting to long
		ap.display("Hello");
		ap.display('a'); // so character is automatically converting to integer
	}
	
	public void display(long l) {
		System.out.println("This is a long data type single parameter method");
	}
	
	public void display(String S) {
		System.out.println("This is a String data type single parameter method");
	}
	
	public void display(double d) {
		System.out.println("This is a double data type single parameter method");
	}

}
