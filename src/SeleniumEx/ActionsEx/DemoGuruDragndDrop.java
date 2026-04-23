package SeleniumEx.ActionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuruDragndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Actions action = new Actions(driver);
		
		WebElement amount = driver.findElement(By.xpath("//li[@id=\"fourth\"]"));
		WebElement amountDebitDesti = driver.findElement(By.xpath("//ol[@id=\"amt7\"]//li"));
		Thread.sleep(2000);
		action.dragAndDrop(amount, amountDebitDesti).build().perform();
		
		WebElement bank = driver.findElement(By.xpath("//li[@id=\"credit2\"]"));
		WebElement bankDebitDesti = driver.findElement(By.xpath("//ol[@id=\"bank\"]//li"));
		Thread.sleep(4000);
		action.dragAndDrop(bank, bankDebitDesti).build().perform();
		
		WebElement sales = driver.findElement(By.xpath("//li[@id=\"credit1\"]"));
		WebElement salesCreditDesti = driver.findElement(By.xpath("//ol[@id=\"loan\"]//li"));
		Thread.sleep(2000);
		action.dragAndDrop(sales, salesCreditDesti).build().perform();
		
		WebElement amountCreditDesti = driver.findElement(By.xpath("//ol[@id=\"amt8\"]//li"));
		Thread.sleep(2000);
		action.dragAndDrop(amount, amountCreditDesti).build().perform();
		
		
		driver.close();
		

	}

}
