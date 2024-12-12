package dayassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		//driver.get("https://www.demoblaze.com/");
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//for id
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Lenovo");
		
		//for name
		//driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_5']")).click();
		
		//for linktext
		//driver.findElement(By.cssSelector("Open Menu")).click();(can't find name)
		
		//for partial linktext
		
		
		//for classname
		//driver.findElement(By.cssSelector(".nav-a ")).click();//not work)
		
		//for tag name
		//driver.findElement(By.cssSelector("a")).click();//same thing happend)
		
		
		//cous-css selector
		        //Tag and Id
				//driver.findElement(By.cssSelector("a#login2")).click();
				
				//Tag and Attributes
				//driver.findElement(By.cssSelector("a[data-target='#signInModal']")).click();
				
				//Tag Class tag.classname
				//driver.findElement(By.cssSelector("button.page-link")).click();
				
				//Tag Class Attribute
				//driver.findElement(By.cssSelector("a.nav-link[data-toggle='modal']")).click();
		
		
			
		//XPath with class single attribute
				//driver.findElement(By.xpath("//input[@class='selectors-input jsSelector']")).sendKeys("Wili");
				
				//XPath with multiple attribute
				//driver.findElement(By.xpath("//input[@id='shub23'][ @title='Email']")).sendKeys("Willo");  //(re-check)
				
				//XPath with 'and'  'or' operator
			    //driver.findElement(By.xpath("//input[@name='company' and @placeholder='Enter your company']")).sendKeys("S8UL");
				//driver.findElement(By.xpath("//input[@name='company' or @placeholder='Enter your company']")).sendKeys("Galory");
				
				//XPath with text() - inner text
				//driver.findElement(By.xpath("//a[text()='SelectorsHub Youtube Channel']")).click();//(re-check)

				//boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Users Table']")).isDisplayed(); //(re-check)
				//System.out.println(displaystatus);

				//String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
				//System.out.println(value);
				
				
				//XPath with contains()
				//driver.findElement(By.xpath("//input[contains(@placeholder, 'Crush')]")).sendKeys("T-shirts");
				
				//XPath with start-with()
				//driver.findElement(By.xpath("//button[starts-with(@value,'Submit')]")).click();
				
				//chianed x path
				//boolean status= driver.findElement(By.xpath("//input[@id='inp_val']/a/img")).isDisplayed();//(can't find)
				//System.out.println(status);
		
		
		
		
		
		
		
		
		
		
	}

}
