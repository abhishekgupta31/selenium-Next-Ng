package maven_project.maven_artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        
        System.out.println("it is working");
        
        System.out.println("Title of page: "+driver.getTitle());
        System.out.println("Title of URL: "+driver.getCurrentUrl());
//        System.out.println("Title of page source: "+driver.getPageSource());
        
        
        

	}

}
