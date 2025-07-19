package com.ttaf.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPom {
	
	@FindBy(xpath ="//a[text()='Checkboxes']")
	private WebElement checkboxes;
	
	@FindBy(xpath = "//form[@id='checkboxes']/input[1]")
	private WebElement checkbox1;
	
	@FindBy(xpath = "//form[@id=\"checkboxes\"]/input[2]")
	private WebElement checkbox2;
	
	public CheckboxesPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void checkboxes() {
			checkboxes.click();
		}
		
		public void checkbox1() {
			checkbox1.click();
		}
		
		public void checkbox2() {
			checkbox2.click();
		}
	
	
	
	
	
	
	


}
