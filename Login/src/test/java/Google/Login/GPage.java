package Google.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GPage {
		
	WebDriver driver;
	public GPage(WebDriver driver) {
		this.driver=driver;
	}

	By GCIOaccount = By.xpath(".//*[@value='gciotest@gmail.com']");
	By emailField = By.xpath(".//*[@id='Email']");	
	By nextButton = By.xpath(".//*[@id='next']");	
	By passwordField = By.xpath(".//*[@id='Passwd']");	
	By signIn = By.xpath(".//*[@id='signIn']");
	By MyAccountText = By.xpath("//h1[contains(text(), 'My Account')]");

	
	public WebElement MyAccountText()
	{
		return driver.findElement(MyAccountText);
	}
	
	public void GmailLogin(String username, String Password){
		driver.findElement(emailField).sendKeys(username);
		driver.findElement(nextButton).click();
		driver.findElement(passwordField).sendKeys(Password);
		driver.findElement(signIn).click();
	}
	
}
