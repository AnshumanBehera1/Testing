package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//1-get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		/*//2-get(title)
		System.out.println(driver.getTitle());
		
		//3-get(Currenturl)
		System.out.println(driver.getCurrentUrl());
		
		//4-get pagesource()
		System.out.println(driver.getPageSource());
		
		//5-getWindowHandel()
		String windowid= driver.getWindowHandle();	
		System.out.println("window id:"+windowid);//window id:EC0FE9D93959B2CE8A18DB880E73CF23
		
		//6-getWindowHandler()
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);*/
		
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>windowids=driver.getWindowHandles();
		System.out.println(windowids);
	}

}
