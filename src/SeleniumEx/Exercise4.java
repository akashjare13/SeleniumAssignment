package SeleniumEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise4 {
	
	/*
	 * Practice Exercise – 4.
1.Launch a new Firefox browser.
2. Open https://www.saucedemo.com/
3. Get Page Title name
4. Print Page Title on the Eclipse Console.
5. Get Page URL and verify if the it is a correct page opened
6. Get Page Source (HTML Source code)
7. Close the Browser

	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String actUrl = "https://www.saucedemo.com/";
		System.out.println(actUrl);
		String extUrl = driver.getCurrentUrl();
		System.out.println(extUrl);
		
		if(extUrl.equals(actUrl)) {
			System.out.println("Correct page is opened");
		}
		else {
			System.out.println("Wrong page is opened");
		}
		
		
		System.out.println(driver.getPageSource());
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
