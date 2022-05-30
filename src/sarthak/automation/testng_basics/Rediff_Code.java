package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Code {
	public static WebDriver driver;
	
	
	@Test
	public static void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void launchRediff() {
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a.signin")).click();
		
	}
	

	@Test
	public void tierDown() {
		driver.close();
	}

}
