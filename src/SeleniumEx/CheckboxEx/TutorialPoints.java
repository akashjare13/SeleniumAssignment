package SeleniumEx.CheckboxEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPoints {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		Thread.sleep(2000);
		//main level 1 
		WebElement mainLevelExtend_1 = driver.findElement(By.xpath("//li[@id=\"bs_1\"]//span[@class=\"plus\"]"));
		mainLevelExtend_1.click();
		Thread.sleep(2000);
		WebElement subLevel1 = driver.findElement(By.xpath("//input[@id=\"c_bf_1\"]"));
		subLevel1.click();
		Thread.sleep(2000);
		WebElement  subLevel2Extend = driver.findElement(By.xpath("(//span[@class=\"plus\"])[2]"));
		subLevel2Extend.click();
		Thread.sleep(2000);
		WebElement lastLevel5 = driver.findElement(By.id("c_io_5"));
		lastLevel5.click();
		Thread.sleep(2000);
		WebElement lastLevel7 = driver.findElement(By.id("c_io_7"));
		lastLevel7.click();
		
		
		//main level 2
		WebElement mainLevelExtend_2 = driver.findElement(By.xpath("//li[@id=\"bs_2\"]//span[@class=\"plus\"]"));
		mainLevelExtend_2.click();
		Thread.sleep(2000);
		
		WebElement mainLevel_2 = driver.findElement(By.id("c_bs_2"));
		mainLevel_2.click();
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
