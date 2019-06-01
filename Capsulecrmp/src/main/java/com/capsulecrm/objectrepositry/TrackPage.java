package com.capsulecrm.objectrepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.capsulecrm.genericlib.BaseClass;
import com.capsulecrm.genericlib.WebDriver_Lib;


public class TrackPage {
	public static WebDriver_Lib wlib=new WebDriver_Lib();
	@FindBy(linkText = "Tracks")
	@CacheLookup
	private WebElement trackLink;
	
	public void clkTrackLink() throws Exception
	{
		Thread.sleep(1000);
		trackLink.click();
	}
	@FindBy(xpath="//h2[text()='Tracks']")
	@CacheLookup
	private WebElement trackHeader;
	
	public WebElement trackHeader()
	{
		return trackHeader;		
	}
	@FindBy(xpath="//a[text()='Add new Track']")
	@CacheLookup
	private WebElement addNewTrack;
	
	public void clkBtnAddNewTrack()
	{
		addNewTrack.click();	
	}
	
	@FindBy(id="j_id123:trackDescriptionDecorate:trackDescription")
	@CacheLookup
	private WebElement txtnewOPPTrack;
	
	public void newOPPTrackName(String name)
	{
		txtnewOPPTrack.sendKeys(name);
	}
	@FindBy(id="j_id123:trackTagDecorate:trackTag")
	@CacheLookup
	private WebElement txtTag;
	
	public void trackTag(String tag)
	{
		txtTag.sendKeys(tag);	
	}
	@FindBy(id="j_id123:taskLines:0:taskDescriptionDecorate:taskDescription")
	@CacheLookup
	private WebElement txtTaskDesc;
	
	public void taskDescription(String taskD)
	{
		txtTaskDesc.sendKeys(taskD);
	}
	@FindBy(xpath="//span[@class=\"ui-selectmenu-text ui-selectmenu-text-none\"]")
	@CacheLookup
	private WebElement selectCategory;
	
	public void clkSelectCategory()
	{
			String xpath="//li[text()='Follow-up']";
			selectCategory.click();
			BaseClass.Driver.findElement(By.xpath(xpath)).click();
	}
	@FindBy(id="j_id123:taskLines:0:taskDaysAfterDecorate:taskDaysAfter")
	@CacheLookup
	private WebElement due;
	
	public void txtDue(String tdue)
	{
		due.sendKeys(tdue);
	}
	@FindBy(xpath="//select[@id='j_id123:taskLines:0:taskDaysAfterDecorate:trackDayDelayRule']")
	@CacheLookup
	private WebElement dropDownDay;
	public WebElement selectDays(String day)
	{
		wlib.select(dropDownDay, day);
		return dropDownDay;		
	}
	@FindBy(xpath="//select[@name='j_id123:taskLines:0:taskAssignmentDecorate:j_id218']")
	@CacheLookup
	private WebElement drpAssign;
	
	public WebElement selectAsignee(String assign)
	{
		wlib.select(drpAssign, assign);
		return drpAssign;		
	}
	@FindBy(xpath="//a[text()='Save']")
	@CacheLookup
	private WebElement clkSave;
	
	public void clkSaveBtn()
	{
		clkSave.click();
	}
	
}

