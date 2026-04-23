package SeleniumEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Practice Exercise – 1  
 1.Launch a new Chrome browser.
 2. Open DemoQA.com
 3. Get Page Title name
 4. Print Page Title on the Eclipse Console.
 5. Get Page URL and verify if the it is a correct page opened
 6. Get Page Source (HTML Source code)
 7. Close the Browser

 */

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		String extTitle = "DEMOQA";
		System.out.println(extTitle);
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		
		String extUrl = "https://demoqa.com/";
		System.out.println(extUrl);
		String actUrl =driver.getCurrentUrl();
		System.out.println(actUrl);
		
		if(extUrl.equals(actUrl)) {
			System.out.println("Correct page is opened");
		}
		else
		{
			System.out.println("Wrong page is opened");
		}
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
		

	}

}
