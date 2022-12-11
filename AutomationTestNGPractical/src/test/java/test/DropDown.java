package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePageNG;
import util.BrowserFactory;

public class DropDown extends BrowserFactory {
	HomePageNG homepageng;

	@BeforeTest
	public void setup() {
		init();
		homepageng = PageFactory.initElements(driver, HomePageNG.class);
	}

	@Test
	public void dropdownvalidation() {
		homepageng.dropDown();
	}

	  @AfterTest 
	 public void closeDriver() { 
	 tearDown(); }
}
