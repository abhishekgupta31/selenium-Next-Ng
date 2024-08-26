package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrog {

	public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
		
		{System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    
	    WebElement source = driver.findElement(By.id("box6"));

	    WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
	    
	    
	  
	    
	    Actions act = new Actions(driver);
	    
	    act.dragAndDrop(source, target).perform();
	    
	    Thread.sleep(4000);
	 
	    
	    
	    
	    
	    
	    

	}

}
