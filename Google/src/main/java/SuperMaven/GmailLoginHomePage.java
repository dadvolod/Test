package SuperMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLoginHomePage {
	
	WebDriver driver;
	public GmailLoginHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By MailLink = By.xpath(".//*[@id=':j']");
	
	public WebElement MailLink()
	{
		return driver.findElement(MailLink);
	}

}
