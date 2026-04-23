package SeleniumEx.ProposalFinderEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ProposalFinderProfessionIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://proposalfinder.com/create-wedding-profile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement professionEditBtn = driver.findElement(By.xpath("//input[@class=\"profession-edit edit section-btn\"]"));
		professionEditBtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement profession = driver.findElement(By.id("cp-profession-type"));
		js.executeScript("arguments[0].removeAttribute('disabled')", profession);
		Select selectProfession = new Select(profession);
		selectProfession.selectByVisibleText("Private Service");
		
		WebElement industry = driver.findElement(By.id("cp-industry-type"));
		js.executeScript("arguments[0].removeAttribute('disabled')", industry);
		Select selectIndustry = new Select(industry);
		selectIndustry.selectByVisibleText("Engineering");
		
		WebElement designation = driver.findElement(By.id("cp-designation-type"));
		js.executeScript("arguments[0].removeAttribute('disabled')", designation);
		Select selectDesignation = new Select(designation);
		selectDesignation.selectByVisibleText("Engineer");
		
		WebElement currencyType = driver.findElement(By.id("cp-currency-type"));
		js.executeScript("arguments[0].removeAttribute('disabled')", currencyType);
		Select selectCurrency = new Select(currencyType);
		selectCurrency.selectByVisibleText("INR - Indian Rupee");
		
		WebElement income = driver.findElement(By.id("cp-income"));
		js.executeScript("arguments[0].removeAttribute('disabled')", income);
		income.sendKeys("1000000");
		
		WebElement firm = driver.findElement(By.id("cp-firm-name"));
		js.executeScript("arguments[0].removeAttribute('disabled')", firm);
		firm.sendKeys("abc pvt ltd");
		
		WebElement yourCity = driver.findElement(By.id("fc-tmc-search-city"));
		yourCity.sendKeys("Thane");
		
		WebElement enteredCity = driver.findElement(By.id("firm_city"));
		js.executeScript("arguments[0].removeAttribute('disabled'); arguments[0].removeAttribute('readonly');" , enteredCity);
		enteredCity.sendKeys("Thane");

	}

}
