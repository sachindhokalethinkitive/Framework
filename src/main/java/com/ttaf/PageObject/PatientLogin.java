package com.ttaf.PageObject;

import com.ttaf.Library.AppLibrary;

public class PatientLogin {
	AppLibrary appLibrary;
	
	public static String userNameTxtbox="id:userName";
	public static String passwordTxtbox="id:password";	
	public static String loginBtn="xpath://button[contains(text(),' Login ')]";
	public static String noAccountMsg="xpath://span[contains(text(),'You may have entered an incorrect username or password.')";
	
	//Locators: Menu otions
	public static String appointmentMenu="xpath://span[contains(text(),'Appointments')]";
	public static String profileMenu="xpath://span[contains(text(),'Profile')]";
	public static String settingMenu="xpath://span[contains(text(),'Settings')]";
	public static String signOutMenu="xpath://span[contains(text(),'Sign out')]";
	
	//Locators for Profile Page
	public static String editBtn="xpath://i[@class='fal fa-pencil']";
	public static String emailIdTxtbox="xpath://input[@type='email']";
	
	
	public PatientLogin(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}
//Patient Login
	public PatientLogin patientLogin(String userNm,String pwd) throws Exception
	{
		appLibrary.enterText(userNameTxtbox, userNm);
		appLibrary.enterText(passwordTxtbox, pwd);
		appLibrary.clickElement(loginBtn);
		
		
		return new PatientLogin(appLibrary);
	}
	//After patient Login Verify Patient dashboard
	public PatientLogin verifyPatientDashBoard() throws Exception
	{
		appLibrary.verifyElement(appointmentMenu, true, 1000);
		return new PatientLogin(appLibrary);
	}
	
	public PatientLogin verifyPatientProfile()throws Exception
	{
		appLibrary.clickElement(profileMenu);
		appLibrary.clickElement(editBtn);
		appLibrary.findElement(emailIdTxtbox.replace("replace", userNameTxtbox));
		
		return new PatientLogin(appLibrary);
	}
}
