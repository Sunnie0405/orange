package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class clickRecruitment extends TestBase {
	
	@Test(priority = 5)
	public void clickLeaveTest() throws IOException, InterruptedException {
		logger = extent.startTest("Recruitment Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Recruitment");
		hp.clickRecruitment();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();		
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
	}
}
