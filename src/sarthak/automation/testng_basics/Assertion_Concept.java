package testng_basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Concept {
//there are 2 kinds of Assertions in TestNG
	//1. Assert or we also call as Hard Assertions
	//2. The other one is SoftAssert
	
	@Test
	public static void a() {
		System.out.println("This is primary test case Part 1");
		System.out.println("This is primary test case Part 2");
		//Assert.fail("Give your reason why you are failing this Test Case");
		Assert.assertTrue(1<=2, "this condition is true"); //TestNG recognizes this as Successful Logic
		Assert.assertFalse(2<=1, "False condition"); //TestNG recognizes this as Successful Logic
		Assert.assertEquals(true, true);//TestNG recognizes this as Successful Logic
		Assert.assertNotEquals(false, true); //TestNG recognizes this as Successful Logic
		
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("The above logic is true");
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public static void b() {
		System.out.println("This is secondary test case");
	}
	
	
	@Test
	public static void c() {
		System.out.println("This is tertiary test case");
	}
	
	@Test
	public static void d() {
		System.out.println("This is quarterly test case");
	}
	
	

}
