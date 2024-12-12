package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();//maximize the browser window
		
		
		//Tag and Id
		//driver.findElement(By.cssSelector("input#search")).sendKeys("Tablet");
		
		//Tag and Attributes
		// Locate the search input field using a CSS selector and type "Tablet" into it
		//driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Tablet");
		
		//Tag Class tag.classname
		//driver.findElement(By.cssSelector("input.form-control.form-control-lg")).sendKeys("Tablet");
		
		//Tag Class Attribute
		//driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("Tablet");
		
	}

}
