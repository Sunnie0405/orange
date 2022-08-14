package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.applyLeave;
import utilities.TestUtil;

public class applyLeavetest extends TestBase {
	
	@Test(priority = 2)
	public void clickadminTest() throws IOException, InterruptedException {
		logger = extent.startTest("Apply Leave Test");
		applyLeave al = new applyLeave();
		logger.log(LogStatus.INFO, "Clicking on Apply");
		al.ApplyLeave();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}

}
