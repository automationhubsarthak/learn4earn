package testng_basics;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContext_Concepts {
	
	@Test(priority=1)
	public void init(ITestContext context) {
		context.setAttribute("OpeningBrowser", "Chrome");
		
	}
	
	@Test
	public void loginCred(ITestContext context) {
	String Task = (String)context.getAttribute("OpeningBrowser");	
	System.out.println(Task);
	context.setAttribute("Username", Task);
	}
	
	@Test
	public void exit(ITestContext context) {
		String combo = (String)context.getAttribute("Username");
		String combo1 = (String)context.getAttribute("OpeningBrowser");
		System.out.println(combo + " " + combo1);
	}

}
