package IdLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxUsingIdDemoQa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("ABC");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Abc xyz aksjd");
		driver.findElement(By.id("permanentAddress")).sendKeys("askddnscnsc");
		//driver.findElement(By.id("submit")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
