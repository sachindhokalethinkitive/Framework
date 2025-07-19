package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertPom {
	@FindBy(xpath = "//a[normalize-space()='JavaScript Alerts']")
	private WebElement main;
	@FindBy(xpath = "//button[normalize-space()='Click for JS Alert']")
	private WebElement ok;
	@FindBy(xpath = "//button[normalize-space()='Click for JS Confirm']")
	private WebElement okcancel;
	@FindBy(xpath = "//button[normalize-space()='Click for JS Prompt']")
	private WebElement okcanceltext;
	
	public JavaScriptAlertPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void module() {
		main.click();
	}
	public void simple() {
		ok.click();
	}
	public void confirm() {
		okcancel.click();
	}
	public void prompt() {
		okcanceltext.click();
	}
}
