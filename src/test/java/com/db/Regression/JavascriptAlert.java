package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.JavaScriptAlertPom;

public class JavascriptAlert {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Configuration config = new Configuration();
	    driver.get(config.getURL());
	    JavaScriptAlertPom js = new JavaScriptAlertPom(driver);
	    js.module();
	    js.simple();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(2000);
	    js.confirm();
	    Alert alert1 = driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(2000);
	    js.prompt();
	    Alert alert2 = driver.switchTo().alert();
	    alert.sendKeys("Sachin");
	    alert.accept();
	    driver.close();
	}

}
