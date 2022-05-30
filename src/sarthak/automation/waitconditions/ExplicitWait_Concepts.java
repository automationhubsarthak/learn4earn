package waitconditions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Concepts {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.rediff.com");
	     wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	     
	     //signinlink 
	     WebElement check = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'signin']")));
	     System.out.println(check);
	     check.click();
	     
	     //username textbox
	     
	     
	     
	     //password textbox
	     
	     
	     
	     //signinbutton
	     
	     
	     //logoutlink
	     
	     
	     //RediffHomeLink
	    
		
		
		
		
	}
}
