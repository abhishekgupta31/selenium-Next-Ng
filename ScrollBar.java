package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("web driver.chrome.driver","C:\\\\chrome-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.alexflueras.ro/#lg=1&slide=2");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("window.scrollBy(0,1000)");
		
//		WebElement element = driver.findElement(By.linkText("BMI Calculator"));
//		js.executeScript("arguments[0].scrollIntoView();", element);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement element = driver.findElement(By.cssSelector("body > div:nth-child(18) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > img:nth-child(1)"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
