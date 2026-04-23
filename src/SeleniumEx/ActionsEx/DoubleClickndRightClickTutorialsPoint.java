package SeleniumEx.ActionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickndRightClickTutorialsPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()=\"Double Click Me\"]"));
		action.doubleClick(doubleClick).build().perform();
		Thread.sleep(2000);
		WebElement rightClick = driver.findElement(By.xpath("//button[text()=\"Right Click Me\"]"));
		action.contextClick(rightClick).build().perform();
		
		driver.close();
	

	}

}
