package actions_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Operations {
	public static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://jqueryui.com/draggable/");
	driver.get("https://jqueryui.com/droppable/");
	
	//WebElement target = driver.findElement(By.id("spnMyAcc"));
	
	
	  Actions action = new Actions(driver); 
	  //action.moveToElement(target).perform();
	 
	
	List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
	System.out.println(totalframes.size());
	
	
	driver.switchTo().frame(0);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	//action.dragAndDropBy(source, 200, 200).perform();
	
	action.dragAndDrop(source, target).perform();
	
	
	

	}

}
