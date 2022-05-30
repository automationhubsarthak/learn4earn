package automation_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interface_vs_Class_Reference {

	public static void main(String[] args) {
	   WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new ChromeDriver();
	   
	   WebDriver driver = new FirefoxDriver();
		

	}

}
