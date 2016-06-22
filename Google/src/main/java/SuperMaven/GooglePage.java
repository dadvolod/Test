package SuperMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

	WebDriver driver;
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By GmailLink = By.linkText("Gmail");
	
	public WebElement GmailLink()
	{
		return driver.findElement(GmailLink);
	}

}
