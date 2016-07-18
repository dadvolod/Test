package Google.Login;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleLoginTest {
	
	
	public String gmailUsername = "gciotest@gmail.com";
	public String gmailPassword = "Password123#";

	
	public void Login(){	
		
		System.setProperty("webdriver.chrome.driver", "/Users/dmitriyadvolodkin/Documents/Google/Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/");
		
		GPage Glp = new GPage(driver);
		Glp.GmailLogin(gmailUsername, gmailPassword);
		
		Assert.assertTrue(Glp.MyAccountText().isDisplayed(), "Login Passed");
		
		driver.quit();
		
	}

}
