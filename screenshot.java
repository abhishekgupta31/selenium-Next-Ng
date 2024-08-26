package maven_project.maven_artifact;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	static public void main(String[]args) throws IOException {
		
		System.setProperty("web driver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://students.hypertechglobaltechnologies.com/st_available_course");
		
		//step1
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//step2
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\java\\project\\screen\\image.png");
		
		//C:\Users\Admin\OneDrive\Desktop\java\maven_artifact\screen
		//step3(copy image file to destination)
	    FileUtils.copyDirectory(src, dest);
	    
	    driver.quit();
		
		
		
		
		
		
		
		
		
	}

}



