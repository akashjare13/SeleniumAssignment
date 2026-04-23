package SeleniumEx.RadioButtonEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPoints {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		
		Thread.sleep(2000);
		//Yes Radio Button
		WebElement yesRadioBtn = driver.findElement(By.xpath("//input[@value=\"igottwo\"]"));
		yesRadioBtn.click();
		
		boolean enable = yesRadioBtn.isEnabled();
		System.out.println(enable);
		
		boolean display = yesRadioBtn.isDisplayed();
		System.out.println(display);
		
		boolean selected = yesRadioBtn.isSelected();
		System.out.println(selected);
		
		WebElement yesRadioText = driver.findElement(By.xpath("//label[text()=\"Yes\"]"));
		String yesText = yesRadioText.getText();
		System.out.println(yesText);
		
		String yesTagName = yesRadioBtn.getTagName();
		System.out.println(yesTagName);
		
		String yesAttribute = yesRadioBtn.getAttribute("value");
		System.out.println(yesAttribute);
		
		Dimension dimension = yesRadioBtn.getSize();
		System.out.println("Height "+ dimension.height + " Width "+ dimension.width);
		
		System.out.println("**************************");
		//Impressive Radio Button
		
		WebElement impressiveRadioBtn = driver.findElement(By.xpath("//input[@value=\"igotthree\"]"));
		impressiveRadioBtn.click();
		
		boolean enable1 = impressiveRadioBtn.isEnabled();
		System.out.println(enable1);
		
		boolean display1 = impressiveRadioBtn.isDisplayed();
		System.out.println(display1);
		
		boolean selected1 = impressiveRadioBtn.isSelected();
		System.out.println(selected1);
		
		WebElement impressiveRadioText = driver.findElement(By.xpath("//label[text()=\"Impressive\"]"));
		String impressiveText = impressiveRadioText.getText();
		System.out.println(impressiveText);
		
		String impressiveTagName = impressiveRadioBtn.getTagName();
		System.out.println(impressiveTagName);
		
		String impressiveAttribute = impressiveRadioBtn.getAttribute("value");
		System.out.println(impressiveAttribute);
		
		Dimension dimension1 = impressiveRadioBtn.getSize();
		System.out.println("Height "+ dimension1.height + " Width "+ dimension1.width);
		
		
		System.out.println("**************************");
		//No Radio Button
		
		WebElement noRadioBtn = driver.findElement(By.xpath("//input[@value=\"option3\"]"));
		//noRadioBtn.click();
		
		boolean enable2 = noRadioBtn.isEnabled();
		System.out.println(enable2);
		
		boolean display2 = noRadioBtn.isDisplayed();
		System.out.println(display2);
		
		boolean selected2 = noRadioBtn.isSelected();
		System.out.println(selected2);
		
		WebElement noRadioText = driver.findElement(By.xpath("//label[text()=\"No (Disable)\"]"));
		String noText = noRadioText.getText();
		System.out.println(noText);
		
		String noTagName = noRadioBtn.getTagName();
		System.out.println(noTagName);
		
		String noAttribute = noRadioBtn.getAttribute("value");
		System.out.println(noAttribute);
		
		Dimension dimension2 = noRadioText.getSize();
		System.out.println("Height "+ dimension2.height + " Width "+ dimension2.width);
		
		Thread.sleep(2000);
		driver.close();

	}

}
