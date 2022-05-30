package testnxml_understanding;

import org.testng.annotations.Test;

@Test(groups = "ClassLevelTest")
public class Groups_Concepts {
	
	@Test(groups = {"windows.sanity"})
	public void tc1() {
		System.out.println("Test Case1 Logic");
	}
	
	@Test(groups = {"sanity", "smoke"})
	public void tc2() {
		System.out.println("Test Case2 Logic");
	}
	
	@Test(groups = {"linux.regression"})
	public void tc3() {
		System.out.println("Test Case3 Logic");
	}
	
	
	@Test(groups = {"sanity", "smoke", "regression", "unit"})
	public void tc4() {
		System.out.println("Test Case4 Logic");
	}
	
	
	@Test(groups = {"sanity", "regression", "unit" , "uat"})
	public void tc5() {
		System.out.println("Test Case5 Logic");
	}

}
