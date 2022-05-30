package oop_inheritance;

public class Child extends Parent { // IS - A relationship

	public static void main(String[] args) {
		Child child = new Child();
		child.sportsbike();
		child.guitar();
		child.bungalow();
		child.FarmLands();
		child.vintageCar();
		child.haveli();

		Parent parent = new Parent();
		parent.bungalow();
		parent.FarmLands();
		parent.haveli();
		parent.vintageCar();

		GrandParent gp = new GrandParent();

	}

	public void sportsbike() {
		System.out.println("Child's sportsbike");
	}

	public void guitar() {
		System.out.println("Child's guitar");

	}

}
