package reflections_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Operations op = new Operations();
	/*
	 * op.add(10, 20); op.mul(20, 30); op.div(100, 10); op.diff(100, 90);
	 */
	
	String operation = "div"; //this is a variable whose value is equivalent to one of the method names
	int x = 100;
	int y = 10;
	
	/*
	 * if(operation.equals("add")) op.add(x, y); else if(operation.equals("diff"))
	 * op.diff(x, y); else if(operation.equals("mul")) op.mul(x, y); else
	 * if(operation.equals("div")) op.div(x, y);
	 */
	
	Method m = op.getClass().getMethod(operation, int.class, int.class);
	m.invoke(op, x, y);

	}

}
