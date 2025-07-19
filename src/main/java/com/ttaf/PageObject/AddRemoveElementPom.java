package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementPom {
	@FindBy(xpath = "//button[text()='Add Element']")
	private WebElement Add;
	
	@FindBy(xpath = "//button[@onclick=\"deleteElement()\"]")
	private WebElement Delete;
	
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	private WebElement AddRemove;
	
	public AddRemoveElementPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void add() {
		Add.click();
	}
	public void delete() {
		Delete.click();
	}
	public void addremove() {
		AddRemove.click();
	}
	

}


