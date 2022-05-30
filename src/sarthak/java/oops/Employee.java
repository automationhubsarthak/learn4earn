package oops;

public class Employee {
	
	String name; //null
	int age;     //0
	int Empid;

	public static void main(String[] args) {
		//20 of you got placed in the same company
		
		Employee emp = new Employee("Harpreet" , 18, 101);
	
		
		Employee emp1 = new Employee("Gundeep" , 18, 102);
		
		
		System.out.println(emp.name + " " + emp.age + " " + emp.Empid);
		System.out.println(emp1.name + " " + emp1.age + " " + emp1.Empid);
		
		}
	
	
	
	
	public Employee(String name, int age, int Empid) {
		this.name = name;
		this.age = age;
		this.Empid = Empid;
		
	}

}
