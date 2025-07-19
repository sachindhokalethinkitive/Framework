package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.WYSIWYG;

public class WYSIWYGTinyMce {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Configuration config=new Configuration();
		driver.get(config.getURL());
		WYSIWYG wt=new WYSIWYG(driver);
		wt.TinyModule();
		WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        wt.cleartext();
        wt.newtext();
	}

}
