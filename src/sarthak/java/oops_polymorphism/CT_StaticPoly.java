package oops_polymorphism;

public class CT_StaticPoly {

	public static void main(String[] args) {

		CT_StaticPoly obj = new CT_StaticPoly();
		obj.show();
		obj.show(1);
		obj.show(2, 3);
		obj.show(2, 3, 4);
		obj.show("automation");
		obj.show("automation", "selenium");
		obj.show(new StringBuffer("Python"));
		obj.show(new StringBuilder("PHP"));
		obj.show(obj);
		obj.show(obj, obj);
	}

	public void show() {
		System.out.println("This is a simple method with no parameters");
	}

	public void show(int i) {
		System.out.println("This is a method with one int type parameter");
	}

	public void show(int i, int j) {
		System.out.println("This is a method with two int type parameters");
	}

	public void show(int i, int j, int k) {
		System.out.println("This is a method with three int type parameters");
	}

	public void show(String S) {
		System.out.println("This is a method with one String type parameter");
	}
	
	public void show(String S, String S1) {
		System.out.println("This is a method with two String type parameters");
	}
	
	public void show(StringBuffer S2) {
		System.out.println("This is a StringBuffer method");
	}
	
	public void show(StringBuilder S3) {
		System.out.println("This is a StringBuilder method");
	}
	
	public Object show(Object obj) {
		System.out.println("This is Object Class");
		return null;
	}
	
	public Object show(Object obj, Object obj1) {
		System.out.println("This is Object Class with 2 params");
		return null;
	}

}
