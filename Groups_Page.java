package pageObjects;

import java.io.IOException;

import javax.net.ssl.HostnameVerifier;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Groups_Page extends BasePage{
	
	
	
	@FindBy(xpath="//div[text()=' Users ']")
	public WebElement usersBtn;
	
	@FindBy(xpath="//a[text()='Groups']")
	public WebElement groupsBtn;
	
	@FindBy(xpath="//button[text()='New Group']")
	public WebElement newGroupBtn;
	
	@FindBy(xpath="//div[contains(@class,'z-thumb-transclude')]")
	public WebElement addThumbnailIcon;
	
	@FindBy(xpath="//a[text()='Existing Images']")
	public WebElement existingImagesBtn;
	
	@FindBy(xpath="//div[contains(@class,'z-image-select')]")
	public WebElement selectImage;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement selectBtn;
     
	
	@FindBy(name="Code")
	public WebElement codeInput;
	
	@FindBy(name="Name")
	public WebElement nameInput;
	
	@FindBy(xpath="//div[contains(@class,'selectize-input')]")
	public WebElement managerInput;
	
	
	@FindBy(xpath="//input[@type='select-multiple']")
	public WebElement managerInput1;

	
	@FindBy(xpath="//label[@for='isActive']")
	public WebElement activeBtn;
	
	
	@FindBy(xpath="//label[@for='WebAppUserGroup']")
	public WebElement webClientAccessBtn;
	
	
	

	@FindBy(xpath="//td[text()='zunos_code01']")
	public WebElement groupCode;
	
	
	
	
	@FindBy(xpath="//button[text()='Add Users']")
	public WebElement addUsersBtn;
	
	
	

	@FindBy(xpath="//button[@ng-click='primaryAction()']")
	public WebElement processBtn;
	
	
	@FindBy(xpath="//td[text()='zunos_code01']//parent::tr//td")
	public WebElement groupSelect;
	
	

	
	@FindBy(xpath="//i[@class='fas fa-trash']")
	public WebElement deleteIcon;
	
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	public WebElement deleteBtn;
	
	
	
	@FindBy(xpath="//a[@class='name']")
	public WebElement userIcon;
	
	
	@FindBy(xpath="//a[text()='Log Out']")
	public WebElement logout;
	
	

	
	public Groups_Page() throws IOException {
		super();
	}
	
	

	
	public Groups_Page clickUsersBtn() throws Exception {
		waitAndClickElement(usersBtn);
		return new Groups_Page();
	}
	
	public Groups_Page clickGroupsBtn() throws Exception {
		waitAndClickElement(groupsBtn);
		return new Groups_Page();
	}
	
	public Groups_Page clickNewGroupBtn() throws Exception {
		waitAndClickElement(newGroupBtn);
		return new Groups_Page();
	}
	
	
	public Groups_Page clickAddThumbnailIcon() throws Exception {
		waitAndClickElement(addThumbnailIcon);
		return new Groups_Page();
	}
	
	public Groups_Page clickExistingImagesBtn() throws Exception {
		waitAndClickElement(existingImagesBtn);
		return new Groups_Page();
	}
	
	
	
	public Groups_Page clickSlectImagesBtn() throws Exception {
		waitAndClickElement(selectImage);
		return new Groups_Page();
	}
	
	
	public Groups_Page clickSlectBtn() throws Exception {
		waitAndClickElement(selectBtn);
		return new Groups_Page();
	}
	
	
	public Groups_Page enterCode(String code) throws Exception {
		sendKeysToWebElement(codeInput,code);
		return new Groups_Page();
	}
	
	
	public Groups_Page enterName(String name) throws Exception {
		sendKeysToWebElement(nameInput,name);
		return new Groups_Page();
	}
	public Groups_Page enterManager(String manager) throws Exception {
		waitAndClickElement(managerInput);
		sendKeysToWebElement(managerInput1,manager);
		return new Groups_Page();
	}
	
	
	public Groups_Page clickActiveToggleBtn() throws Exception {
		waitAndClickElement(activeBtn);
		return new Groups_Page();
	}
	
	
	public Groups_Page webAppClientActiveToggleBtn() throws Exception {
		waitAndClickElement(webClientAccessBtn);
		return new Groups_Page();
	}
	
	
	public Groups_Page clickSaveBtn() throws Exception {
		waitAndClickElement(selectBtn);
		return new Groups_Page();
	}
	
	
	
	public Groups_Page clickAddUsersBtn() throws Exception {
		waitAndClickElement(addUsersBtn);
		return new Groups_Page();
	}
	
	public Groups_Page clickProcessBtn() throws Exception {
		waitAndClickElement(processBtn);
		return new Groups_Page();
	}
	
	
	
	public Groups_Page clickGroup() throws Exception {
		waitAndClickElement(groupSelect);
		return new Groups_Page();
	}
	
	
	public Groups_Page clickDeleteIcon() throws Exception {
		waitAndClickElement(deleteIcon);
		waitAndClickElement(deleteBtn);
		
		return new Groups_Page();
	}
	
	public Groups_Page clickUserIcon() throws Exception {
		waitAndClickElement(userIcon);
		return new Groups_Page();
	}
	
	public Groups_Page clickLogoutBtn() throws Exception {
		waitAndClickElement(logout);
		return new Groups_Page();
	}
	
	
	
	public Groups_Page verifyGroupCode(String expText) throws Exception {
		String actText = groupCode.getText();
		Assert.assertEquals(actText, expText);
		return new Groups_Page();
	}

}
