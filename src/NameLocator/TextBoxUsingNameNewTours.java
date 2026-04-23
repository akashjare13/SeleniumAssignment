package NameLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxUsingNameNewTours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
