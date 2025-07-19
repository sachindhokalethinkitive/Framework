package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPom {	
	@FindBy(xpath = "//a[text()='Context Menu']")
	private WebElement click;
	
	
	
	@FindBy(xpath = "id='hot-spot'")
	private WebDriver rect;
	
	public ContextMenuPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void contextclick() {
		click.click();
	}

}
