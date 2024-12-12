package day21;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Test case
-----------
-Launch browser (chrome)
-Open URL https://demo.opencart.com/
-Validate title should be "Your Store"
-close browser

*/

public class FirstTestCase {

	public static void main(String[] args) {
		//1)launch browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//Open URL https://demo.opencart.com/
		
		driver.get(" https://demo.opencart.com/");
		
		//Validate title should be "Your Store"
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
		System.out.println("Test Passed"); 
		}
		else
		{
			System.out.println("Test Failed");
		}
		//close the browser
		driver.close();
	}

}
