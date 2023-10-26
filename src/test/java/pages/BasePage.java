package pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage {
	
	static WebDriver driver;
	
	public static WebDriver getDriverInstance()
	{
		if(driver == null) {
			driver = createDriver();
		}
		return driver;
	}

     public static WebDriver createDriver() {
    	 ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
         DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setBrowserName("chrome");
         capabilities.setPlatform(Platform.LINUX);
         URL url = null;
         try {
             url = new URL("http://localhost:4444/wd/hub");
         } catch (MalformedURLException e) {
             e.printStackTrace();
         }
         driver.set(new RemoteWebDriver(url, capabilities));

         return driver.get();
     }

}
