package SeleniumEx.ActionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAutomationDragndDropStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Actions action = new Actions(driver);
		WebElement destination = driver.findElement(By.id("droparea"));
		
		WebElement angularSource = driver.findElement(By.id("angular"));
		action.dragAndDrop(angularSource, destination).build().perform();
		
		WebElement mongoSource = driver.findElement(By.id("mongo"));
		action.dragAndDrop(mongoSource, destination).build().perform();
		
		WebElement nodeSource = driver.findElement(By.id("node"));
		action.dragAndDrop(nodeSource, destination).build().perform();	
		
		

	}

}
