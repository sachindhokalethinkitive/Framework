package com.db.Regression;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;
import com.ttaf.PageObject.DashboardPage;
import com.ttaf.PageObject.PatientLogin;

import jxl.read.biff.BiffException;

public class PatientLoginTest extends TestBase {
	@DataProvider(name = "PatientLoginData")
	public String[][] getDatafromExcel() throws BiffException, IOException {
		String str[][] = appLibrary.readExcel("Resources" + File.separator + "UserData.xls", 0);
		return str;
	}

	@BeforeTest
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("Patient Login ");

	}

	@Test(priority = 1)
	public void launchPage(String userNm, String pwd) throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		new DashboardPage(appLibrary).verifyPatientLoginScreen();

	}

	@Test(priority = 2, dataProvider = "PatientLoginData")
	public void loginToPage(String exeIndicator, String emailAddress, String pwd) throws Exception {
		if (exeIndicator.equalsIgnoreCase("Yes")) {
			new PatientLogin(appLibrary).patientLogin(emailAddress, pwd);
			new PatientLogin(appLibrary).verifyPatientDashBoard();
			new PatientLogin(appLibrary).verifyPatientProfile();
		}

		else if (appLibrary.findElement(PatientLogin.noAccountMsg).isDisplayed()) {

			new PatientRegistrationPageTest();

		}
	}
}
