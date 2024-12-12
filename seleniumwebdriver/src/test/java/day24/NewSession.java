package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSession {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_4bzeat7dnl_e&adgrpid=1326012680679100&hvadid=82876055443053&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=116072&hvtargid=kwd-82876733542853:loc-90&hydadcr=5619_2377285&msclkid=36d7da84bf25128aa0e7bc61d42bb895");
		driver.manage().window().maximize();
		
		//by id
		//driver.findElement(By.id("APjFqb")).sendKeys("Abios");
		
		//by name
		//driver.findElement(By.name("q")).sendKeys("Cars");
		
		//xpath using single attribute
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cartoon");
		
		//by classname(home button)
		//driver.findElement(By.className("btn")).click();
		
		//by id(amazon mini tv)
		//driver.findElement(By.id("desktop-banner")).click();
		
		//by  using xpath
		driver.findElement(By.xpath("//img[@alt='Teaser']")).click();
		

	}

}
