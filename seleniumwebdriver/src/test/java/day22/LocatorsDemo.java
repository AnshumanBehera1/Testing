package day22;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // Import for WebElement
import java.util.List; // Import for List

public class LocatorsDemo {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.opencart.com/");
        
        // name
         driver.findElement(By.name("search")).sendKeys("mac");
        
        // if id is available
        // boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logoDisplayStatus);
        
        // linkText & partialLinkText
        // driver.findElement(By.linkText("Tablets")).click();
         driver.findElement(By.partialLinkText("Tab")).click();
        
        //classname
        //List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        //System.out.println("total number of header links:"+headerLinks.size());

        //tagname
       // List<WebElement> links=driver.findElements(By.tagName("a"));
         //System.out.println("total number of links;"+links.size());
        
        //
        //List<WebElement> images=driver.findElements(By.tagName("img"));
        //System.out.println("total number of images;"+images.size());
        
        
    }
}





