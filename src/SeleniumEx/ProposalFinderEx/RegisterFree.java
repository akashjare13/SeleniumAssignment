package SeleniumEx.ProposalFinderEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proposalfinder.com/create-wedding-profile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//Register Free
		WebElement gender = driver.findElement(By.id("register-gender"));
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Male");
		WebElement firstName = driver.findElement(By.id("reg-fname"));
		firstName.sendKeys("Dummy");
		WebElement lastName = driver.findElement(By.id("reg-lname"));
		lastName.sendKeys("user");
		WebElement selectReli = driver.findElement(By.xpath("(//select[@id=\"cp-religion\"])[2]"));
		Select selectReligion = new Select(selectReli);
		selectReligion.selectByVisibleText("Hindu");
		//WebElement selectCast = driver.findElement(By.xpath("(//select[@id=\"cp-caste\"])[2]"));
		//Select selectCastStatus = new Select(selectCast);
		//selectCastStatus.selectByIndex(2);
		WebElement dobBtn = driver.findElement(By.id("tmc-dob-btn"));
		dobBtn.click();
		WebElement selectDay = driver.findElement(By.id("reg-dob-day"));
		Select selectDobDay = new Select(selectDay);
		selectDobDay.selectByVisibleText("11");
		WebElement selectMonth = driver.findElement(By.id("reg-dob-month"));
		Select selectDobMonth = new Select(selectMonth);
		selectDobMonth.selectByVisibleText("Aug");
		WebElement selectYear = driver.findElement(By.id("reg-dob-year"));
		Select selectDobYear = new Select(selectYear);
		selectDobYear.selectByVisibleText("2000");
		WebElement setBtn = driver.findElement(By.id("set-dob-btn"));
		setBtn.click();
		WebElement motherTongue = driver.findElement(By.id("filter-lang"));
		motherTongue.sendKeys("Mar");
		WebElement selectLang = driver.findElement(By.xpath("//li[@class=\"cplang_li_\"]//label[text()=\"Marathi\"]"));
		selectLang.click();
		//List<WebElement> language = driver.findElements(By.id("//li[@class=\"cplang_li_\"]//label"));
		/*for(WebElement lang : language) {
			if(lang.getText().equalsIgnoreCase("Marathi")) {;
			lang.click();
			break;
			}
		}
		*/
		WebElement mobileNo = driver.findElement(By.id("reg-mobile"));
		mobileNo.sendKeys("9876543210");
		WebElement email = driver.findElement(By.id("reg-email"));
		email.sendKeys("dummyuser@gmail.com");
		WebElement password = driver.findElement(By.id("reg-password"));
		password.sendKeys("DummyUser11");
		WebElement currentCity = driver.findElement(By.id("tmc-search-city"));
		currentCity.sendKeys("Thane");
		WebElement currentCityFind = driver.findElement(By.xpath("//label[text()=\"Thane, India\"]"));
		currentCityFind.click();
		WebElement selectMarital = driver.findElement(By.id("reg-mstatus"));
		Select selectStatus = new Select(selectMarital);
		selectStatus.selectByVisibleText("Unmarried");
		WebElement selectComplex = driver.findElement(By.id("reg-complexion"));
		Select selectComplexion = new Select(selectComplex);
		selectComplexion.selectByVisibleText("Fair");
		WebElement selectHeight = driver.findElement(By.id("reg-height"));
		Select selectHeighFeet = new Select(selectHeight);
		selectHeighFeet.selectByVisibleText("5 ft 4 inch");
		//WebElement registerBtn = driver.findElement(By.id("basic-info-part-1"));
		//registerBtn.click();
		
		
		
		
		
		
		
		
		
		

	}

}
