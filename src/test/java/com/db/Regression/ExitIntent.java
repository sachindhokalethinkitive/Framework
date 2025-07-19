package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.ExitIntentPom;

public class ExitIntent {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Configuration config = new Configuration();
	    driver.get(config.getURL());
	    ExitIntentPom ep=new ExitIntentPom(driver);
	    ep.clickmodule();
	    WebElement heading = driver.findElement(By.tagName("h3")); 
	    Actions actions = new Actions(driver);
	    actions.moveToElement(heading).perform();
        Thread.sleep(1000);
        actions.moveByOffset(0, -200).build().perform(); 
        Thread.sleep(2000); 
	}

}
