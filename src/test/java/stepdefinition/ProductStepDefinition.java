package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import pages.ProductPage;

public class ProductStepDefinition {
	
	WebDriver driver;
	
	@Given("the First item {string} is added to the cart")
	public void addtoCart(String labelName)
	{
		ProductPage productPage = new ProductPage();
		productPage.addtoCart(labelName);
	}
}
