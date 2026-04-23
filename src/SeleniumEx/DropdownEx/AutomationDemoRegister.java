package SeleniumEx.DropdownEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//Skill Dropdown
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select selectSkill = new Select(skill);
		selectSkill.selectByVisibleText("Android");
		Thread.sleep(2000);
		selectSkill.selectByValue("Certifications");
		Thread.sleep(2000);
		selectSkill.selectByIndex(5);
		
		/*
		//Country Dropdown
		
		WebElement country = driver.findElement(By.id("countries"));
		
		Select selectCountry = new Select(country);
		selectCountry.selectByValue("");
		
		*/
		
		//year Dropdown
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select selectyear = new Select(year);
		
		selectyear.selectByValue("1997");
		
		//month dropdown
		WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select selectmonth = new Select(month);
		
		selectmonth.selectByVisibleText("November");
		
		
		//day dropdown
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select selectday = new Select(day);
		
		selectday.selectByIndex(15);
		
		
		Thread.sleep(2000);
		driver.close();
		   
		
		
		

	}

}
