package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//img[@alt='Profile picture']")
	@CacheLookup
	private WebElement accountprofile;
	
	@FindBy(xpath="//a[text()='Log out']")
	@CacheLookup
	private WebElement logout;
	
	@FindBy(xpath="//a[@aria-label='People & Organisations']")
	@CacheLookup
	private WebElement personIcone;
	
	@FindBy(xpath="//a[text()='Account Settings']")
	@CacheLookup
	private WebElement accountSettings;
	
	public void accountProfile()
	{
		accountprofile.click();
	}
	
	public void logOut()
	{
		accountprofile.click();
		logout.click();
	}
    public void clkPersonIcone()
    {
    	personIcone.click();
    }
    public void clkAccountSetting()
    {
    	accountSettings.click();
    }
}
