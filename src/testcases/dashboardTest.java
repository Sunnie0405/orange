package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class dashboardTest extends TestBase {
	
	@Test(priority = 8)
	public void clickDashboardTest() throws IOException, InterruptedException {
		logger = extent.startTest("Dashboard Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Dashboard");
		hp.clickDashboard();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}
