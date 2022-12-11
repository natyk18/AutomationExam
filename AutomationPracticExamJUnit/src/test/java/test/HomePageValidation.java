package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import util.BrowserFactory;

public class HomePageValidation extends BrowserFactory {

	HomePage homePage;
	
	
	
	@Before
	public void setup() {
		init();
	
		homePage = PageFactory.initElements(driver, HomePage.class);
		
	 }
	@Test
	public void selectAllboxes() {
		homePage.isAllSelected();
	}
	
	}
	
