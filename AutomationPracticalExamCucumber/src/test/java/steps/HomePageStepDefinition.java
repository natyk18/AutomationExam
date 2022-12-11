package steps;



import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.TestBase;


public class HomePageStepDefinition extends TestBase{
	HomePage homepage;
	//Scenario1
	@Given("^Set SkyBlue Backgroun button exists$")
	public void set_SkyBlue_Backgroun_button_exists() {
		init();
		homepage=PageFactory.initElements(driver, HomePage.class);
		homepage.SetSkyBlueBackgroundButtonExists();
		}
	@When ("^I click on the button$")
	public void i_click_on_the_button() {
		homepage.setBlueBackground();
		

		}
	@Then ("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		homepage.backgrounColorCheck();
		tearDown();
	}	
	
	//Scenario2
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		init();
		homepage=PageFactory.initElements(driver, HomePage.class);
		homepage.SetWhiteBsckgroundButtonExists();
	}
	@When("^I click  the button$")
	public void i_click_the_button() {
		homepage.SetWhiteBackground();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		homepage.backgrounColorCheck2();
		tearDown();
	}


}
	