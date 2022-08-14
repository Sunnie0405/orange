package pages;

import org.openqa.selenium.By;

import base.TestBase;

public class HomePage extends TestBase{
	
	public void clickAdmin() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewPayGrades")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_employmentStatus")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_jobCategory")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_workShift")).click();
		driver.findElement(By.id("menu_admin_Organization")).click();
		driver.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();
		driver.findElement(By.id("menu_admin_Organization")).click();
		driver.findElement(By.id("menu_admin_viewLocations")).click();
		driver.findElement(By.id("menu_admin_Organization")).click();
		driver.findElement(By.id("menu_admin_viewCompanyStructure")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_viewEducation")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_viewLicenses")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_viewLanguages")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_membership")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		driver.findElement(By.id("menu_admin_addTheme")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_listMailConfiguration")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_viewEmailNotification")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_localization")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_languagePackage")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_viewModules")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_openIdProvider")).click();
		driver.findElement(By.id("menu_admin_Configuration")).click();
		driver.findElement(By.id("menu_admin_registerOAuthClient")).click();
		}
	
	public void clickPIM() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_Configuration")).click();
		driver.findElement(By.id("menu_pim_configurePim")).click();
		driver.findElement(By.id("menu_pim_Configuration")).click();
		driver.findElement(By.id("menu_pim_listCustomFields")).click();
		driver.findElement(By.id("menu_pim_Configuration")).click();
		driver.findElement(By.id("menu_admin_pimCsvImport")).click();
		driver.findElement(By.id("menu_pim_Configuration")).click();
		driver.findElement(By.id("menu_pim_viewReportingMethods")).click();
		driver.findElement(By.id("menu_pim_Configuration")).click();
		driver.findElement(By.id("menu_pim_viewTerminationReasons")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("menu_core_viewDefinedPredefinedReports")).click();
		}
	
	public void clickLeave() {
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		driver.findElement(By.id("menu_leave_Entitlements")).click();
		driver.findElement(By.id("menu_leave_addLeaveEntitlement")).click();
		driver.findElement(By.id("menu_leave_Entitlements")).click();
		driver.findElement(By.id("menu_leave_viewLeaveEntitlements")).click();
		driver.findElement(By.id("menu_leave_Entitlements")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveEntitlements")).click();
		driver.findElement(By.id("menu_leave_Reports")).click();
		driver.findElement(By.id("menu_leave_viewLeaveBalanceReport")).click();
		driver.findElement(By.id("menu_leave_Reports")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveBalanceReport")).click();
		driver.findElement(By.id("menu_leave_Configure")).click();
		driver.findElement(By.id("menu_leave_defineLeavePeriod")).click();
		driver.findElement(By.id("menu_leave_Configure")).click();
		driver.findElement(By.id("menu_leave_leaveTypeList")).click();
		driver.findElement(By.id("menu_leave_Configure")).click();
		driver.findElement(By.id("menu_leave_defineWorkWeek")).click();
		driver.findElement(By.id("menu_leave_Configure")).click();
		driver.findElement(By.id("menu_leave_viewHolidayList")).click();
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		driver.findElement(By.id("menu_leave_assignLeave")).click();
		}
	
	public void clickTime() {
		driver.findElement(By.id("menu_time_viewTimeModule")).click();	
		driver.findElement(By.id("menu_time_Timesheets")).click();
		driver.findElement(By.id("menu_time_viewMyTimesheet")).click();
		driver.findElement(By.id("menu_time_Timesheets")).click();
		driver.findElement(By.id("menu_time_viewEmployeeTimesheet")).click();
		driver.findElement(By.id("menu_attendance_Attendance")).click();
		driver.findElement(By.id("menu_attendance_viewMyAttendanceRecord")).click();
		driver.findElement(By.id("menu_attendance_Attendance")).click();
		driver.findElement(By.id("menu_attendance_punchIn")).click();
		driver.findElement(By.id("menu_attendance_Attendance")).click();
		driver.findElement(By.id("menu_attendance_viewAttendanceRecord")).click();
		driver.findElement(By.id("menu_attendance_Attendance")).click();
		driver.findElement(By.id("menu_attendance_configure")).click();
		driver.findElement(By.id("menu_time_Reports")).click();
		driver.findElement(By.id("menu_time_displayProjectReportCriteria")).click();
		driver.findElement(By.id("menu_time_Reports")).click();
		driver.findElement(By.id("menu_time_displayEmployeeReportCriteria")).click();
		driver.findElement(By.id("menu_time_Reports")).click();
		driver.findElement(By.id("menu_time_displayAttendanceSummaryReportCriteria")).click();
		driver.findElement(By.id("menu_admin_ProjectInfo")).click();
		driver.findElement(By.id("menu_admin_viewCustomers")).click();
		driver.findElement(By.id("menu_admin_ProjectInfo")).click();
		driver.findElement(By.id("menu_admin_viewProjects")).click();
		}
	
	public void clickRecruitment() {	
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
		driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
		}
	
	public void clickMyinfo() {	
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		}
	
	public void clickPerformance() {	
		driver.findElement(By.id("menu__Performance")).click();
		driver.findElement(By.id("menu_performance_Configure")).click();
		driver.findElement(By.id("menu_performance_searchKpi")).click();
		driver.findElement(By.id("menu_performance_Configure")).click();
		driver.findElement(By.id("menu_performance_addPerformanceTracker")).click();
		driver.findElement(By.id("menu_performance_ManageReviews")).click();
		driver.findElement(By.id("menu_performance_searchPerformancReview")).click();
		driver.findElement(By.id("menu_performance_ManageReviews")).click();
		driver.findElement(By.id("menu_performance_myPerformanceReview")).click();
		driver.findElement(By.id("menu_performance_ManageReviews")).click();
		driver.findElement(By.id("menu_performance_searchEvaluatePerformancReview")).click();
		driver.findElement(By.id("menu_performance_viewMyPerformanceTrackerList")).click();
		driver.findElement(By.id("menu_performance_viewEmployeePerformanceTrackerList")).click();
		}
	
	public void clickDashboard() {	
		driver.findElement(By.id("menu_dashboard_index")).click();
		//driver.findElement(By.id("dashboard-quick-launch-panel-container")).click();
		//driver.findElement(By.id("dashboard-quick-launch-panel-menu_holder")).click();
		//driver.findElement(By.xpath("//*[text()='Assign Leave')]")).click();
		//driver.findElement(By.id("menu_dashboard_index")).click();
		//driver.findElement(By.xpath("//*[text()='Leave List')]")).click();
		//driver.findElement(By.id("menu_dashboard_index")).click();
		//driver.findElement(By.xpath("//*[text()='Timesheets')]")).click();
		//driver.findElement(By.id("menu_dashboard_index")).click();
		//driver.findElement(By.xpath("//*[text()='Apply Leave')]")).click();
		//driver.findElement(By.id("menu_dashboard_index")).click();
		//driver.findElement(By.xpath("//*[text()='My Leave')]")).click();
		//driver.findElement(By.id("menu_dashboard_index")).click();
		//driver.findElement(By.xpath("//*[text()='My Timesheet')]")).click();
		}
	
	public void clickDirectory() {	
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		}
	
	public void clickMaintenance() {	
		driver.findElement(By.xpath("//*[contains(text()='Maintenance')]")).click();
		driver.findElement(By.id("menu_maintenance_PurgeRecords")).click();
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		driver.findElement(By.id("menu_maintenance_purgeCandidateData")).click();
		driver.findElement(By.id("menu_maintenance_accessEmployeeData")).click();
		}
	
	public void clickBuzz() {	
		driver.findElement(By.id("menu_buzz_viewBuzz")).click();
		}
	
	public void doLogout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	}

}
