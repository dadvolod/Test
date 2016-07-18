package Google.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Google.Login.GLoginPage;

public class GoogleLoginTC {
	
	
	public String gmailUsername = "gciotest@gmail.com";
	public String gmailPassword = "Password123#";

	
	public void Login(){	
		
		System.setProperty("webdriver.chrome.driver", "/Users/dmitriyadvolodkin/Documents/Google/Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/");
		
		GLoginPage  Glp = new GLoginPage(driver);
		Glp.GmailLogin(gmailUsername, gmailPassword);
		
		Assert.assertTrue(Glp.MyAccountText().isDisplayed(), "Login Passed");
		
		driver.quit();
		
	}

}
