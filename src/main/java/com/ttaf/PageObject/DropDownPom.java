package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPom {
	@FindBy(xpath = "//a[normalize-space()='Dropdown']")
	private WebElement module;
	//@FindBy(xpath = "//select[@id='dropdown']")
	//private WebElement drop;
	
	public DropDownPom(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void moduleclick() {
		module.click();
	}
	//public void dropdown() {
		//drop.click();
	}
	
	

