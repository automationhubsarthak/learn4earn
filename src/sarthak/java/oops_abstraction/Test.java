package oops_abstraction;

public class Test extends Student{

	public static void main(String[] args) {
		
		// Student stud = new Student(); //cannot create the object of an abstract class
		
		//a normal class can extend an abstract class but it has to create the body of the unimplemented methods of the ab class
		
		Test test = new Test();
		test.studentElection();
		test.studentExam();
		test.studentLibrary();
	
		
		Student stud = new Test();
		
	}

	@Override
	public void studentElection() {
		System.out.println("this is the studentElection method which has been overridden from the abstract class");
		
	}

	@Override
	public void studentExam() {
		System.out.println("this is the studentExam method which has been overridden from the abstract class");
		
	}

}
