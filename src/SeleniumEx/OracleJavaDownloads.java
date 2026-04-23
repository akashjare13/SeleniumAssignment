package SeleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleJavaDownloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		WebElement windows = driver.findElement(By.id("rt01tab1-jdk25-windows"));
		windows.click();
		Thread.sleep(2000);
		WebElement javaDownload = driver.findElement(By.xpath("//a[text()=\"https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe\"]"));
		javaDownload.click();
		System.out.println(javaDownload.getText());
		
		Thread.sleep(4000);
		driver.close();

		
	}

}
