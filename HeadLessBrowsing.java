package maven_project.maven_artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowsing {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
//        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options); // Pass options to ChromeDriver
        driver.get("https://www.google.com/");
        
        System.out.println("Title Of Google: " + driver.getTitle());
        
        WebElement element = driver.findElement(By.name("q")); // Corrected the locator for the search box
        element.sendKeys("Taj Mahal");
        element.sendKeys(Keys.ENTER); // Using Keys.RETURN
        
        Thread.sleep(4000);
        System.out.println("Page title after search: " + driver.getTitle()); // Optional, for debugging
        
        driver.quit();
    }
}
