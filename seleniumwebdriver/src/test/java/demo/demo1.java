package demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*WebElement drpoptionnew =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select drpoption = new Select(drpoptionnew);
		
		drpoption.selectByValue("option2");*/
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Ansh");
		WebElement aleert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		aleert.click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(aleert.getText());
		driver.switchTo().alert().accept();
		
		
		

	}

}
