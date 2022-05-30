package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("trying@rediff");
		//driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
//		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
//		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
//		driver.findElement(By.xpath("//input[starts-with(@id, 'login')]")).sendKeys("seleniumpanda@rediffmail.com");
//		driver.findElement(By.xpath("//input[@id = 'password' and @name = 'passwd']")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
//		System.out.println(driver.getCurrentUrl());
//		
//Thread.sleep(5000);
//driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
//Thread.sleep(3000);
//System.out.println(driver.getCurrentUrl());
//driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).click();
//System.out.println(driver.getCurrentUrl());

}
	
}
