package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("web driver.chrome.driver","C:\\chrome-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		String nseindex=driver.findElement(By.id("nseindex")).getText();
		
		System.out.println("NSEINDEX VALUE:" +nseindex);
		
	}

}
