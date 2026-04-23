package SeleniumEx.AlertsEx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		/*
		WebElement switchToBtn = driver.findElement(By.xpath("//a[text()=\"SwitchTo\"]"));
		switchToBtn.click();
		Thread.sleep(2000);
		
		WebElement alertsBtn = driver.findElement(By.xpath("//a[text()=\"Alerts\"]"));
		alertsBtn.click();
		Thread.sleep(2000);
		*/
		WebElement alertOk = driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an')]"));
		alertOk.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement alertOkCancel = driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		alertOkCancel.click();
		Thread.sleep(2000);
		WebElement alertOkCancelBtn = driver.findElement(By.xpath("//button[contains(text(), 'click the button to display a confirm box')]"));
		alertOkCancelBtn.click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		WebElement alertTextBox = driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]"));
		alertTextBox.click();
		Thread.sleep(2000);
		WebElement alertConfirmBox = driver.findElement(By.xpath("//button[contains(text(), 'click the button to demonstrate the prompt box ')]"));
		alertConfirmBox.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Testing alerts");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Akash\\Downloads\\ScreenshotCapture\\Screenshot.png"));
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		

	}

}
