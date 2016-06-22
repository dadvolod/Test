package SuperMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLoginPage {

	WebDriver driver;
	public GmailLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Signin = By.linkText("Sign in");
	
	public WebElement Signin()
	{
		return driver.findElement(Signin);
	}


}
