package SeleniumEx.ActionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAutomationDragndDropDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Dynamic.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Actions action = new Actions(driver);
		WebElement angularSource = driver.findElement(By.id("angular"));
		Thread.sleep(2000);
		WebElement destinationAngular = driver.findElement(By.id("droparea"));
		action.dragAndDrop(angularSource, destinationAngular).build().perform();
	
		
		WebElement mongoSource = driver.findElement(By.id("mongo"));
		WebElement destinationMongo = driver.findElement(By.id("droparea"));
		action.dragAndDrop(mongoSource, destinationMongo).build().perform();
		
		WebElement nodeSource = driver.findElement(By.id("node"));
		WebElement destinationNode = driver.findElement(By.id("droparea"));
		action.dragAndDrop(nodeSource, destinationNode).build().perform();	

		driver.close();
	}

}
