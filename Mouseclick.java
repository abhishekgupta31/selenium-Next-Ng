package maven_project.maven_artifact;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {
public static void main(String[]args) throws InterruptedException 
	
	
	{System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/buttons");
//    WebElement button = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]")); for right click performance
//    Actions act = new Actions(driver); for right click performance
//    act.contextClick(button).perform();//right click performance
    WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']")); // for double click performance
    Actions act = new Actions(driver);// for double click performance
    act.doubleClick(button).perform();//for double click performance
    
    
    
    
    Thread.sleep(4000);
    driver.quit();
    
    		
    
    
		
		
		
		
	}

}
