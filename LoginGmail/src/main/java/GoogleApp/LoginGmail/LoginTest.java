package GoogleApp.LoginGmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GoogleApp.LoginGmail.GLoginPage;

public class LoginTest {
	
	
	public static String gmailUsername = "gciotest@gmail.com";
	public static String gmailPassword = "Password123#";

	@Test
	public static void Login() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/dmitriyadvolodkin/Documents/Google/Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/");
		
		GLoginPage GLP = new GLoginPage(driver);
		
		GLP.GmailLogin(gmailUsername, gmailPassword);
			
		Assert.assertTrue(GLP.MyAccountText().isDisplayed(), "Login Passed");
		
		driver.quit();

	}

}
