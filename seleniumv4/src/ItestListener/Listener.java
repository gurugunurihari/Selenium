package ItestListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Listener extends Test implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("failur",true);
		TakesScreenshot ts=(TakesScreenshot)wd;
	File source	=ts.getScreenshotAs(OutputType.FILE);
	File dis=new File("C:\\Users\\syed saddam hussain\\OneDrive\\Desktop\\final mock\\seleniumv4\\takescreenshot\\img.png");
	try {
		Files.copy(source, dis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("start",true);
	}
		
}
