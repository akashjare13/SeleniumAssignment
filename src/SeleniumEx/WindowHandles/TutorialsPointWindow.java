package SeleniumEx.WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPointWindow {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement newTab = driver.findElement(By.xpath("//button[@title=\"New Tab\"]"));
		js.executeScript("arguments[0].scrollIntoView();",newTab);
		newTab.click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String parentid = its.next();
		String childid = its.next();
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		WebElement newTabText = driver.findElement(By.xpath("(//div[@class=\"container\"])[2]//div[@class=\"row d-flex justify-content-center logindiv bg-white rounded\"]"));
		System.out.println(newTabText.getText());
		System.out.println("New Tab "+ driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parentid);
		Thread.sleep(3000);
		WebElement newWindow = driver.findElement(By.xpath("//button[text()=\"New Window\"]"));
		js.executeScript("arguments[0].scrollIntoView();",newWindow);
		newWindow.click();
		
		driver.switchTo().window(childid);
		WebElement newWindowText = driver.findElement(By.xpath("(//div[@class=\"container\"])[2]"));
		Thread.sleep(2000);
		System.out.println(newWindowText.getText());
		System.out.println("New Window Text "+ driver.getTitle());
		
		driver.quit();

	}

}
