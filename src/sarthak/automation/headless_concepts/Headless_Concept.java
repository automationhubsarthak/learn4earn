package headless_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Concept {

	public static WebDriver driver;
	public static ChromeOptions options;
	public static FirefoxOptions options1;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		//options.addArguments("headless");
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebDriverManager.firefoxdriver().setup();
		options1 = new FirefoxOptions();
		options1.addArguments("--headless");
		//options1.setHeadless(true);
		driver = new FirefoxDriver(options1);
		driver.get("https://skyscanner.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
