package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedirectPom {
	
	WebDriver driver=null;
	@FindBy(xpath = "//a[normalize-space()='Redirect Link']")
	private WebElement redirect;
	@FindBy(xpath = "//a[@id='redirect']")
	private WebElement here;
	@FindBy(xpath = "//a[normalize-space()='200']")
	private WebElement statuscode;
	
	public RedirectPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void redirectclick() {
		redirect.click();
	}
	public void clickhere() {
		here.click();
	}
	public void statuscode() {
		statuscode.click();
	}
	

}
