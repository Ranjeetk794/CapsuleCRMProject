package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CasesPage {
	@FindBy(xpath="//a[normalize-space(text())='Cases']")
	@CacheLookup
	private WebElement casesBtn;
	
	@FindBy(xpath="//a[text()='Add Case']")
	@CacheLookup
	private WebElement addCaseBtn;
	@FindBy(id="caseNameDecorate:name")
	@CacheLookup
	private WebElement txtName;
	
	@FindBy(id="caseDescriptionDecorate:description")
	@CacheLookup
	private WebElement txtDescription;
	
	@FindBy(id="tagsDecorate:tagComboBox")
	@CacheLookup
	private WebElement txtTags;
	
	@FindBy(xpath="//select[@class='js-pretty-select pretty-select']")
	@CacheLookup
	private WebElement dropDownTrack;
	
    @FindBy(id="save")
    @CacheLookup
    private WebElement saveBtn;
    
    @FindBy(xpath="//span[text()='Open']")
    @CacheLookup
    private WebElement statusOpen;
    
    public WebElement status()
    {
		return statusOpen;
    }

	public void clkCasesBtn() {
		casesBtn.click();
	}
	public void clkAddCaseBtn()
	{
		addCaseBtn.click();
	}
  
    public void firstname(String firstname)
    {
    	txtName.sendKeys(firstname);
    }
	public void description(String Desc)
	{
		txtDescription.sendKeys(Desc);
	}
	public void tags(String tagsName )
	{
		txtTags.sendKeys(tagsName);
	}
	
	public void clkSaveBtn()
	{
		saveBtn.click();
	}

	
}
