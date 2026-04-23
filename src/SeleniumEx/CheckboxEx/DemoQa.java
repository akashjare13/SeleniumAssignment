package SeleniumEx.CheckboxEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(2000);
		
		WebElement plusIcon = driver.findElement(By.xpath("//button[@title=\"Expand all\"]"));
		plusIcon.click();
		Thread.sleep(2000);
		WebElement minusIcon = driver.findElement(By.xpath("//button[@title=\"Collapse all\"]"));
		minusIcon.click();
		Thread.sleep(2000);
		WebElement homeToggle = driver.findElement(By.xpath("//button[@title=\"Toggle\"]"));
		homeToggle.click();
		Thread.sleep(2000);
		WebElement desktop = driver.findElement(By.xpath("//span[text()=\"Desktop\"]"));
		desktop.click();
		Thread.sleep(2000);
		WebElement documentExpand = driver.findElement(By.xpath("//label[@for=\"tree-node-documents\"]/ancestor::span[@class='rct-text']/button"));
		documentExpand.click();
		Thread.sleep(2000);
		WebElement workspaceExpand = driver.findElement(By.xpath("//label[@for=\"tree-node-workspace\"]/ancestor::span[@class='rct-text']/button"));
		workspaceExpand.click();
		Thread.sleep(2000);
		WebElement angular = driver.findElement(By.xpath("//span[text()=\"Angular\"]"));
		angular.click();
		Thread.sleep(2000);
		WebElement downloads = driver.findElement(By.xpath("//span[text()=\"Downloads\"]"));
		downloads.click();
		Thread.sleep(2000);
		
		

	}

}
