package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPom {
	@FindBy(xpath = "//a[normalize-space()='Form Authentication']")
	private WebElement click;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	@FindBy(xpath = "//i[@class='fa fa-2x fa-sign-in']")
	private WebElement button;
	@FindBy(xpath = "//i[@class='icon-2x icon-signout']")
	public WebElement log;
	
	public FormAuthenticationPom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void moduleclick() {
		click.click();
	}
	public void username() {
		user.sendKeys("tomsmith");
	}
	public void password() {
		pass.sendKeys("SuperSecretPassword!");
	}
	public void login() {
		button.click();
		
	}
	public void logout() {
		log.click();
	}
	
}
