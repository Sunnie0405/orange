package pages;

import org.openqa.selenium.By;

import base.TestBase;

public class LoginPage extends TestBase {
	
	public void doLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
