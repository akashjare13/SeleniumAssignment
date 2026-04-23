package SeleniumEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exercise2 {
	
	/*
	 *  Practice Exercise – 2.
1.Launch a new edge browser.
2. Open https://opensource-demo.orangehrmlive.com/
3. Get Page Title name
4. Print Page Title on the Eclipse Console.
5. Get Page URL and verify if the it is a correct page opened
6. Get Page Source (HTML Source code)
7. Close the Browser 

	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String extUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		System.out.println(extUrl);
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		
		if(extUrl.equals(actUrl)) {
			System.out.println("Correct page is opened");
		}
		else {
			System.out.println("Wrong page is opened");
		}
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		Thread.sleep(3000);
		driver.close();

	}

}
