package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UsersPage {
	@FindBy(xpath = "//a[text()='Users']")
	@CacheLookup
	private WebElement userLink;
	public void clkUsers() {
		userLink.click();
	}

	@FindBy(xpath = "//h2[text()='Users']")
	@CacheLookup
	public WebElement userHeader;
	
	public WebElement usersHeader() {
		return userHeader;
	}
	@FindBy(xpath = "//a[text()='Add new User']")
	@CacheLookup
	private WebElement btnAddNewUser;

	public void clkAddNewuserBtn() {
		btnAddNewUser.click();
	}
	@FindBy(id="register:firstnameDecorate:firstName")
	@CacheLookup
	private WebElement txtFirstName;
	
	@FindBy(id="register:lastNameDecorate:lastName")
	@CacheLookup
	private WebElement txtLastname;
	
	@FindBy(id="register:emailDecorate:email")
	@CacheLookup
	private WebElement txtEmailAddress;
	
	@FindBy(id="register:usernameDecorate:username")
	@CacheLookup
	private WebElement txtUserNmae;
	
	@FindBy(id="register:save")
	@CacheLookup
	private WebElement btnInviteUser;
	
	public void firstname(String firstname)
	{
		txtFirstName.sendKeys(firstname);
	}	
	
	public void lastName(String lastname)
	{
		txtLastname.sendKeys(lastname);
	}
	public void emailAddress(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	public void userName(String usename)
	{
		txtUserNmae.sendKeys(usename);		
	}
	public void inviteUser()
	{
		btnInviteUser.click();
	}
}
