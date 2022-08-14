package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class LeaveTest extends TestBase {
	
	@Test(priority = 3)
	public void clickLeaveTest() throws IOException, InterruptedException {
		logger = extent.startTest("Leave Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on leave");
		hp.clickLeave();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}
