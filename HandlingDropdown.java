package maven_project.maven_artifact;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown {

	private static WebElement element;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("web driver.chrome.driver","C:\\chrome-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
				
		int resCode = 200;  
		int brokenLinkCnt = 0;
		
		System.out.println("Total Links on page" +linkList.size());
		
		
		for (WebElement element:linkList)
		{
			
			String url = element.getAttribute("href");
			
			try {
				
				
				URL urlLink = new URL(url);
				
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				
				if(resCode >= 400)
					
				{
					System.out.println(url+ "broken link.");
					brokenLinkCnt ++;
					
					
				}		
			}
			catch(MalformedURLException e)
			{
			}
			catch(Exception e)
			{
				
			}
			
			
			String brokenLinksCnt = null;
			System.out.println("Total Broken links" +brokenLinksCnt);
			Thread.sleep(4000);
			driver.quit();
		
		}
		
	}
	
}

	
	



