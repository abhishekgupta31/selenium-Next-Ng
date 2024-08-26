package maven_project.maven_artifact;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadAutoid {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method 

		System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/upload");
	   WebElement button = driver.findElement(By.id("file-upload"));
	  
	    Actions act = new Actions(driver);
	    act.moveToElement(button).click().perform();
	    Thread.sleep(4000);
	    try {
	    	Runtime.getRuntime().exec("D:\\AutoId\\newfile.exe" + " " + "C:\\Users\\Admin\\OneDrive\\Desktop\\abh.qa.docx");
	    }catch (IOException e) {
	    	
	    	e.printStackTrace();
	    }
	    
	    Thread.sleep(4000);
	    driver.quit();

	}

}


//C:\Users\Admin\OneDrive\Documents\audoid.exe