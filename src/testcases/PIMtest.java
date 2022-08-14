package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import java.io.IOException;
import pages.HomePage;
import utilities.TestUtil;

public class PIMtest extends TestBase {
	
	@Test(priority = 2)
	public void clickPIMTest() throws IOException, InterruptedException {
		logger = extent.startTest("PIM Test");
		HomePage hp = new HomePage();
		logger.log(LogStatus.INFO, "Clicking on PIM");
		hp.clickPIM();
		Thread.sleep(3000);
		TestUtil.CaptureScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		extent.endTest(logger);
		
	}
}



