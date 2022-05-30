package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Acc_Creation {
	
	public static WebDriver driver;
	public static Select select;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("somethingName");
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("lastnametoo");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("something@example.com");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("31");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1991");
		
	

	}

}
