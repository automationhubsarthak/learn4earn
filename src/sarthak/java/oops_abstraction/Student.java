package oops_abstraction;

public abstract class Student {
	
	private String name;
	int stu_id;
	
	//in abstract class abstract methods are there
	//methods which do not have a body are abstract methods
	
	public abstract void studentElection(); //this is an abstract method which will reside only in an abstract class
	                                        // an abstract method cannot reside inside a normal class
	
	//can a normal method reside in an abstract class ? YES
	
	public void studentLibrary() {
		System.out.println("This is the normal student library method inside an abstract class");
	}
	
	public abstract void studentExam();
	

}
