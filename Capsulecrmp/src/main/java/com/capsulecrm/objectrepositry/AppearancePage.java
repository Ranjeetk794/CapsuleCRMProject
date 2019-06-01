package com.capsulecrm.objectrepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.capsulecrm.genericlib.BaseClass;

public class AppearancePage {
	@FindBy(xpath = "//a[text()='Appearance']")
	@CacheLookup
	private WebElement appearnceLink;

	@FindBy(xpath = "//h1[text()='Appearance']")
	@CacheLookup
	private WebElement apperanceHeader;

	@FindBy(id = "//input[@id='appearance:uploadDecorate:logoImage']")
	@CacheLookup
	private WebElement choseFile;
	public void clkAppearanceLink() {
		appearnceLink.click();
	}

	public WebElement apperanceHeader() {
		return apperanceHeader;
	}

	public void clkChoseFileBtn() {
		BaseClass.Driver.findElement(By.xpath("//input[@id='appearance:uploadDecorate:logoImage']"))
				.sendKeys("C:\\Users\\Ranjeet Kumar\\Desktop\\2.png");
	}

}
