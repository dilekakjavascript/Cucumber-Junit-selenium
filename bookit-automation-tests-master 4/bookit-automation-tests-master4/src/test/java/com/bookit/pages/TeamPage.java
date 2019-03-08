package com.bookit.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookit.utilities.Driver;
public class TeamPage {
	public TeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}


	
	@FindBy(xpath="//p[.='name']/preceding-sibling::p[@class='title is-6']")
    public List<WebElement> teamMemberNames;

    @FindBy(xpath="//p[.='role']/preceding-sibling::p[@class='title is-6']")
    public List<WebElement> teamMemberRoles;
}
