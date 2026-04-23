package SeleniumEx.RadioButtonEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		WebElement flightBtn= driver.findElement(By.xpath("//a[text()=\"Flights\"]"));
		flightBtn.click();
		
		
		//Round Trip radio button
		WebElement roundTrip = driver.findElement(By.xpath("//input[@value=\"roundtrip\"]"));
		roundTrip.click();
		
		boolean enable = roundTrip.isEnabled();
		System.out.println(enable);
		
		boolean display = roundTrip.isDisplayed();
		System.out.println(display);
		
		boolean selected = roundTrip.isSelected();
		System.out.println(selected);
		
		WebElement roundTripText = driver.findElement(By.xpath("//font[contains(normalize-space(.), 'Round Trip')]"));
		String roundTriptext = roundTripText.getText();
		String round = roundTriptext.substring(0, roundTriptext.indexOf("One Way")).trim();
		System.out.println(roundTriptext);
		System.out.println(round);
		
		String roundTripTagName = roundTrip.getTagName();
		System.out.println(roundTripTagName);
		
		String roundTripAttribute = roundTrip.getAttribute("value");
		System.out.println(roundTripAttribute);
		
		Dimension dimension = roundTrip.getSize();
		System.out.println("Height "+ dimension.height + " Width "+ dimension.width);
		
		
		
		System.out.println("*********************************");

		
		//OneWay Radio Button
		WebElement oneWay = driver.findElement(By.xpath("//input[@value=\"oneway\"]"));
		oneWay.click();
		
		boolean enable1 = oneWay.isEnabled();
		System.out.println(enable1);
		
		boolean display1 = oneWay.isDisplayed();
		System.out.println(display1);
		
		boolean selected1 = oneWay.isSelected();
		System.out.println(selected1);
		
		
		WebElement oneWayText = driver.findElement(By.xpath("//font[contains(normalize-space(.), 'One Way')]"));
		String oneWaytext = oneWayText.getText();
		System.out.println(oneWaytext);
		int index = oneWaytext.indexOf("One Way");
		String oneWayTextOnly = oneWaytext.substring(index).trim();
		System.out.println(oneWayTextOnly);
		
		
		String oneWayTagName = oneWay.getTagName();
		System.out.println(oneWayTagName);
		
		String oneWayAttribute = oneWay.getAttribute("value");
		System.out.println(oneWayAttribute);
		
		Dimension dimension1 = oneWay.getSize();
		System.out.println("Height "+ dimension1.height + " Width "+ dimension1.width);
		
		System.out.println("*************************");
		
		
		//Economy Class
		WebElement economyClass = driver.findElement(By.xpath("//input[@value=\"Coach\"]"));
		economyClass.click();
		
		boolean enable2 = economyClass.isEnabled();
		System.out.println(enable2);
		
		boolean display2 = economyClass.isDisplayed();
		System.out.println(display2);
		
		boolean selected2 = economyClass.isSelected();
		System.out.println(selected2);
		
		
		WebElement economyText = driver.findElement(By.xpath("//font[contains(text(),\"Economy class\")]"));
		String economyClassText = economyText.getText().split("\n")[0].trim();
		System.out.println(economyClassText);
		
		String economyClassTagName = economyClass.getTagName();
		System.out.println(economyClassTagName);
		
		String economyClassAttribute = economyClass.getAttribute("value");
		System.out.println(economyClassAttribute);
		
		Dimension dimension2 = economyClass.getSize();
		System.out.println("Height "+ dimension2.height + " Width "+ dimension2.width);
		
		System.out.println("***************************");
		//Business class
		WebElement businessClass = driver.findElement(By.xpath("//input[@value=\"Business\"]"));
		businessClass.click();
		
		boolean enable3 = businessClass.isEnabled();
		System.out.println(enable3);
		
		boolean display3 = businessClass.isDisplayed();
		System.out.println(display3);
		
		boolean selected3 = businessClass.isSelected();
		System.out.println(selected3);
		
		
		WebElement businessText = driver.findElement(By.xpath("//font[@face=\"Arial, Helvetica, sans-serif\" and contains(normalize-space(.), 'Business class')]"));
		String businessClassText = businessText.getText().split("\n")[1].trim();
		System.out.println(businessClassText);
		
		String businessClassTagName = businessClass.getTagName();
		System.out.println(businessClassTagName);
		
		String businessClassAttribute = businessClass.getAttribute("value");
		System.out.println(businessClassAttribute);
		
		Dimension dimension3 = businessClass.getSize();
		System.out.println("Height "+ dimension3.height + " Width "+ dimension3.width);
		
		
		System.out.println("***************************");
		
		//First class
		WebElement firstClass = driver.findElement(By.xpath("//input[@value=\"First\"]"));
		firstClass.click();
		
		boolean enable4 = firstClass.isEnabled();
		System.out.println(enable4);
		
		boolean display4 = firstClass.isDisplayed();
		System.out.println(display4);
		
		boolean selected4 = firstClass.isSelected();
		System.out.println(selected4);
		
		
		WebElement firstText = driver.findElement(By.xpath("//font[@face=\"Arial, Helvetica, sans-serif\" and contains(normalize-space(.), 'First class')]"));
		String firstClassText = firstText.getText().split("\n")[2].trim();
		System.out.println(firstClassText);
		
		String firstClassTagName = firstClass.getTagName();
		System.out.println(firstClassTagName);
		
		String firstClassAttribute = firstClass.getAttribute("value");
		System.out.println(firstClassAttribute);
		
		Dimension dimension4 = firstClass.getSize();
		System.out.println("Height "+ dimension4.height + " Width "+ dimension4.width);
		
		
		Thread.sleep(2000);
		driver.close();


	}

}
