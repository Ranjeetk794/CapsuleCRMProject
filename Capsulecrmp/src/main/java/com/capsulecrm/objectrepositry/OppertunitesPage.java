package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OppertunitesPage {
	@FindBy(linkText = "Opportunities")
	@CacheLookup
	private WebElement opportunitiesLink;

	@FindBy(xpath = "//header[text()='Opportunities']")
	@CacheLookup
	private WebElement OpporHeader;

	@FindBy(xpath = "//button[text()='Add new Milestone']")
	@CacheLookup
	private WebElement addnewMilestone;

	@FindBy(xpath = "//a[text()='Milestones']")
	@CacheLookup
	private WebElement milestoneLink;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-name']")
	@CacheLookup
	private WebElement txtname;

	@FindBy(xpath = "//textarea[@class='form-input-text milestone-modal-description']")
	@CacheLookup
	private WebElement txtDescription;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-probability']")
	@CacheLookup
	private WebElement txtProbWining;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-days-until-stale']")
	@CacheLookup
	private WebElement txtDaysuntilStale;

	@FindBy(xpath = "//button[text()='Save']")
	@CacheLookup
	private WebElement btnSave;
	public void clkOpportunities() {
		opportunitiesLink.click();
	}

	public WebElement OpportunitiesHeader() {
		return OpporHeader;
	}

	public void name(String name) {
		txtname.sendKeys(name);
	}

	public void description(String Desc) {
		txtDescription.sendKeys(Desc);
	}

	public void probabilityWining(String probwin) {
		txtProbWining.sendKeys(probwin);
	}

	public void daysUntilStale(String daysuntil) {
		txtDaysuntilStale.sendKeys(daysuntil);
	}

	public void clkBtnSave() {
		btnSave.click();
	}

	public void clkAddnewMileStone() {
		addnewMilestone.click();
	}
}
