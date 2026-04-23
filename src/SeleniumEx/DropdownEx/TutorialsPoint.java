package SeleniumEx.DropdownEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.id("state"));
		Select selectState = new Select(state);
		
		selectState.selectByVisibleText("Rajasthan");
		Thread.sleep(2000);
		selectState.selectByValue("NCR");
		Thread.sleep(2000);
		
		
		WebElement city = driver.findElement(By.id("city"));
		Select selectCity = new Select(city);
		
		selectCity.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		

	}

}
