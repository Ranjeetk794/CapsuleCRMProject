package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.capsulecrm.genericlib.BaseClass;

public class AccountSetting {
	@FindBy(xpath = "//span[text()='Account Settings']")
	@CacheLookup
	private WebElement accountSettingheader;

	@FindBy(xpath = "//a[text()='Account']")
	@CacheLookup
	private WebElement accountLink;

	@FindBy(xpath = "//h1[text()='Account']")
	@CacheLookup
	private WebElement account;

	@FindBy(linkText = "Invoices")
	@CacheLookup
	private WebElement invoceLink;

	@FindBy(xpath = "//header[text()='Invoices']")
	@CacheLookup
	private WebElement invoiceHeader;

	@FindBy(linkText = "Export")
	@CacheLookup
	private WebElement exportLink;

	@FindBy(xpath = "//h1[text()='Export']")
	@CacheLookup
	private WebElement exportHeader;

	@FindBy(xpath = "//a[text()='Mail Drop Box']")
	@CacheLookup
	private WebElement maildropbox;

	@FindBy(xpath = "//h2[text()='Mail Drop Box']")
	@CacheLookup
	private WebElement mailDropHeader;

	@FindBy(linkText = "Task Categories")
	@CacheLookup
	private WebElement taskCategories;

	@FindBy(linkText = "//div[@class='settings-page-content']/h2")
	@CacheLookup
	private WebElement tskCategHeader;

	@FindBy(xpath = "//a[@class='action btn-primary btn-clear']")
	@CacheLookup
	private WebElement addNewCatg;

	@FindBy(xpath = "//input[@id='editCategoryForm:taskCategoryNameDecorate:taskCategoryName']")
	@CacheLookup
	private WebElement txttaskName;

	@FindBy(id = "editCategoryForm:j_id175")
	@CacheLookup
	private WebElement tskbtnSave;

	public WebElement acoountSettinHeader() {
		return accountSettingheader;
	}

	public void clkAccountLink() {
		accountLink.click();
	}

	public WebElement accountHeader() {
		return account;
	}

	public void clkInvoiceLink() {
		invoceLink.click();
	}

	public WebElement invoiceHeader() {
		return invoiceHeader;
	}

	public void clkExportLink() {
		exportLink.click();
	}

	public WebElement exportHeader() {
		return exportHeader;
	}

	public void clkMailDropBox() {
		maildropbox.click();
	}

	public WebElement mailDropHeader() {
		return mailDropHeader;
	}

	public void clkTaskCategories() {
		taskCategories.click();
	}

	public WebElement tskcategoryHeader() throws Exception {
		BaseClass.wlib.waitforElementPresent(tskCategHeader);
		return tskCategHeader;
	}

	public void clkAddNewCategory() {
		addNewCatg.click();
	}

	public WebElement taskCatName() {
		return txttaskName;

	}

	public void taskCatgName(String name) throws Exception {
		Thread.sleep(1000);
		txttaskName.sendKeys(name);
	}

	public void clktskCatBtnSave() {
		tskbtnSave.click();
	}

}
