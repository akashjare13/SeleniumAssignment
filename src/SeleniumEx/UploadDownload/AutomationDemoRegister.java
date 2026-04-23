package SeleniumEx.UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		WebElement upload = driver.findElement(By.id("imagesrc"));
		upload.sendKeys("C:\\Users\\Akash\\Downloads\\flowerimg.jpg");
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
