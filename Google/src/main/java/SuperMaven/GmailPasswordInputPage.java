package SuperMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPasswordInputPage {
	
	WebDriver driver;
	public GmailPasswordInputPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By PasswordInput = By.xpath(".//*[@id='Passwd']");
	By NextButton = By.id("signIn");
	
	public WebElement PasswordInput()
	{
		return driver.findElement(PasswordInput);
	}
	
	public WebElement NextButton()
	{
		return driver.findElement(NextButton);
	}

}
