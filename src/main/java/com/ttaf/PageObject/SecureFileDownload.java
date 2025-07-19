package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureFileDownload {
	@FindBy(xpath = "//a[text()='Secure File Download']")
	private WebElement click;
	
	@FindBy(xpath = "//a[text()='sample.exe']")
	private WebElement image;
	
	public SecureFileDownload(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickimage() {
		image.click();
	}
	
	public void clickmodule() {
		click.click();
	}

}
