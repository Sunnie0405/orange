package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class maintenanceTest extends TestBase {
	
	@Test(priority = 10)
	public void clickMaintenanceTest() throws IOException, InterruptedException {
		logger = extent.startTest("Maintenance Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Maintenance");
		hp.clickMaintenance();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}
