package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class myinfoTest extends TestBase {
	
	@Test(priority = 6)
	public void clickMyinfoTest() throws IOException, InterruptedException {
		logger = extent.startTest("Myinfo Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on My Info");
		hp.clickMyinfo();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}

