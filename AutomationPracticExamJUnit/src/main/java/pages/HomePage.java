package pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
	this.driver = driver;
}
	@FindBy(css = "div:nth-child(2) form:nth-child(1) ul:nth-child(2) li")
	List<WebElement> ItemLists;
	@FindBy (how = How.NAME, using = "allbox")
			//XPATH, using = "input[@name='allbox']");
	WebElement CheckBoxToggleAll;
	@FindBy (how = How.CSS, using ="input[value='Remove']")
	WebElement RemoveButton;
	@FindBy (how = How.CSS, using ="input[name='data']")
	WebElement TextBoxFieldAdd;
	@FindBy (how = How.CSS, using = "input[value='Add']")
	WebElement AddButton;
	@FindBy(how =How.XPATH, using = "//input[@type='checkbox']")
	List<WebElement> checkboxes;
	
	public void isAllSelected() {
		
		if(ItemLists.isEmpty()){
			System.out.println("Add an item on the TextBoxFieldAdd");
			TextBoxFieldAdd.sendKeys("newAddedItem");
			AddButton.click();
			CheckBoxToggleAll.click();
			for (int i=0; i<checkboxes.size(); i++) {
				Assert.assertTrue(checkboxes.get(i).isSelected());
			}
		}else {	
			CheckBoxToggleAll.click();
			for(int i=0; i<checkboxes.size(); i++) {
				Assert.assertTrue(checkboxes.get(i).isSelected());
				
			}
		}
	}
	
	public void removeOneItemUsingRemoveButton()  {
		int itemBeforeRemoving = checkboxes.size();
		checkboxes.get(0).click();
		RemoveButton.click();
		int listNumberAfterRemoving = checkboxes.size();
		
		if(listNumberAfterRemoving<itemBeforeRemoving) {
		
		System.out.println("Item was succesfully removed");
		
		}else {
		Assert.fail("The item was not removed yet");
		}
 
		}


   public void removeAllItemsWhenToggleAllCheckBoxIsOn(){
	   
	   CheckBoxToggleAll.click();
	   RemoveButton.click();
	   if(ItemLists.isEmpty()){
			System.out.println("Items were succesfuly removed");{
			}	
			}else {
				Assert.fail("Items were succesfuly removed");
				}
			}
	   
	   }