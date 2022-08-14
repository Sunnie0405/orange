package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class LogoutTest extends TestBase {
	
	@Test(priority = 12)
	public void doLogout() throws IOException, InterruptedException {
		logger = extent.startTest("Logout Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on logout");
		hp.doLogout();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
		
	}

	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
	}
}
