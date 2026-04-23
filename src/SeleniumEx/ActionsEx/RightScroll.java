package SeleniumEx.ActionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement elememnt = driver.findElement(By.id("rt-feature"));
		js.executeScript("arguments[0].scrollLeft += 300;", elememnt);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollLeft -= 300;", elememnt);
		
	}

}
