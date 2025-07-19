package com.ttaf.PageObject;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryAdPom {
	@FindBy(xpath = "//a[normalize-space()='Entry Ad']")
	private WebElement module;
	@FindBy(xpath = "//p[normalize-space()='Close']")
	private WebElement close;
	
	public EntryAdPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickmodule() {
		module.click();
	}
	public void closebutton() {
		close.click();
		
	}
}
