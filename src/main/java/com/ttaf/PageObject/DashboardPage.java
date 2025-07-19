package com.ttaf.PageObject;

import com.ttaf.Library.AppLibrary;

public class DashboardPage {
	AppLibrary appLibrary;
	
	public static String createAccountLink="xpath://a[contains(text(),'Create Account')]";
	public static String pateintLoginLabel="xpath://div[contains(text(),'Patient Login ')]";
	public static String forgetPasswordLink="xpath://a[contains(text(),'Forgot Password ?')]";
	public static String contactSupportLink="xpath://a[contains(text(),'Contact Support')]";
	
	// Locators:Account Verification pop up
		public static String accountVerificationPopUp = "xpath://h2[@id='swal2-title']";
		public static String okBtn = "xpath://button[contains(text(),'OK')]";
	
	public DashboardPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}
	
	// Launch the page: Create Account
		public DashboardPage launchPageCreateAccount() throws Exception {

			if (appLibrary.findElement(createAccountLink).isEnabled()) {
				appLibrary.clickElement(createAccountLink);
				appLibrary.waitForPageToLoad();
			} else {
				// Handle Account verification pop up
				appLibrary.verifyElement(accountVerificationPopUp, true, 1000);
				appLibrary.clickElement(okBtn);
			}
			return new DashboardPage(appLibrary);

		}

		
		// Launch the page: Forget password
		public DashboardPage launchPageForgetPassword() throws Exception
		{
			if (appLibrary.findElement(forgetPasswordLink).isEnabled()) {
				appLibrary.clickElement(forgetPasswordLink);
				appLibrary.waitForPageToLoad();
			} else {
				// Handle Account verification pop up
				appLibrary.verifyElement(accountVerificationPopUp, true, 1000);
				appLibrary.clickElement(okBtn);
			}
			return new DashboardPage(appLibrary);
		}
		
		//Launch the page: Contact Support
		public DashboardPage launchPageContactSupport() throws Exception
		{
			if (appLibrary.findElement(contactSupportLink).isEnabled()) {
				appLibrary.clickElement(contactSupportLink);
				appLibrary.waitForPageToLoad();
			} else {
				// Handle Account verification pop up
				appLibrary.verifyElement(accountVerificationPopUp, true, 1000);
				appLibrary.clickElement(okBtn);
			}
			return new DashboardPage(appLibrary);
			
		}
		
		public DashboardPage verifyPatientLoginScreen() throws Exception
		{
			appLibrary.verifyElement(pateintLoginLabel, true, 1000);
			return new DashboardPage(appLibrary);
		}
}
