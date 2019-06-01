package com.capsulecrm.objectrepositry;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.capsulecrm.genericlib.BaseClass;


public class IntegrationPage {
	@FindBy(linkText = "Integrations")
	@CacheLookup
	private WebElement intergration;

	@FindBy(xpath="//h2[@class='settings-page-header']")
	@CacheLookup
	private WebElement integratHeader;
	
	@FindBys({ @FindBy(xpath = "//table[@id='j_id124:searchresults']/tbody/tr/td/a") })
	@CacheLookup
	private List<WebElement> totalConfiguration;
	
	public void clkIntegrationLink() {
		BaseClass.wlib.clickOn(intergration);
	}
	
	public WebElement integrationHeader()
	{
		return integratHeader;
		
	}

	public List<WebElement> countConfigLink() {
		return totalConfiguration;
}}
