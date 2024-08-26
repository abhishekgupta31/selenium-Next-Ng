package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[]args) throws InterruptedException 
	
	
	{System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().maximize();
    System.out.println("it is working");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.className("btn_action")).click();
	
	String currwindow = driver.getWindowHandle();
	driver.switchTo().window(currwindow);
	driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(2)")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@id='cart_contents_container']//div[3]//div[2]//div[2]//button[1]")).click();
	
	
	Thread.sleep(4000);
	driver.quit();
	
	
	
	

		
		
		
	}
}
