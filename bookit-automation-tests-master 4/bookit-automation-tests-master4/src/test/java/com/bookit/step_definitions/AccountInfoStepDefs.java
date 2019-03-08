package com.bookit.step_definitions;

import org.junit.Assert;

import com.bookit.pages.MapPage;
import com.bookit.pages.MySelfPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountInfoStepDefs {

	@When("the user goes to myself page")
	public void the_user_goes_to_myself_page() {
		// open the my self page
		new MapPage().goToSelf();
		
	}

	@Then("team name {string} should be displayed")
	public void team_name_should_be_displayed(String expectedTeamName) {
		MySelfPage mySelfPage = new MySelfPage();
		String actualTeamName = mySelfPage.teamName.getText();
		
		Assert.assertEquals(expectedTeamName, actualTeamName);
		
	}

}
