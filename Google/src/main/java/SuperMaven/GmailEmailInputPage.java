package SuperMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailEmailInputPage {
	
	WebDriver driver;
	public GmailEmailInputPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//one type of way to write the automated framework___________________
	
//	By EmailInput = By.id("Email");
//	By NextButton = By.name("signIn");
	
//	public WebElement EmailInput()
//	{
//		return driver.findElement(EmailInput);
//	}
//	
//	public WebElement NextButton()
//	{
//		return driver.findElement(NextButton);
//	}
	
	@FindBy(id="Email")
	WebElement EmailInput;
	
	@FindBy(name="signIn")
	WebElement NextButton;

	
	public WebElement EmailInput()
	{
		return EmailInput;
	}
	
	public WebElement NextButton()
	{
		return NextButton;
	}
	

}
