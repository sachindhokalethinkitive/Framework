package com.ttaf.PageObject;

import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPom {
	@FindBy(xpath = "//a[text()='Basic Auth']")
	private WebElement basicauth;
	
	public AuthenticationPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void auth() {
		basicauth.click();
	}
}
		
	


