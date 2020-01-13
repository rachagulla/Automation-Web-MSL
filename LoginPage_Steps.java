package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFile;


public class LoginPage_Steps extends DriverFile {

	
	
	@Given("^User navigate to Login Page$")
	public void user_navigate_to_Login_Page() throws Throwable {
		invokeBrowser();
		invokeUrl();
	
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String userName) throws Throwable {
	   loginPage.enterUserName(userName);
	}

	@When("^User click on next button$")
	public void user_click_on_next_button() throws Throwable {
	    loginPage.clickNextButton();
	}

	@Then("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) throws Throwable {
	  loginPage.enterPassword(password);
	}

	@Then("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		loginPage.clickLoginBtn();
	}

	@Then("^Verify login successfull with title \"([^\"]*)\"$")
	public void verify_login_successfull_with_title(String title) throws Throwable {
		loginPage.verifyLoginSuccessful(title);
	}

}
