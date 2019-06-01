package com.capsulecrm.genericlib;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.capsulecrm.objectrepositry.HomePage;
import com.capsulecrm.objectrepositry.LoginPage;
/**
 * 
 * @author Ranjeet Kumar on 5/29/2019
 *
 */
public class BaseClass {
  public Logger logger;
  public static WebDriver Driver;
  public static  File_Library flib=new File_Library();
  public static WebDriver_Lib wlib=new WebDriver_Lib();
  /**
   * Connect to database connection
   */
	@BeforeSuite
	public void configBS() {
		System.out.println("connect to database Connection");
		logger=Logger.getLogger("CapsulCRM");//added Logger
		PropertyConfigurator.configure("log4j.properties");//added logger
		logger.setLevel(Level.DEBUG);
	}
/**
 * Launch the Browser
 */
	@BeforeTest()
	public void configBT() {
		Reporter.log("confugere browser");
		Driver =new FirefoxDriver();
		Driver.manage().window().maximize();
		
	}
	/**
	 * Navigate to Url
	 * @throws Throwable
	 */
	@BeforeClass()
	public void configBC() throws Throwable
	{
		Reporter.log("Navigate to Url");
		Driver.get(flib.getpropertyKeyvalue("url"));
		wlib.waitforPageLoad(Driver);
		Driver.manage().window().maximize();
	}
	/**
	 * Login to Application
	 * @throws Throwable
	 */
	@BeforeMethod()
	public void configBM() throws Throwable
	{
		Reporter.log("Login to app");
		LoginPage LP=PageFactory.initElements(Driver, LoginPage.class);
		LP.loginApp();				
	}
	/**
	 * Logout the Application
	 * @throws Exception
	 */
	@AfterMethod()
	public void configAM() throws Exception
	{
		Reporter.log("Logout");
		HomePage HP=PageFactory.initElements(Driver, HomePage.class);
		Thread.sleep(4000);
		HP.logOut();
	}
	@AfterClass()
	public void configAC()
	{
		Reporter.log("close the browser");
	}
	/**
	 * quit the browser
	 */
	@AfterTest()
	public void configAT()
	{
		Reporter.log("close the browser");
		Driver.quit();
	}
/**
 * close the Database Connection
 */
	@AfterSuite
	public void configAS() {
		Reporter.log("close the data base Connection");
	}

}
