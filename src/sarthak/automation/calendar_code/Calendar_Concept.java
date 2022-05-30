package calendar_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_Concept {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		new WebDriverWait(driver, Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		selectDate("29" , "February" , "2024");

	}
	
public static void selectDate(String expectedDay, String expectedMonth, String expectedYear) throws Exception {
		
	
	  if(expectedMonth.equals("February") && Integer.parseInt(expectedDay)>29) 
	  {
	  System.out.println("Wrong Date :" + expectedMonth + " : " + expectedDay);
	  return; 
	  }
	  
	  if(Integer.parseInt(expectedDay) > 31) 
	  { 
	   System.out.println("Wrong Date :" + expectedMonth + " : " + expectedDay); 
	   return; 
	  }
	 
		
		String MonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(MonthYear);
		
		while(!getMonthYear(MonthYear)[0].equals(expectedMonth) 
				&& 
			   getMonthYear(MonthYear)[1].equals(expectedYear)){
			Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title = 'Next']")).click();
		MonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		try {
		driver.findElement(By.xpath("//a[text() = '" + expectedDay + "']")).click();
		}catch (Exception e) {
			System.out.println("Wrong Date :" + expectedMonth + " : " + expectedDay); 
		}
		//driver.close();
	}
	
	public static String[] getMonthYear(String MonthYear) {
		return MonthYear.split(" ");
	}


}
