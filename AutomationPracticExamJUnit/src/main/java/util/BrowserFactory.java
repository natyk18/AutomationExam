package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

public WebDriver driver;

public void init() {
	 System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get("https://techfios.com/test/107/");
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
}
 public void tearDown() {
	    driver.close();
	    driver.quit();
	  }
}
