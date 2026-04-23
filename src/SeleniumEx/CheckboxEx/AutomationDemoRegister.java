package SeleniumEx.CheckboxEx;

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
		
		WebElement cricket = driver.findElement(By.xpath("//input[@value=\"Cricket\"]"));
		cricket.click();
		
		WebElement movies = driver.findElement(By.xpath("//input[@value=\"Movies\"]"));
		boolean display = movies.isDisplayed();
		System.out.println(display);
		movies.click();
		System.out.println(display);
		
		WebElement hockey = driver.findElement(By.xpath("//input[@value=\"Hockey\"]"));
		hockey.click();
		Thread.sleep(2000);
		hockey.click();
		Thread.sleep(2000);
		hockey.click();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
