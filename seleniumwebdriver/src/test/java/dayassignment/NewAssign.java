package dayassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAssign {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		/*driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://www.google.co.in/webhp");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();*/
		boolean check = driver.findElement(By.xpath("//input[@value='radio1']")).isEnabled();
		System.out.println(check);
		//WebElement radio_2= driver.findElement(By.xpath("input[value='radio2']"));
		

		
		
		
		
		}

}
