package collections_concepts;

import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) {
		// Last-in-first-out
		//basic operations are - push and pop
		//three more methods - empty, search and peek
		
		Stack<String> programs = new Stack<String>();
		programs.push("Java");
		programs.push("Python");
		programs.push(".Net");
		programs.push("JavaScript");
		
		System.out.println(programs);
		
		
		
		System.out.println(programs.peek()); //peek method tells which element is on top
		
		//there is a way to make sure the top element goes out and that method is pop
		
		programs.pop(); //so top element is gone
		
		System.out.println(programs);
		
		System.out.println(programs.peek());
		
		programs.pop();
		
		System.out.println(programs);
		
		programs.pop();
		programs.pop();
		
		
		System.out.println(programs.isEmpty());

	}

}
