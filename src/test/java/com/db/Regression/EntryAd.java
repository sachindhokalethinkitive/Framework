package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.EntryAdPom;

public class EntryAd {
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Configuration config = new Configuration();
	    driver.get(config.getURL());
	    EntryAdPom ep=new EntryAdPom(driver);
	    ep.clickmodule();
	    ep.closebutton();
	    driver.navigate().back();
	    driver.close();
	}

}
