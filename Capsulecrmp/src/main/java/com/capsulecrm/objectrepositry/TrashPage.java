package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TrashPage {
	
	@FindBy(linkText="Trash")
	@CacheLookup
	private WebElement trashLink;
	
	public void clkTrashLink()
	{
		trashLink.click();
	}
	@FindBy(xpath="//h2[@class='settings-page-header']")
	@CacheLookup
	private WebElement trashHeader;
	
	public WebElement verifyTrashHeader()
	{
		return trashHeader;
		
	}

}
