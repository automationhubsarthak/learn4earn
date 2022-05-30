package automation_basics;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Properties_Concept {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream ip;

	public static void main(String[] args) throws Exception {

		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\sarthak\\automation\\automation_basics\\config.properties");
		prop.load(ip);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("xpath1"))).click();
		driver.findElement(By.xpath(prop.getProperty("xpath2"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("xpath3"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("xpath4"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("xpath5"))).click();
		driver.findElement(By.xpath(prop.getProperty("xpath6"))).click();
		Thread.sleep(2000);
		
	if(prop.getProperty("title").equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
		System.out.println("Our Flow is complete");
	}else {
		System.out.println("Something was not right");
	}
		

	}

}
