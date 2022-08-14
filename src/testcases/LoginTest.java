package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.LoginPage;
import utilities.TestUtil;

public class LoginTest extends TestBase {
	
	@Test(priority = 1)
	public void loginTest() throws IOException, InterruptedException {
		logger = extent.startTest("Login Test");
		LoginPage lp = new LoginPage();
		logger.log(LogStatus.INFO, "Clicking on login button");
		lp.doLogin();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
		logger.log(LogStatus.INFO, "Login functionality successful");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
	}
}
