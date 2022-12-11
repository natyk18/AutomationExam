package pages;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import junit.framework.Assert;

public class HomePageNG {
	WebDriver driver;

	public HomePageNG(WebDriver driver) {
		this.driver = driver;
	}

	// PageFactory
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement insertNewCategoryBox;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement addCategoryButton;
	@FindBy(how = How.XPATH, using = "//div[@class='controls']//a")
	List<WebElement> categoryList;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Yes']")
	WebElement yesButton;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement monthDropdownButton;

	public void insertNewCategory() {
		insertNewCategoryBox.sendKeys("Natalia18");
		addCategoryButton.click();
		Boolean match = categoryList.stream().anyMatch(category -> category.getText().equalsIgnoreCase("Natalia18"));

		Assert.assertTrue(match);
		System.out.println("Natalia18 was added");
	}

	public void duplicatedcategory() {
		insertNewCategoryBox.sendKeys("Natalia18");
		addCategoryButton.click();
		Boolean match = categoryList.stream().anyMatch(category -> category.getText().equalsIgnoreCase("Natalia18"));
		if (match.TRUE) {
		}
		Assert.fail("Natalia18 already exists");
	}

	public void dropDown() {
		monthDropdownButton.click();

		Select sel = new Select(monthDropdownButton);
		for (WebElement monthDropdownButton : sel.getOptions()) {
			System.out.println(monthDropdownButton.getText());

		}

	}
}
