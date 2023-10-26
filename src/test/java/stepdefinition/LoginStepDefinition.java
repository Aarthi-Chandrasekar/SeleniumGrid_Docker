package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class LoginStepDefinition {
	
    LoginPage loginPage;
	
	@Given("the homepage is open")
	public void loginOpen()
	{
		
		BasePage.getDriverInstance().get("http://www.saucedemo.com");
		loginPage = new LoginPage();
	}
	@Given("the Username is filled with {string}")
	public void enterUsername(String Username)
	{
		loginPage.enterUsername(Username);
	}
	@Then("the Password is filled with {string}")
	public void enterPassword(String Password)
	{
		loginPage.enterPassword(Password);
	}
	@When("the login button is clicked")
	public void clickSignin()
	{
		loginPage.clickSignin();
	}
}
