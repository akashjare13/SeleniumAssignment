package SeleniumEx.CheckboxEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPointsUsingFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		
		List<WebElement> plus = driver.findElements(By.xpath("//span[@class=\"plus\"]"));
		for(int i =0;i<plus.size();i++) {
			plus.get(i).click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(int i=0;i<element.size();i++) {
			element.get(i).click();
			Thread.sleep(2000);
		}
		
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
