package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG_WithValidation {
	public static WebDriver driver;
	//@BeforeMethod and @AfterMethod
    //@Test(enabled = false)
	//Dependencies on methods
	//alwaysRun = true is used when we do not want to make the test case skip. In case it is skipping then also it will run
	//Assertions in TestNG - special validations within TestNG which will make TestNG adhere to Automation Tester's validation technique alongside tester's logic
	
	
	@BeforeClass
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	}

	@Test(priority = 1)
	public void validateLandingPage() {
		Assert.assertEquals(driver.getTitle(),  "Rediff.com: News | Rediffmail | Stock Quotes | Shopping"); 
		
	}

	@Test(priority = 2)
	public void validateSignInLink() {
		Assert.assertFalse(!driver.findElement(By.className("signin")).isEnabled(), "This thing is enabled");
		driver.findElement(By.className("signin")).click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(priority = 3, enabled = false)
	public void validateLoginPage() throws Exception {
		//validateSignInLink();
		//driver.findElement(By.className("signin")).click();	
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Rediffmail";
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test Case with Priority 3 is PASS");
		} else {
			System.out.println("Test Case with Priority 3 is FAIL");
		}
	}
	
	@AfterClass
	public void tierDown() {
		driver.close();
	}
	
}
