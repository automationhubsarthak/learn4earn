package selenium_extra_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_New {
	public static WebDriver driver;

	public static void main(String[] args) {
	 driver = WebDriverManager.chromedriver().create();
	//WebDriverManager.chromedriver().setup();
	driver.get("https://www.rediff.com");
	driver.manage().window().maximize();
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");

	}

}
