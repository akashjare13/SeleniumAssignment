package SeleniumEx.DatePickerEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemoGuru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		
		WebElement dateInput = driver.findElement(By.xpath("//input[@type=\"datetime-local\"]"));
        //dateInput.click();
        Thread.sleep(2000);
        //dateInput.sendKeys("2026-02-05T15:45");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
        		//yyyy-mm-dd h:mm
            "arguments[0].value='2011-11-15T11:11'",
            dateInput
        );
        
     // WebElement submitBtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
       //submitBtn.click();
        
   
		
		
		

	}

}
