package SeleniumEx.CheckboxEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaUsingFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(2000);
		
		WebElement plusIcon = driver.findElement(By.xpath("//button[@title=\"Expand all\"]"));
		plusIcon.click();
		Thread.sleep(2000);
		
	/*	List<WebElement> element = driver.findElements(By.xpath("//span[@class=\"rct-checkbox\"]"));
		////span[@class="rct-text"]//span[@class="rct-title"]
	for(int i=0;i<element.size();i++) {
		element.get(i).click();
			Thread.sleep(2000);
		}
		*/
		
		List<WebElement> element = driver.findElements(By.xpath("//span[@class=\"rct-title\"]"));
		for(int i =0;i<element.size();i++) {
			element.get(i).click();
			Thread.sleep(2000);
			if(element.get(i).getText().equalsIgnoreCase("Home")) {
				element.clear();
			}
			else if(element.get(i).getText().equalsIgnoreCase("Desktop")) {
				element.clear();
			}
			else if(element.get(i).getText().equalsIgnoreCase("Documents")) {
				element.clear();
			}
			else if(element.get(i).getText().equalsIgnoreCase("WorkSpace")) {
				element.clear();
			}
			else if(element.get(i).getText().equalsIgnoreCase("Office")) {
				element.clear();
			}
			else if(element.get(i).getText().equalsIgnoreCase("Downloads")) {
				element.clear();
			}
			
			
		Thread.sleep(2000);
			
		}
		Thread.sleep(5000);
		driver.close();

	}

}
