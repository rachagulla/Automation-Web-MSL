package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utils.DriverFile;

public class GroupsPage_Steps extends DriverFile{
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
	}

	@When("^User click on users button$")
	public void user_click_on_users_button() throws Throwable {
		groupsPage.clickUsersBtn();
		Thread.sleep(3000);
	}

	@When("^User click on groups button$")
	public void user_click_on_groups_button() throws Throwable {
	   groupsPage.clickGroupsBtn();
	   Thread.sleep(3000);
	}

	@Then("^User click on newgroup button$")
	public void user_click_on_newgroup_button() throws Throwable {
	    groupsPage.clickNewGroupBtn();
	}

	@Then("^User click on add thunbnail icon$")
	public void user_click_on_add_thunbnail_icon() throws Throwable {
	    groupsPage.clickAddThumbnailIcon();
	    Thread.sleep(3000);
	}

	@Then("^User click on existing images$")
	public void user_click_on_existing_images() throws Throwable {
	   groupsPage.clickExistingImagesBtn();
	}

	@Then("^User select image$")
	public void user_select_image() throws Throwable {
		groupsPage.clickSlectImagesBtn();
	}
	
	
	@And("^User click on select button$")
	public void user_click_on_select_button_image() throws Throwable {
		groupsPage.clickSlectBtn();
	}
	

	@Then("^User enters code \"([^\"]*)\"$")
	public void user_enters_code(String code) throws Throwable {
		groupsPage.enterCode(code);
	}

	@Then("^User enters name \"([^\"]*)\"$")
	public void user_enters_name(String name) throws Throwable {
	   groupsPage.enterName(name);
	}

	@Then("^User enters managers \"([^\"]*)\"$")
	public void user_enters_managers(String manager) throws Throwable {
		groupsPage.enterManager(manager);
	}

	@Then("^User click on active toggle button$")
	public void user_click_on_active_toggle_button() throws Throwable {
		groupsPage.clickActiveToggleBtn();
	}
	
	
	
	@And("^User click on manager web client active toggle button$")
	public void User_click_on_manager_web_client_active_toggle_button() throws Throwable {
		groupsPage.webAppClientActiveToggleBtn();
		
	}
	  

	@Then("^User click on save button$")
	public void user_click_on_save_button() throws Throwable {
		groupsPage.clickSaveBtn();
		Thread.sleep(3000);
	
	}

	@Then("^Verify new group created successfully with code \"([^\"]*)\"$")
	public void verify_new_group_created_successfully_with_code(String exptText) throws Throwable {
		groupsPage.verifyGroupCode(exptText);
	}

	
	

	@When("^User select group from groups$")
	public void user_select_group_from_groups() throws Throwable {
		groupsPage.clickGroup();
	}
	
	
	 
	 @Then("^User click on delete button$")
		public void User_click_on_delete_button() throws Throwable {
			groupsPage.clickDeleteIcon();
			Thread.sleep(3000);
		}
		
	 
	 @And("^User click on login icon$")
		public void User_click_on_login_icon() throws Throwable {
			groupsPage.clickUserIcon();
		}
		
	 
	 @And("^User click on signout button$")
		public void User_click_on_signout_button() throws Throwable {
			groupsPage.clickLogoutBtn();
		}

     

}
