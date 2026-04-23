package SeleniumEx.UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		js.executeScript("arguments[0].scrollIntoView();",upload);
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\Akash\\Downloads\\flowerimg.jpg");
		
		
		Thread.sleep(3000);
		driver.close();

	}
}
