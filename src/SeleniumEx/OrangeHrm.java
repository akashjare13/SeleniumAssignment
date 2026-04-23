package SeleniumEx;



import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("admin123");
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()=\" Login \"]"));
		loginBtn.click();
		//Thread.sleep(10000);
		WebElement pim = driver.findElement(By.xpath("//span[text()=\"PIM\"]"));
		pim.click();
		//Thread.sleep(5000);
		WebElement add = driver.findElement(By.xpath("//button[text()=\" Add \"]"));
		add.click();
		//Thread.sleep(5000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstName.sendKeys("Dummy");
		
		WebElement middleName = driver.findElement(By.xpath("//input[@placeholder=\"Middle Name\"]"));
		middleName.sendKeys("Emp");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lastName.sendKeys("loyee");
		
		//file Upload
		
		File file = new File("C:\\Users\\Akash\\Downloads\\flowerimg.jpg");
		WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		//Thread.sleep(2000);
		fileInput.sendKeys(file.getAbsolutePath());
		
		//WebElement saveBtn = driver.findElement(By.xpath("//button[text()=\" Save \"]"));
		//saveBtn.click();
		
		//Thread.sleep(2000);
		//driver.quit();
		

	}

}
