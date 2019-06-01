package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.capsulecrm.genericlib.BaseClass;


public class TagsPage {
	
	
	@FindBy(xpath = "//a[text()='Tags']/..")
	@CacheLookup
	private WebElement tagsLink;

	@FindBy(xpath = "//h2[text()='Tags and DataTags']")
	@CacheLookup
	private WebElement tagsHeader;

	@FindBy(id = "j_id125:j_id127")
	@CacheLookup
	private WebElement addnewTagBtn;

	@FindBy(name = "j_id177:tagNameDecorate:tagName")
	@CacheLookup
	private WebElement txtTagName;

	@FindBy(id = "j_id177:j_id210")
	@CacheLookup
	private WebElement addsaveBtn;
	
	public void clkTagsLink() throws Exception {
		Thread.sleep(1000);
		tagsLink.click();
	}
	public WebElement getTagLink()
	{
		return  tagsLink;
	}

	public WebElement tagsAndDatatagsHeader() {
		return tagsHeader;
	}

	public void clkAddNewTag() {
		addnewTagBtn.click();
	}

	public void addTagName(String add) throws Exception {
       Thread.sleep(1000);
		txtTagName.sendKeys(add);
	}

	public void clkAddSaveBtn() {
		BaseClass.wlib.waitforElementPresent(addsaveBtn);
		addsaveBtn.click();
	}
}
