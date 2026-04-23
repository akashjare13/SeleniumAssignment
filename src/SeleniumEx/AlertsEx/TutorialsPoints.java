package SeleniumEx.AlertsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPoints {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		WebElement alertBtn = driver.findElement(By.xpath("//button[text()=\"Alert\"]"));
		alertBtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement confirmBtn = driver.findElement(By.xpath("//label[contains(text(),'On button click, confirm box will appear')]/following-sibling::button"));
		confirmBtn.click();
		Thread.sleep(2000);
		String text =driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		WebElement promptBox = driver.findElement(By.xpath("//label[contains(text(),'On button click, prompt box will appear')]/following-sibling::button"));
		promptBox.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Test");
		Thread.sleep(3000);
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
