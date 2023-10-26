package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{
	
	//Page locators
	
//	public ProductPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//	}
	public void addtoCart(String labelName)
	{
		 List<WebElement> labels = driver.findElements(By.className("inventory_item_name"));
	        List<WebElement> buttons = driver.findElements(By.cssSelector(".btn_inventory"));
	        for(int i=0;i<labels.size();i++){
	            if(labels.get(i).getText().equalsIgnoreCase(labelName)){
	            	System.out.println("found the element");
	                buttons.get(i).click();
	            }
	            return;
	        }
	    }
	}



