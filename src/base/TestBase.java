package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestBase {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void setUp() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\com.orange.framework\\resources\\exe\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		if (extent == null) {
			extent = new ExtentReports("C:\\Users\\User\\eclipse-workspace\\com.orange.framework\\resources\\Reports\\ExtentReports.html",true);
			extent.loadConfig(new File("C:\\Users\\User\\eclipse-workspace\\com.orange.framework\\resources\\Reports\\ReportsConfig.xml"));
			}
}
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		extent.flush();
	}
}
}
