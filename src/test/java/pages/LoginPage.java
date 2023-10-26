package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	
	//Page Locators
	By Username=By.xpath("//input[@id='user-name']");
	By Password=By.xpath("//input[@id='password']");
	By LoginButton=By.xpath("//input[@id='login-button']");
	
	
	public void enterUsername(String Name)
	{
		driver.findElement(Username).sendKeys(Name);
	}
	public void enterPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	public void clickSignin()
	{
		driver.findElement(LoginButton).click();
	}
}
