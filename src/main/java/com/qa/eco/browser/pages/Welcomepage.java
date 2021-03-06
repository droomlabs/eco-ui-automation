package com.qa.eco.browser.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eco.base.TestBase;
import com.qa.eco.base.TestBaseBrowser;
import com.qa.eco.pages.LoginPage;
import com.qa.eco.pages.Services;
import com.qa.utils.TestUtils;

public class Welcomepage extends BrowserMenu {
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section[2]/h1") WebElement WelcomeText;
	@FindBy(xpath="//a[@href='/home']") WebElement OrderManagementButton;
	@FindBy(xpath="//a[@class='dropdown-toggle']") WebElement Profile_btn;
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement Logout_btn;

	TestUtils utils = new TestUtils();
	
	public Welcomepage checkPageOpening() {
		boolean x=isElementDisplayedb(WelcomeText);
		 if(x == true) {
			 utils.log().info("successful login");
		 }
		 else {
			 utils.log().info("no login");
			 }
		
		return this;
	}
	
	

}
