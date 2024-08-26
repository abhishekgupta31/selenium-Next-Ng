package maven_project.maven_artifact;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.calculator.net/");
	    driver.manage().window().maximize();
	    System.out.println("it is working");
	    
	    List <WebElement> linkElements = driver.findElements(By.tagName("a"));
	    System.out.println("Toatl links on webpage: "+ linkElements.size());
	    
	    for (WebElement el :linkElements)
	    	
	    {
	    	System.out.println(el.getText());
	    	
	    }
	    
	    
	    driver.quit();
	    
	    
	    
	    

	}

}
