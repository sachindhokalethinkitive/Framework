package com.ttaf.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ttaf.Library.AppLibrary;

public class PatientRegistrationPage {
	WebDriver driver;
	AppLibrary appLibrary;
	String filePath = "D:\\ls\\appmon_nod\\Resources";

//Locators:Patient Registration
	
	public static String firstNametbox = "id:firstName";
	public static String lastNametbox = "id:lastName";
	public static String monthDropdown = "xpath://select[@name='month']";
	public static String dayDropdown = "xpath://select[@name='day']";
	public static String yearDropdown = "xpath://select[@name='year']";
	public static String ssnTbox = "xpath://input[@id='ssn']";
	public static String maleRadiobtn = "xpath://*[@id='mat-radio-2']";
	public static String femaleRadiobtn = "xpath://*[@id='mat-radio-3']";
	public static String addressTbox = "xpath://input[@id='']";
	public static String cityTbox = "xpath://input[@id='city']";
	public static String stateDropDown = "xpath://select[@name='state']";
	public static String postalCodetbox = "xpath://input[@id='zip']";
	public static String phoneNumbertbox = "xpath://input[@id='mobilePhoneNumber']";
	public static String emailTbox = "xpath://input[@id='emailId']";
	public static String passwordTbox = "xpath://input[@id='password']";
	public static String confirmPasswordtbox = "xpath://input[@id='repassword']";
	public static String nextBtn = "xpath://button[contains(text(),'Next')]";
	public static String createYourAccountLabel = "xpath://h3[contains(text(),'Create Your Patient Account')]";
	

	// Locators:Reason for Appointment
	public static String reasonForAppointmentTbox = "xpath://*[@id='reasone']";
	public static String reasonNextBtn = "xpath://button[contains(text(),'Next')]";
	// Locators:Find your Provider
	public static String searchProvider = "xpath://*[@id='reasone']";
	public static String providerSearchBtn = "xpath://button[contains(text(),'Search')]";
	public static String selectProvider = "xpath://h5[contains(text(),'Dr. Chris')]";

	// Locators: Available time slots
	public static String availableTimeLabel = "xpath://span[contains(text(),'Show available times for')]";
	public static String selectAppointmentDate = "xpath://td[@tabindex='0']";
	public static String selectTime = "xpath://label[@for='1']";
	public static String confirmBtn = "xpath://div[contains(text(),'Confirm')]";
	// Locators: Patient information (Save/Edit Page)
	public static String saveInfoBtn = "xpath://button[contains(text(),' Save Information ')]";

	// Locators:Fill Patient insurance details
	public static String insuranceCompanyNameTbox = "xpath:(//div[@class='wrapper-input']//input[@class='input ng-untouched ng-pristine ng-invalid'])[1]";
	public static String insuranceCompanyPhonenoTbox = "xpath://*[@id='insuranceInfoModal']/div/div/div[2]/form/div[3]/div/div[1]/div[1]/div/div[2]/div/input";
	public static String relationshipWithPatientDropdown = "xpath://select[@name='patientsRelationshipToPolicyHolderAthena']//option[contains(text(),'Self')]";
	public static String insuranceNumberTbox = "xpath://*[@id='insuranceInfoModal']/div/div/div[2]/form/div[3]/div/div[1]/div[4]/div/div[1]/div/input";
	public static String groupNumberTbox = "xpath://*[@id='insuranceInfoModal']/div/div/div[2]/form/div[3]/div/div[1]/div[4]/div/div[2]/div/input";
	public static String submitInsuranceInfoBtn = "xpath://button[contains(text(),'Next')]";
	public static String uploadInsuranceCard = "xpath://i[@class='fas fa-medkit']";
	// public static String
	// skipCreditCardBtn="xpath://button[contains(text(),'Next')]";
	public static String skipUploadInsuranceCardBtn = "xpath://button[contains(text(),'Next')]";

	// Locators: Add Credit card details
	public static String addCreditCardDetailsBtn = "xpath://button[contains(text(),'Add Credit Card Details')]";
	public static String skipInsuranceLink = "xpath://div[@class='info-mobile col-md-7 col-lg-7 col-sm-3 model-a']//a";
	public static String cardNumberTbox = "xpath://accept-main//div[@class='floating-placeholder-cc']//input[@id='cardNum']";
	public static String expiryDateTbox = "xpath://input[@id='expiryDate']";
	public static String cardCodeTbox = "xpath://input[@id='cvv']";
	public static String firstNameTbox = "xpath://input[@name='firstName']";
	public static String lastNameTbox = "xpath://input[@name='lastName']";
	public static String zipTbox = "xpath://input[@name='zip']";
	public static String submitCardDetailsBtn = "xpath://button[@name='Submit']";
	public static String creditCardNextBtn = "xpath://button[contains(text(),'Next')]";
	public static String confirmationPopupMsg = "xpath://*[@id='finalAppointmentConfirmModal']/div/div/form/div[1]/div/div/h4[1]";
	public static String confirmAppointmentBtn = "xpath://button[contains(text(),'Confirm')]";
	public static String skipCreditCardBtn = "xpath://button[contains(text(),'Next')]";
	public static String cardInfoPopup = "xpath://accept-main/div/div[1]";
	public static String cardPopup = "xpath://noscript";

	// Locators: Verify Appointment scheduled successfully Message(Via Skip
	// insurance flow)
	public static String appointmentScheduledMsg = "xpath://div[@class='col-md-12 col-lg-12 m-t-10 modal-info']//h4[contains(text(),' Your appointment has been successfully scheduled. ')]";
	public static String completePatientProfileBtn = "xpath://div[@class='col-md-12 col-lg-12 m-t-50']//a[contains(text(),' Complete Patient Profile')]";

	// Locators: Appointment scheduled Confirmation message
	public static String appointmentscheduledMessage = "xpath://*[contains(text(),' Your appointment has been successfully scheduled. ')]";
	public static String completePatientProfileButton = "xpath://div[@class='col-md-12 col-lg-12 m-t-50']//a";

	// Locators:After Login to patient portal
	public static String verifyDate = "xpath://td[@class='widthDate']";
	public static String verifyTime = "xpath://tr[@class='activated']/td[2]";
	public static String verifyProvider = "xpath://tr[@class='activated']/td[3]";

	public PatientRegistrationPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}
//Verify Create your account page
	public DashboardPage verifyCreateYourAccountPage() throws Exception {
		appLibrary.waitTillElementLoaded(createYourAccountLabel);
		appLibrary.verifyElement(createYourAccountLabel, true, 1000);
		return new DashboardPage(appLibrary);
	}

	// Patient Registration
	public PatientRegistrationPage patientRegistration(String fName, String lName, String month, String day,
			String year, String ssnNum, String address, String city, String state, String postalCode, String phoneNo,
			String emailAddress, String pass, String cPass) throws Exception {

		// Web elements
		WebElement monthSelect = appLibrary.findElement(monthDropdown);
		WebElement daySelect = appLibrary.findElement(dayDropdown);
		WebElement yearSelect = appLibrary.findElement(yearDropdown);
		WebElement stateSelect = appLibrary.findElement(stateDropDown);

		appLibrary.enterText(firstNametbox, fName);
		appLibrary.enterText(lastNametbox, lName);
		appLibrary.selectElement(monthSelect, month);
		appLibrary.selectElement(daySelect, day);
		appLibrary.selectElement(yearSelect, year);
		appLibrary.enterText(ssnTbox, ssnNum);
		appLibrary.clickElement(maleRadiobtn);
		appLibrary.enterText(addressTbox, address);
		appLibrary.enterText(cityTbox, city);
		appLibrary.selectElement(stateSelect, state);
		appLibrary.enterText(postalCodetbox, postalCode);
		appLibrary.enterText(phoneNumbertbox, phoneNo);
		appLibrary.enterText(emailTbox, emailAddress);
		appLibrary.enterText(passwordTbox, pass);
		appLibrary.enterText(confirmPasswordtbox, cPass);
		appLibrary.clickElement(nextBtn);

		return new PatientRegistrationPage(appLibrary);

	}
	
	
	// Verify Appointment reason popup
	public PatientRegistrationPage verifyAppointmentReasonpage() throws Exception {

		appLibrary.verifyElement(reasonForAppointmentTbox, true, 1000);

		return new PatientRegistrationPage(appLibrary);

	}

	// Enter Reason for Appointment
	public PatientRegistrationPage enterReasonforAppointment(String reasonForAppointment) throws Exception {
		appLibrary.enterText(reasonForAppointmentTbox, reasonForAppointment);
		appLibrary.clickElement(reasonNextBtn);
		return new PatientRegistrationPage(appLibrary);
	}

	// Verify search provider pop up
	public PatientRegistrationPage verifySearchProviderpage() throws Exception {
		appLibrary.verifyElement(searchProvider, true, 1000);
		return new PatientRegistrationPage(appLibrary);
	}

	// Search Provider by name
	public PatientRegistrationPage searchProvider() throws Exception {
		appLibrary.enterText(searchProvider, "Chris");
		appLibrary.clickElement(providerSearchBtn);
		appLibrary.clickElement(selectProvider);
		return new PatientRegistrationPage(appLibrary);
	}

	// Verify provider's available slots
	public PatientRegistrationPage verifyAvailableSlotsPage() throws Exception {
		appLibrary.verifyElement(availableTimeLabel, true, 1000);
		return new PatientRegistrationPage(appLibrary);
	}

	// Select Date and time for appointment
	public PatientRegistrationPage selectDateforAppointment() throws Exception {
		appLibrary.clickElement(selectAppointmentDate);
		appLibrary.waitTillElementLoaded(selectTime);
		appLibrary.clickElement(selectTime);
		appLibrary.clickElement(confirmBtn);
		appLibrary.sleep(3000);

		return new PatientRegistrationPage(appLibrary);
	}

	// Skip fill insurance info page
	public PatientRegistrationPage skipInsurance() throws Exception {
		appLibrary.clickElement(skipInsuranceLink);

		return new PatientRegistrationPage(appLibrary);
	}

	// Save/Edit patient information page
	public PatientRegistrationPage patientInformation() throws Exception {
		appLibrary.clickElement(saveInfoBtn);
		return new PatientRegistrationPage(appLibrary);
	}

	// Skip to add credit card details
	public PatientRegistrationPage skipToAddCreditCardDetails() throws Exception {
		appLibrary.waitForPageToLoad();
		appLibrary.clickElement(skipCreditCardBtn);
		return new PatientRegistrationPage(appLibrary);
	}

	// Add credit card details page
	public PatientRegistrationPage addCreditCarddetails() throws Exception {
		appLibrary.waitTillElementLoaded(addCreditCardDetailsBtn);
		appLibrary.findElement(addCreditCardDetailsBtn).click();
		//appLibrary.switchToFrame(cardPopup);
		appLibrary.handleAlertBox();
		appLibrary.clickElement(cardNumberTbox);
		appLibrary.findElement(cardNumberTbox).sendKeys("4111111111111111");
		//appLibrary.enterText(cardNumberTbox, "4111111111111111");
		appLibrary.enterText(expiryDateTbox, "0230");
		appLibrary.enterText(firstNameTbox, "aaa");
		appLibrary.enterText(lastNameTbox, "bbb");
		appLibrary.enterText(zipTbox, "90215");
		appLibrary.clickElement(submitCardDetailsBtn);
		appLibrary.clickElement(creditCardNextBtn);
		return new PatientRegistrationPage(appLibrary);
	}

	public PatientRegistrationPage appointmentConfirmationPage() throws Exception {
		appLibrary.verifyElement(confirmationPopupMsg, true, 1000);
		appLibrary.clickElement(confirmAppointmentBtn);
		return new PatientRegistrationPage(appLibrary);
	}

	// Fill Patient Insurance details
	public PatientRegistrationPage fillInsuranceDetails() throws Exception {

		appLibrary.clickElement(relationshipWithPatientDropdown);
		appLibrary.enterText(insuranceCompanyNameTbox, "ICICI");
		appLibrary.enterText(insuranceCompanyPhonenoTbox, "898956567878");
		appLibrary.enterText(insuranceNumberTbox, "56412121");
		appLibrary.enterText(groupNumberTbox, "44444468");
		appLibrary.clickElement(submitInsuranceInfoBtn);
		appLibrary.clickElement(skipUploadInsuranceCardBtn);

		return new PatientRegistrationPage(appLibrary);
	}

	// After fill insurance details: Confirm Appointment page
	public PatientRegistrationPage confirmScheduledAppointment() throws Exception {
		appLibrary.verifyElement(appointmentscheduledMessage, true, 1000);
		appLibrary.clickElement(completePatientProfileButton);

		return new PatientRegistrationPage(appLibrary);
	}

	// After Patient Portal Login: verify Appointment
	public PatientRegistrationPage scheduledAppointmentVerification() throws Exception {
		appLibrary.waitForPageToLoad();
		//appLibrary.clickElement(PatientLogin.appointmentMenu);
		appLibrary.verifyElement(verifyDate, true, 1000);
		appLibrary.verifyElement(verifyTime, true, 1000);
		appLibrary.verifyElement(verifyProvider, true, 1000);

		return new PatientRegistrationPage(appLibrary);
	}

}
