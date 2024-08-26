package maven_project.maven_artifact;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodedDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		encodedPassword..................
	//	String password = "secret_sauce";
		//byte[] encodedPassword=Base64.encodeBase64(password.getBytes());
		//System.out.println(new String(encodedPassword));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		Open URL
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		decode password
		byte[] decodedPasswors = Base64.decodeBase64("c2VjcmV0X3NhdWNl");
//		Enter password
		driver.findElement(By.id("password")).sendKeys(new String (decodedPasswors));
//		click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
	}
}
