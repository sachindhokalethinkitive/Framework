package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPom {
	@FindBy(xpath = "//a[normalize-space()='File Upload']")
	private WebElement upload;
	
	@FindBy(id = "file-upload")
	private WebElement file;
	
	@FindBy(xpath = "//a[normalize-space()='File Upload']")
	private WebElement button;
	
	public FileUploadPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void module() {
		upload.click();
	}
	public void choosefile()  {
		file.click();
		//Thread.sleep(2000);
		//file.sendKeys("C:\\Users\\SACHIN\\OneDrive\\Pictures\\Screenshots");
	}
	
	public void uploadbutton() {
		button.click();
	}

}
