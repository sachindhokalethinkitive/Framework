package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WYSIWYG {
	
	@FindBy(xpath = "//a[text()='WYSIWYG Editor']")
	private WebElement ClickTiny;
	
	@FindBy(id = "tinymce")
	private WebElement text;
	
	public WYSIWYG(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void TinyModule() {
		ClickTiny.click();
	}
	
	public void cleartext() {
	
	}
	public void newtext() {
		text.sendKeys("Hello i am Sachin!");
	}
}
