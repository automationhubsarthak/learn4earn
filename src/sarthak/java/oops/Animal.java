package oops;

public class Animal {

	String color;
	int age;

	public static void main(String[] args) {

		barking();
		Animal.barking();

		Animal romeo = new Animal(); // nomenclature of object reference == some portion of class Name
		romeo.sleeping();
		romeo.guarding();

		romeo.color = "Black";
		romeo.age = 2;
		System.out.println(romeo.color + " " + romeo.age);

		romeo.initializeromeo("Fawn", 6);

		Birds birds = new Birds();
		birds.chirping();
		birds.flying();
		
		Vehicles vehicles = new Vehicles();
		vehicles.brakesApplied();
		vehicles.engineStart();

	}

	public void initializeromeo(String c, int a) {
		color = c;
		age = a;
		System.out.println(color + " " + age);
	}

	public static void barking() {
		System.out.println("Romeo hardly barks");

	}

	public void sleeping() {
		System.out.println("Romeo Sleeps all the time");

	}

	public void guarding() {
		System.out.println("Romeo Guards the hosue");

	}

}

class Birds {

	public void flying() {
		System.out.println("Bird flies");
	}

	public void chirping() {
		System.out.println("Birds Chirp");
	}

}

class Vehicles {
	public void engineStart() {
		System.out.println("Engine Starts");
	}

	public void brakesApplied() {
		System.out.println("Brakes Applied on the vehicle");
	}
}
