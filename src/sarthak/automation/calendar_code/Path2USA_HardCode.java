package calendar_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Path2USA_HardCode {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("datepicker-days")));
		
		String MonthYear = driver.findElement(By.className("datepicker-switch")).getText();
		System.out.println(MonthYear);
		
		String month = MonthYear.split(" ")[0].trim();
		String year = MonthYear.split(" ")[1].trim();
		
		while(!(month.equals("July") && year.equals("2024"))){
			Thread.sleep(1000);
			driver.findElement(By.className("next")).click();
			MonthYear = driver.findElement(By.className("datepicker-switch")).getText();
			month = MonthYear.split(" ")[0].trim();
			year = MonthYear.split(" ")[1].trim();
			
		}
		
		driver.findElement(By.xpath("//td[text() = '21']")).click();
	}

}