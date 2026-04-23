package SeleniumEx.DatePickerEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerTutorialsPoint {

	static String expYear = "2020";
	static String expMonth = "June";
	static String expDate = "15";
	static String modeTime = "AM";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		WebElement datePicker  = driver.findElement(By.id("datetimepicker1"));
		datePicker.click();
		
		WebElement year = driver.findElement(By.xpath("(//input[@class=\"numInput cur-year\"])[1]"));
		year.clear();
		Thread.sleep(2000);
		year.sendKeys(expYear);
		
		WebElement month = driver.findElement(By.xpath("(//select[@class=\"flatpickr-monthDropdown-months\"])[1]"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText(expMonth);
		
		List<WebElement> date = driver.findElements(By.xpath("(//div[@class=\"dayContainer\"])[1]//span"));
		for(WebElement ele : date) {
			String actDate = ele.getText();
			if(actDate.equalsIgnoreCase(expDate)) {
				ele.click();
				break;
			}
		}
		
		
		WebElement hours = driver.findElement(By.xpath("(//input[@class=\"numInput flatpickr-hour\"])[1]"));
		hours.clear();
		hours.sendKeys("15");
		Thread.sleep(3000);
		WebElement minutes = driver.findElement(By.xpath("(//input[@class=\"numInput flatpickr-minute\"])[1]"));
		minutes.clear();
		minutes.sendKeys("15");
		Thread.sleep(3000);
		
		WebElement am_pm = driver.findElement(By.xpath("(//span[@class=\"flatpickr-am-pm\"])[1]"));
		String mode = am_pm.getText();
		if(mode.equalsIgnoreCase(modeTime)) {
			System.out.println(mode);
		}
		else
		{
			am_pm.click();
			
		}
		
		
		driver.close();
		
		
		

	}

}
