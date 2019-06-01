package com.capsulecrm.genericlib;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * 
 * @author Ranjeet Kumar on 5/29/2019
 *
 */
public class ListenerImpClass implements ITestListener {

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		String failedtestNAme = result.getMethod().getMethodName();
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.Driver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		// create a New File inside the frameWork
		File dstFile = new File("./screenshot/" + failedtestNAme + ".png");
		try {
			FileUtils.copyFile(srcFile, dstFile);
		} catch (IOException e) {

		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
