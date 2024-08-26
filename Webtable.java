package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("C:\\Users\\Admin\\OneDrive\\Desktop\\java\\maven_artifact\\doc.html");
		 String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		 
		 String text1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
		 
		 System.out.println(text);
		 System.out.println(text1);
		 
		

	}

}
