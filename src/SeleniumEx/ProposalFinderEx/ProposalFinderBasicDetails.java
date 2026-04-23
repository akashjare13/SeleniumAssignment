package SeleniumEx.ProposalFinderEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProposalFinderBasicDetails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proposalfinder.com/create-wedding-profile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement basicDetailsEdit = driver.findElement(By.xpath("(//input[@value=\"Edit\"])[1]"));
		basicDetailsEdit.click();
		
		WebElement firstName = driver.findElement(By.id("cp-fname"));
		firstName.sendKeys("Dummy");
		
		WebElement middleName = driver.findElement(By.id("cp-mname"));
		middleName.sendKeys("user");
		//Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.id("cp-lname"));
		lastName.sendKeys("12");
		//Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement gender = driver.findElement(By.id("cp-gender"));
		js.executeScript("arguments[0].removeAttribute('disabled')", gender);
		
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Male");
		WebElement religion = driver.findElement(By.id("cp-religion"));
		js.executeScript("arguments[0].removeAttribute('disabled')", religion);
		Select selectReligion = new Select(religion);
		selectReligion.selectByVisibleText("Hindu");
		WebElement caste = driver.findElement(By.id("cp-caste"));
		js.executeScript("arguments[0].removeAttribute('disabled')", caste);
		Select selectCaste = new Select(caste);
		selectCaste.selectByVisibleText("96 Kuli");
		WebElement livingTogether = driver.findElement(By.id("cp-hc-living-together"));
		js.executeScript("arguments[0].removeAttribute('disabled')", livingTogether);
		Select selectLiving = new Select(livingTogether);
		selectLiving.selectByVisibleText("No");
		WebElement maritalStatus = driver.findElement(By.id("cp-mstatus"));
		Select selectStatus = new Select(maritalStatus);
		selectStatus.selectByValue("A");
		selectStatus.selectByVisibleText("Unmarried");
		//Thread.sleep(2000);
		WebElement motherTongue = driver.findElement(By.id("cp-mothertongue"));
		Select selectMotherTongue = new Select(motherTongue);
		selectMotherTongue.selectByValue("35");
		//Thread.sleep(2000);
		WebElement height = driver.findElement(By.id("cp-height"));
		Select selectHeight = new Select(height);
		selectHeight.selectByVisibleText("5 ft 4 inch");
		//Thread.sleep(2000);
		WebElement complexion = driver.findElement(By.id("cp-complexion"));
		Select selectComplexion = new Select(complexion);
		selectComplexion.selectByVisibleText("Fair");
		//Thread.sleep(2000);
		WebElement diet = driver.findElement(By.id("cp-diet"));
		Select selectDiet = new Select(diet);
		selectDiet.selectByIndex(3);
		//Thread.sleep(2000);
		WebElement weigth = driver.findElement(By.id("cp-weight"));
		weigth.sendKeys("50");
		WebElement graduationType = driver.findElement(By.id("cp-gtype"));
		js.executeScript("arguments[0].removeAttribute('disabled')", graduationType);
		Select selectGraduationType = new Select(graduationType);
		selectGraduationType.selectByVisibleText("Graduate");
		WebElement bodyType = driver.findElement(By.id("cp-body-type"));
		js.executeScript("arguments[0].removeAttribute('disabled')", bodyType);
		Select selectBodyType = new Select(bodyType);
		selectBodyType.selectByVisibleText("Average");
		//Thread.sleep(2000);
		WebElement bloodGroup = driver.findElement(By.id("cp-bgroup"));
		js.executeScript("arguments[0].removeAttribute('disabled')", bloodGroup);
		Select selectBloodGroup = new Select(bloodGroup);
		selectBloodGroup.selectByVisibleText("A+ve");
		WebElement hiv = driver.findElement(By.id("cp-hiv"));
		js.executeScript("arguments[0].removeAttribute('disabled')", hiv);
		Select selectHivStatus = new Select(hiv);
		selectHivStatus.selectByVisibleText("HIV Not Affected");
		WebElement challenged = driver.findElement(By.id("cp-challenged"));
		js.executeScript("arguments[0].removeAttribute('disabled')", challenged);
		Select selectChallengedStatus = new Select(challenged);
		selectChallengedStatus.selectByVisibleText("No");
		WebElement diseased = driver.findElement(By.id("cp-diseased"));
		js.executeScript("arguments[0].removeAttribute('disabled')", diseased);
		Select selectDiseasedStatus = new Select(diseased);
		selectDiseasedStatus.selectByVisibleText("No");
		WebElement smoking = driver.findElement(By.id("cp-smoking"));
		js.executeScript("arguments[0].removeAttribute('disabled')", smoking);
		Select selectSmokingStatus = new Select(smoking);
		selectSmokingStatus.selectByVisibleText("No");
		WebElement drinking = driver.findElement(By.id("cp-drinking"));
		js.executeScript("arguments[0].removeAttribute('disabled')", drinking);
		Select selectDrinkingStatus = new Select(drinking);
		selectDrinkingStatus.selectByVisibleText("No");
		WebElement currentCity = driver.findElement(By.id("cc-tmc-search-city"));
		currentCity.sendKeys("Thane");
		//Thread.sleep(2000);
		WebElement homeCity = driver.findElement(By.id("hc-tmc-search-city"));
		homeCity.sendKeys("Thane");
		//Thread.sleep(2000);
		
		
		
		//driver.close();
		
		
		

	}

}
