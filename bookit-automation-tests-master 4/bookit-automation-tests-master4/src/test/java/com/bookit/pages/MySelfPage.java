package com.bookit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookit.utilities.Driver;

public class MySelfPage extends TopNavigationBar {
	public MySelfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "(//*[@class='title is-6'])[3]")
	public WebElement teamName;

}
