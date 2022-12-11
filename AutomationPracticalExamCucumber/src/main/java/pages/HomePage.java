package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement SetSkyBlueBackgroundButton;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement SetWhiteBackgroundButton;
	@FindBy(how = How.CSS, using = "body")
	WebElement bodybackgroundcolor;

	
	//ScenarioMethods1
	public void SetSkyBlueBackgroundButtonExists() {

		if (SetSkyBlueBackgroundButton.isDisplayed()) {
			System.out.println("Set skyblue Background Button exists");
		} else
			System.out.println("Set skyblue Background Button does not exists");
	}

	public void setBlueBackground() {
		SetSkyBlueBackgroundButton.click();
	}

	public void backgrounColorCheck() {
		String bgcolor = bodybackgroundcolor.getCssValue("background-color");
		// System.out.println(bgcolor);
		String hexcolor = Color.fromString(bgcolor).asHex();
		// System.out.println(hexcolor);
		if (hexcolor.equals("#87ceeb"))
			System.out.println("The skyblue color is matching");
		else
			System.out.println("The skyblue color is not matching");
	}

	
	
	// ScenarioMethods2

	public void SetWhiteBsckgroundButtonExists() {

		if (SetWhiteBackgroundButton.isDisplayed()) {
			System.out.println("Set White Background Button exists");
		} else
			System.out.println("Set White Background Button does not exists");

	}

	public void SetWhiteBackground() {
		SetWhiteBackgroundButton.click();
	}

	public void backgrounColorCheck2() {
		String bgcolor = bodybackgroundcolor.getCssValue("background-color");
		// System.out.println(bgcolor);
		String hexcolor = Color.fromString(bgcolor).asHex();
		// System.out.println(hexcolor);
		if (hexcolor.equals("#ffffff"))
			System.out.println("The white color is matching");
		else
			Assert.fail("The color is not matching");
	}
}