package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		
		
		System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com//");	// TODO Auto-generated method stub
	    
	   String actualtooltip = driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).getAttribute("title");
	   String expectedtooltip ="Sign up for Facebook";
	   
	   if (actualtooltip.equals(expectedtooltip))
	   {
	   System.out.println("test passed");
	   }
	   else 
	   {
		System.out.println("test failled");
	   
	   }
		
	}

}
