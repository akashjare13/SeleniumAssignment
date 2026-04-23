package SeleniumEx.ActionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTheElementEbay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://export.ebay.com/in/service-tools/");
		
		Actions action = new Actions(driver);
		
		WebElement serviceTools = driver.findElement(By.xpath("//span[@id=\"top-level-link_2770\"]//span[text()=\"Services & tools\"]"));
		action.moveToElement(serviceTools).build().perform();
		Thread.sleep(2000);
		WebElement shipping = driver.findElement(By.xpath("(//a[text()=\"Shipping\"])[2]"));
		shipping.click();
		
		

	}

}
