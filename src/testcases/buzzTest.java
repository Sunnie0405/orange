package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class buzzTest extends TestBase {
	
	@Test(priority= 11)
	public void clickDirectoryTest() throws IOException, InterruptedException {
		logger = extent.startTest("Buzz Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on Buzz");
		hp.clickBuzz();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}
