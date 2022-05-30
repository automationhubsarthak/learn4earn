package automation_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.cssSelector("a.bmailicon.relative")).click();
		driver.findElement(By.cssSelector(".signin")).click();
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		
		
		
		
		
		
		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.getText(); alert.accept();
		 */
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("seleniumpanda@rediffmail.com");
		/*
		 * driver.findElement(By.linkText("Create Account")).click();
		 * Thread.sleep(2000); driver.findElement(By.
		 * xpath("//table[@id ='tblcrtac']/tbody/tr[3]/child::td[3]/child::input[1]")).
		 * sendKeys("Bineet"); driver.findElement(By.
		 * xpath("//table[@id ='tblcrtac']/tbody/tr[7]/child::td[3]/child::input[1]")).
		 * sendKeys("Binneet@2022"); driver.findElement(By.
		 * xpath("//table[@id ='tblcrtac']/tbody/tr[7]/child::td[3]/child::input[2]")).
		 * click();
		 */


	}

}
