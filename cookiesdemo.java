package maven_project.maven_artifact;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cookiesdemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();

            // Get all cookies
            Set<Cookie> cookiesList = driver.manage().getCookies();
            System.out.println("Before adding, Size: " + cookiesList.size());

            for (Cookie ck : cookiesList) {
                System.out.println(ck.getName() + ": " + ck.getValue());
            }

            // Create and add a new cookie
            Cookie newCookie = new Cookie("TestCookie", "amazon.in");
            driver.manage().addCookie(newCookie);

            cookiesList = driver.manage().getCookies();
            System.out.println("After adding, Size: " + cookiesList.size());

            for (Cookie ck : cookiesList) {
                System.out.println(ck.getName() + ": " + ck.getValue());
            }

            // Delete the new cookie
            driver.manage().deleteCookie(newCookie);
            cookiesList = driver.manage().getCookies();
            System.out.println("\n\nAfter deleting, Size: " + cookiesList.size());

            for (Cookie ck : cookiesList) {
                System.out.println(ck.getName() + ": " + ck.getValue());
            }
        } finally {
            driver.quit();
        }
    }
}
