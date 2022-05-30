package automation_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.category-cards > div:nth-of-type(3)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text() = 'Alerts'][@class = 'text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button#timerAlertButton")).click();
		Thread.sleep(6000);
		Alert alert = driver.switchTo().alert();
		System.out.println("The text inside the alert is:" + alert.getText());
		alert.accept();
	
	}

}
