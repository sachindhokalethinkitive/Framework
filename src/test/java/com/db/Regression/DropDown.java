package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.DropDownPom;

public class DropDown {
	
public static void main(String[] args) {
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Configuration config = new Configuration();
    driver.get(config.getURL());
    DropDownPom dp = new DropDownPom(driver);
    dp.moduleclick();
    WebElement dropdown = driver.findElement(By.id("dropdown"));
    Select sel= new Select(dropdown);
    sel.selectByIndex(1);
    driver.close();

}
}
