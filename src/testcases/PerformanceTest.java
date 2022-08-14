package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class PerformanceTest extends TestBase{
	
	@Test(priority = 7)
	public void clickperformanceTest() throws IOException, InterruptedException {
		logger = extent.startTest("Performance Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Performance");
		hp.clickPerformance();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}

}
