package pageObjects;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage{
	
	
	
	@FindBy(name="Username")
	public WebElement usernameInput;
	
	@FindBy(xpath="//button[text()='Next']")
	public WebElement nextBtn;
	
	@FindBy(name="Password")
	public WebElement passwrdInput;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement loginBtn;
	

	
	public Login_Page() throws IOException {
		super();
	}
	
	/*public Login_Page getLoginPage() throws IOException {
	
		String url=p.getProperty("url");
		driver.get(url);
		return new Login_Page();
	}*/
	
	
	
	public Login_Page enterUserName(String userName) throws Exception {
		sendKeysToWebElement(usernameInput, userName);
		return new Login_Page();
	}
	
	public Login_Page clickNextButton() throws Exception {
		waitAndClickElement(nextBtn);
		return new Login_Page();
	}
	

	
	public Login_Page enterPassword(String password) throws Exception {
		sendKeysToWebElement(passwrdInput, password);
		return new Login_Page();
	}
	
	
	public Login_Page clickLoginBtn() throws Exception {
		waitAndClickElement(loginBtn);
		return new Login_Page();
	}
	
	
	
	public Login_Page verifyLoginSuccessful(String expTitle) throws Exception {
		String actTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
		return new Login_Page();
	}

}
