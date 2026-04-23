package SeleniumEx.WindowHandles;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement newTab = driver.findElement(By.id("tabButton"));
		js.executeScript("arguments[0].scrollIntoView();",newTab);
		newTab.click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String parentid = its.next();
		String childid = its.next();
		
		driver.switchTo().window(childid);
		WebElement newTabText = driver.findElement(By.id("sampleHeading"));
		System.out.println(newTabText.getText());
		//System.out.println("New Tab "+ driver.getTitle());
		
		driver.switchTo().window(parentid);
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		js.executeScript("arguments[0].scrollIntoView();",newWindow);
		newWindow.click();
		
		driver.switchTo().window(childid);
		WebElement newWindowText = driver.findElement(By.id("sampleHeading"));
		System.out.println(newWindowText.getText());
		//System.out.println("New Window Text "+ driver.getTitle());
		
		driver.switchTo().window(parentid);
		
		WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
		js.executeScript("arguments[0].scrollIntoView();",newWindowMessage);
		newWindowMessage.click();
		
		Set<String> windowhandles =driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowhandles);
		System.out.println(handles.size());
		
		driver.switchTo().window(handles.get(3));
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement newWindowMessageText = driver.findElement(By.xpath("//body"));
		System.out.println(newWindowMessageText.getText());
		//System.out.println("New Window message Text "+ driver.getTitle());
		
		driver.switchTo().window(handles.get(0));
		
		driver.quit();
		
		
		
		
		

	}

}
