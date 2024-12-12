package day24;

import java.awt.TextArea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("q")).sendKeys("Sun");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Linkedin");
		
		//driver.findElement(By.className("gLFyf")).sendKeys("Tree");
		 
		//driver.findElement(By.partialLinkText("Ima")).click();
		
		//driver.findElement(By.tagName("textarea")).sendKeys("keys");
		
		//tag id
		//driver.findElement(By.cssSelector("#APjFqb")).sendKeys("India");
		
		//tag class
		//driver.findElement(By.cssSelector(".gLFyf")).sendKeys("PICASO");		
		
		//tag attribute
		//driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("sea");
		
		//tag class attribute
		//driver.findElement(By.cssSelector("textarea.gLFyf[role='combobox']")).sendKeys("Weekend");
		
		//Xpath with single attribute
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("you");
		
	}

}
