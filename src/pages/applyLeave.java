package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class applyLeave extends TestBase {
	
	public void ApplyLeave() throws InterruptedException {
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		Select s = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		s.selectByValue("8");
		//driver.findElement(By.xpath("//*[text()='2022']")).click();
		//driver.findElement(By.xpath("//*[text()='Sep']")).click();
		//driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2022-09-20");
		driver.findElement(By.name("applyleave[txtComment]")).sendKeys("Leave approved");
		Thread.sleep(2000);
		driver.findElement(By.id("applyBtn")).click();
	}

}

	