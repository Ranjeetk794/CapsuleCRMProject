package com.capsulecrm.objectrepositry;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.capsulecrm.genericlib.BaseClass;

public class AddPerson {
	
	@FindBy(xpath = "//a[text()='Add Person']")
	@CacheLookup
	private WebElement addPerson;

	@FindBy(xpath = "(//select[@class='js-pretty-select pretty-select'])[1]")
	@CacheLookup
	private WebElement dropDownTitle;

	@FindBy(id = "party:fnDecorate:fn")
	@CacheLookup
	private WebElement txtFirstName;

	@FindBy(id = "party:lnDecorate:ln")
	@CacheLookup
	private WebElement txtLastName;

	@FindBy(id = "party:roleDecorate:jobTitle")
	@CacheLookup
	private WebElement txtJobTitle;

	@FindBy(id = "party:orgDecorate:org")
	@CacheLookup
	private WebElement txtOrgnisation;

	@FindBy(id = "party:tagsDecorate:tagComboBox")
	@CacheLookup
	private WebElement txtTags;

	@FindBy(id = "party:j_id325:0:phnDecorate:number")
	@CacheLookup
	private WebElement txtPhoneNumber;

	@FindBy(xpath = "(//select[@class='js-pretty-select pretty-select'])[2]")
	@CacheLookup
	private WebElement dropdownphone;

	@FindBy(id = "party:j_id342:0:emlDecorate:nmbr")
	@CacheLookup
	private WebElement txtEmailId;

	@FindBy(xpath = "(//select[@class='js-pretty-select pretty-select'])[3]")
	@CacheLookup
	private WebElement dropdownemail;

	@FindBy(id = "party:j_id370:0:webDecorate:web")
	@CacheLookup
	private WebElement txtSocialNetwork;

	@FindBy(xpath = "(//select[@class='js-pretty-select pretty-select'])[4]")
	@CacheLookup
	private WebElement dropDownSocialnetwork;

	@FindBy(xpath = "(//select[@class='js-pretty-select pretty-select'])[5]")
	@CacheLookup
	private WebElement dropDownWebsiteHome;
	
	@FindBy(id="party:save")
	@CacheLookup
	private WebElement btnSave;
	
	
	
	public void clkSaveBtn()
	{
		btnSave.click();
	}

	public void clkAddPersonBtn() {
		addPerson.click();
	}

	public WebElement dropDownBoxTitle(String mr) {
		BaseClass.wlib.select(dropDownTitle, mr);
		return dropDownTitle;
	}

	public void firstName(String firstname) {
		txtFirstName.sendKeys(firstname);
	}

	public void lastName(String lastname) {
		txtLastName.sendKeys(lastname);
	}

	public void jobTitle(String jobtitle) {
		txtJobTitle.sendKeys(jobtitle);
	}

	public void orgnisation(String orgnisation) {
		txtOrgnisation.sendKeys(orgnisation);
	}

	public void tags(String tg) {
		txtTags.sendKeys(tg);
	}

	public void phoneNumber(String ph_no) {
		txtPhoneNumber.sendKeys(ph_no);
	}
	public WebElement selectPhone(String work)
	{
		BaseClass.wlib.select(dropdownphone, work);
		return dropdownphone;
	}

	public void emailID(String email) {
		txtEmailId.sendKeys(email);
	}

	/* random email id will print */
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(8);
		return (generatedString1);
	}

	/* random phone no will print */
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}

	public WebElement selectEmail(String work) {
		BaseClass.wlib.select(dropdownemail, work);
		return dropdownemail;
	}

	public void socialNetwork(String social) {
		txtSocialNetwork.sendKeys(social);
	}

	public WebElement selectSocialNtwrk(String twiter) {
		BaseClass.wlib.select(dropDownSocialnetwork, twiter);
		return dropDownSocialnetwork;
	}

	public WebElement selectSocialWebSite(String home) {
		BaseClass.wlib.select(dropDownWebsiteHome, home);
		return dropDownWebsiteHome;
	}

}
