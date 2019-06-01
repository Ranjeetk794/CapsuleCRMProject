package com.capsulecrm.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Ranjeet Kumar on 5/29/2019
 *
 */
public class WebDriver_Lib {
/**
 * its used to implicitly wait target for entire page load before perform action
 * on element maximum time unit 15 second
 * 
 * @param Driver
 */
public void waitforPageLoad(WebDriver Driver) {
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

/**
 * its used to explicitly wait for Target specific element maximum time unit 15
 * seconds
 * 
 * @param Driver
 * @param element
 */
public void waitforElementPresent(WebElement element) {
	WebDriverWait wait = new WebDriverWait(BaseClass.Driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * its used to explicitly wait for Target specific element maximum time unit 15
 * seconds
 * 
 * @param Driver
 * @param element
 */
public void waitforElelmentpersentVisibility(WebElement element)
{
	WebDriverWait wait = new WebDriverWait(BaseClass.Driver, 15);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
/**
 * it's used to click explicit wait for Target element time unit 15 seconds
 * @param item
 */
public void clickOn(WebElement locator)
{
       new WebDriverWait(BaseClass.Driver,15).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
       locator.click();

   }
/**
 * it's used to to explicitly wait for Target specific element maximum time unit 15
 * seconds
 * @param item
 */
public void waitForElement(WebElement element) {
    WebDriverWait wait = new WebDriverWait(BaseClass.Driver,15);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("item")));
}


/**
 * its used for select element dropDown ,select the value based on option data
 * 
 * @param element
 * @param option
 */
public void select(WebElement element, String option) {
	Select sel = new Select(element);
	sel.selectByVisibleText(option);
}
public void waitandclick(WebElement element)
{
	try
	{
		element.click();
	}
	catch(Throwable e) 
	{
	}
}

/**
 * its used for select element dropDown ,select the value based on index data
 * 
 * @param element
 * @param index
 */
public void select(WebElement element, int index) {
	Select sel = new Select(element);
	sel.selectByIndex(index);
}

/**
 * its used perform user interaction operation
 * 
 * @param Driver
 * @param wb
 */
public void mouseOver( WebElement wb) {
	Actions act = new Actions(BaseClass.Driver);
	act.moveToElement(wb).build().perform();
}
}

