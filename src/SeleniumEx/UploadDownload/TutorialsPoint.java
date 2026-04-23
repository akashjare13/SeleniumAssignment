package SeleniumEx.UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		Thread.sleep(2000);
		WebElement uploadFile = driver.findElement(By.id("uploadFile"));
		uploadFile.sendKeys("C:\\Users\\Akash\\Downloads\\flowerimg.jpg");
		Thread.sleep(2000);
		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
