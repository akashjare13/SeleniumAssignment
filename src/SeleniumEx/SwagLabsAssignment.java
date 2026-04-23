package SeleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwagLabsAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
		//first item add to cart
		driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]")).click();
		Thread.sleep(5000);
		//second item title
		driver.findElement(By.xpath("(//div[@class=\"inventory_item_name \"])[2]")).click();
		Thread.sleep(5000);
		//add to cart
		driver.findElement(By.xpath("//button[@name=\"add-to-cart\"]")).click();
		Thread.sleep(5000);
		
		//Back to products
		driver.findElement(By.xpath("//button[@name=\"back-to-products\"]")).click();
		Thread.sleep(5000);
		
		//Add to cart button
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(5000);
		//checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		//First name
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Abc");
		Thread.sleep(2000);
		
		//last name
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Xyz");
		Thread.sleep(2000);
		
		//zip code
		driver.findElement(By.xpath("//input[@placeholder=\"Zip/Postal Code\"]")).sendKeys("123456");
		Thread.sleep(2000);
		//continue
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		//finish
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		//back-to-home
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
		//menu button
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		//logout
		driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
