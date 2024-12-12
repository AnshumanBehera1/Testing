package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aassignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		
		
		//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Phone");
		
		//driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("sun");
		
		//driver.findElement(By.partialLinkText("Sea")).click();
		//driver.findElement(By.name("q")).click();
		
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Trees");
		

	}

}
