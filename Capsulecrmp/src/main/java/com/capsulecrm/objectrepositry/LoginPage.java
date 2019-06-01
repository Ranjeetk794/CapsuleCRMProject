package com.capsulecrm.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.capsulecrm.genericlib.File_Library;



public class LoginPage {
	public static final File_Library flib=new File_Library();
	@FindBy(id="login:usernameDecorate:username")
	@CacheLookup
	private WebElement txtuserName;
	
	@FindBy(id="login:passwordDecorate:password")
	@CacheLookup
	private WebElement txtPassword;
	
	@FindBy(id="login:login")
	@CacheLookup
	private WebElement clkBtnLogin;
	
	public void loginApp() throws Throwable
	{
		txtuserName.sendKeys(flib.getpropertyKeyvalue("userName"));
		txtPassword.sendKeys(flib.getpropertyKeyvalue("password"));
		clkBtnLogin.click();
		
	}
	

}
