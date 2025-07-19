package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigestPom {
	@FindBy(xpath = "//a[normalize-space()='Digest Authentication']")
	private WebElement module;
	
	public DigestPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void moduleclick() {
		module.click();
	}

}
