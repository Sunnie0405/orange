package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class adminTest extends TestBase {
	
	@Test(priority = 2)
	public void clickadminTest() throws IOException, InterruptedException {
		logger = extent.startTest("Admin Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Admin");
		hp.clickAdmin();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}



