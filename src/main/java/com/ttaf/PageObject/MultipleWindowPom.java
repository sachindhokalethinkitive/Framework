package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindowPom {
	@FindBy(xpath = "//a[normalize-space()='Multiple Windows']")
	private WebElement click;
	
	@FindBy(xpath = "//a[normalize-space()='Click Here']")
	private WebElement clickhere;
	
	public MultipleWindowPom(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
		
	}
	
	public void MultiWin() {
		click.click();
	}
	public void Here() {
		clickhere.click();
	}

}
