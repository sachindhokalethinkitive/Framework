package com.db.Regression;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;
import com.ttaf.PageObject.DashboardPage;
import com.ttaf.PageObject.PatientRegistrationPage;

import jxl.read.biff.BiffException;

public class PatientRegistrationPageTest extends TestBase {

	@DataProvider(name = "PatientData")
	public String[][] getDatafromExcel() throws BiffException, IOException {
		String str[][] = appLibrary.readExcel("Resources" + File.separator + "Patientdata1.xls", 0);
		return str;
	}

	// DataProvider for Reason for Appointment
	@DataProvider(name = "ReasonForAppointment")
	public String[][] getDatafromExcelforReason() throws BiffException, IOException {
		String str[][] = appLibrary.readExcel("Resources" + File.separator + "Patientdata1.xls", 1);
		return str;
	}

	@BeforeTest
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("Patient Registration With Insurance");

	}

	@Test(priority = 1)
	public void launchPage() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		new DashboardPage(appLibrary).launchPageCreateAccount();

	}

	@Test(priority = 2, dataProvider = "PatientData")
	public void accountCreation(String firstName, String lastName, String bMonth, String bDay, String bYear,
			String pSsnNum, String pAddress, String pCity, String pState, String postalCod, String pPhoneNo,
			String emailId, String pPass, String pCpass, String exeIndicator) throws Exception {

		if (exeIndicator.equalsIgnoreCase("Yes")) {

			new PatientRegistrationPage(appLibrary).verifyCreateYourAccountPage();
			new PatientRegistrationPage(appLibrary).patientRegistration(firstName, lastName, bMonth, bDay, bYear,
					pSsnNum, pAddress, pCity, pState, postalCod, pPhoneNo, emailId, pPass, pCpass);
		}

	}

	@Test(priority = 3, dataProvider = "ReasonForAppointment")
	public void reasonforAppointment(String reason, String exeIndicator) throws Exception {
		if (exeIndicator.equalsIgnoreCase("Yes")) {
			new PatientRegistrationPage(appLibrary).verifyAppointmentReasonpage();
			new PatientRegistrationPage(appLibrary).enterReasonforAppointment(reason);
			appLibrary.sleep(5000);
		}

	}

	@Test(priority = 4)
	public void selectProvider() throws Exception {
		new PatientRegistrationPage(appLibrary).verifySearchProviderpage();
		new PatientRegistrationPage(appLibrary).searchProvider();
		appLibrary.sleep(5000);
	}

	@Test(priority = 5)
	public void bookAppointment() throws Exception {
		new PatientRegistrationPage(appLibrary).verifyAvailableSlotsPage();
		new PatientRegistrationPage(appLibrary).selectDateforAppointment();

	}

	@Test(priority = 6)
	public void patientInsuranceDetails() throws Exception {
		new PatientRegistrationPage(appLibrary).fillInsuranceDetails();
	}

	@Test(priority = 7)
	public void savePatientDeatils() throws Exception {
		new PatientRegistrationPage(appLibrary).patientInformation();
		new PatientRegistrationPage(appLibrary).skipToAddCreditCardDetails();

	}

	@Test(priority = 8)
	public void appointmentConfirmationMessagePopup() throws Exception {
		new PatientRegistrationPage(appLibrary).appointmentConfirmationPage();
		new PatientRegistrationPage(appLibrary).confirmScheduledAppointment();
	}

	@Test(priority = 9)
	public void checkScheduledAppointment() throws Exception {
		new PatientRegistrationPage(appLibrary).scheduledAppointmentVerification();
	}
}
