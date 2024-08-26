package maven_project.maven_artifact;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTesting {
	
public static void main(String[]args) throws InterruptedException 
	
	
	{
	
	System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");
    driver.manage().window().maximize();
    
    List <WebElement> radioButtonList= driver.findElements(By.xpath("//input[@type='radio']"));
    
    System.out.println("Total No of buttons on webpage:"+radioButtonList.size());
    driver.quit();
    

	}
}