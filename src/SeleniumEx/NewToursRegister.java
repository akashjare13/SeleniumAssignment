package SeleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		//register
		driver.findElement(By.xpath("//a[text()=\"REGISTER\"]")).click();
		//first name
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Dummy");
		//lastname
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("User");
		//phone number
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9876543210");
		//Email
		driver.findElement(By.id("userName")).sendKeys("dummy@gmail.com");
		//Address
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Thane");
		//city
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Thane");
		//state
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Maharashtra");
		//postal code
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("122345");
		//username
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("DummyUser");
		//password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Dummy123");
		//Confirm password
		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Dummy123");
		//submit button
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(3000);
		//sign in
		driver.findElement(By.xpath("//a[text()=\" sign-in \"]")).click();
		Thread.sleep(3000);
		//User Name
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("DummyUser");
		//Password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Dummy123");
		//submit
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		//login successfully
		String a = driver.findElement(By.xpath("//h3[text()=\"Login Successfully\"]")).getText();
		System.out.println(a);
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
