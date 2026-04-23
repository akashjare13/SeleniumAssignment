package SeleniumEx.RadioButtonEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Thane");
		
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		maleRadioBtn.click();
		
		boolean enable = maleRadioBtn.isEnabled();
		System.out.println(enable);
		
		boolean display = maleRadioBtn.isDisplayed();
		System.out.println(display);
		
		boolean selected = maleRadioBtn.isSelected();
		System.out.println(selected);
		
		
		WebElement maleRadioBtnText = driver.findElement(By.xpath("//label[text()=\" Male \"]"));
		maleRadioBtnText.click();
		String maleText = maleRadioBtnText.getText();
		System.out.println(maleText);
		
		String maleTagName = maleRadioBtnText.getTagName();
		System.out.println(maleTagName);
		
		String maleAttribute = maleRadioBtn.getAttribute("value");
		System.out.println(maleAttribute);
		
		Dimension dimension = maleRadioBtnText.getSize();
		System.out.println("Height "+ dimension.height + " Width "+ dimension.width);
		
		
		
		System.out.println("**************");
		
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		femaleRadioBtn.click();
		
		boolean enable1 = femaleRadioBtn.isEnabled();
		System.out.println(enable1);
		
		boolean display1 = femaleRadioBtn.isDisplayed();
		System.out.println(display1);
		
		Thread.sleep(3000);
		
		boolean selected1 = femaleRadioBtn.isSelected();
		System.out.println(selected1);
		
		
		
		WebElement femaleRadioBtnText = driver.findElement(By.xpath("//label[text()=\" FeMale\"]"));
		femaleRadioBtnText.click();
		String femaleText = femaleRadioBtnText.getText();
		System.out.println(femaleText);
		
		String femaleTagName = femaleRadioBtnText.getTagName();
		System.out.println(femaleTagName);
		
		String femaleAttribute = femaleRadioBtn.getAttribute("value");
		System.out.println(femaleAttribute);
		
		Dimension dimension1 = femaleRadioBtnText.getSize();
		System.out.println("Height "+ dimension1.height + " Width "+ dimension1.width);
		
		
		
		
		
		driver.close();
		
		
		
		

	}

}
