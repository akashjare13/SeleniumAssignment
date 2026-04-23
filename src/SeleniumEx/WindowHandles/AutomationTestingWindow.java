package SeleniumEx.WindowHandles;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		WebElement tabWindow = driver.findElement(By.xpath("//div[@id=\"Tabbed\"]//button[@class=\"btn btn-info\"]"));
		tabWindow.click();
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String parentid = its.next();
		String childid = its.next();
	
		
    driver.switchTo().window(childid);
	Thread.sleep(2000);
	driver.switchTo().window(parentid);
	
	WebElement seprateWindow = driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]"));
	seprateWindow.click();
	
	WebElement seperateWindowOkBtn = driver.findElement(By.xpath("//div[@id=\"Seperate\"]//button"));
	seperateWindowOkBtn.click();
	Thread.sleep(2000);
    driver.switchTo().window(childid);
	Thread.sleep(2000);
	driver.switchTo().window(parentid);
	

	WebElement e = driver.findElement(By.xpath("//a[text()=\"Open Seperate Multiple Windows\"]"));
			e.click();
	
	Thread.sleep(2000);
	WebElement f = driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[2]"));
			f.click();
	
	Set<String> windowhandles =driver.getWindowHandles();
	List<String> handles = new ArrayList<String>();
	handles.addAll(windowhandles);
	System.out.println(handles.size());
	
	Thread.sleep(3000);
	
	driver.switchTo().window(handles.get(3));
	Thread.sleep(4000);
	//driver.switchTo().window(handles.get(0));
	
	Thread.sleep(3000);
	driver.quit();
		
		

	}

}
