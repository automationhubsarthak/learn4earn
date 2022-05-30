package string_operations;

public class Introduction {

	public static void main(String[] args) {
		//1. String is a non primitive data type
		//2. String' size is not fixed
		//3. String is also a sequence of characters
		//4. String is also called Array of Characters
		
		char arr[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		String S1 = new String(arr);
		System.out.println(S1);
		
		char arr1[] = {'!', '@', '#', '$', '%', '^', '&', '*', '9'};
		
		String S2 = new String(arr1);
		System.out.println(S2);
		
		//5.String also acts as a Class. String has a lot of methods too
		
		String S3 = new String();
		
		//6. String is also an immutable object ? very important interview question
		
		String S4 = "Mandy";
		S4 = "Sandy";
		
		
		System.out.println(S4);
		
		//7. Multiple ways to create String Objects
		
		String S5 = new String("HelloWorld");
		String S6 = "Monkey";
		StringBuffer S7 = new StringBuffer();
		StringBuilder S8 = new StringBuilder();
		//StringBuffer S9 = "Donkey";
		//StringBuilder S10 = "Elephant";
		
		
	}

}
