package maven_project.maven_artifact;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {
        
        String expectedDay = "8";
        String expectedMonth = "August";
        String expectedYear = "2024";
        
        System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(0);
        
        driver.findElement(By.id("datepicker")).click();
        
        while (true) {
            String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            
            if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) {
                List<WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                
                for (WebElement e : daysList) {
                    String calendarDay = e.getText();
                    if (calendarDay.equals(expectedDay)) {
                        e.click();
                        break;
                    }
                }
                break;
            } else {
                // Click on the next button
                driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]")).click();
            }
        }
        Thread.sleep(4000);
        driver.quit();
    }
}
