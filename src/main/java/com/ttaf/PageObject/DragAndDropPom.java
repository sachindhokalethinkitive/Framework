package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPom {
	@FindBy(xpath = "//a[normalize-space()='Drag and Drop']")
	private WebElement module;
	
	public DragAndDropPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void moduleclick() {
		module.click();
	}

}
