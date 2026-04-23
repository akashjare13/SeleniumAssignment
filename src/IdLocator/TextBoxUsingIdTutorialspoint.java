package IdLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxUsingIdTutorialspoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.findElement(By.id("fullname")).sendKeys("ABC");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("address")).sendKeys("Xyz, ABC");
		driver.findElement(By.id("password")).sendKeys("Abcxyz");
		
		Thread.sleep(3000);
		driver.findElement(By.className("btn-primary")).click();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
