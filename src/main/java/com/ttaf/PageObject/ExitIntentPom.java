
package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExitIntentPom {
	@FindBy(xpath = "//a[normalize-space()='Exit Intent']")
	private WebElement module;
	
	public ExitIntentPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickmodule() {
		module.click();
	}

}
