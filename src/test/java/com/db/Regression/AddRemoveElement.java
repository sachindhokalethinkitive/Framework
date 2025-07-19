package com.db.Regression;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.AddRemoveElementPom;


public class AddRemoveElement {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Configuration config = new Configuration();
	    driver.get(config.getURL());
		AddRemoveElementPom ar=new AddRemoveElementPom(driver);
		ar.addremove();
		Thread.sleep(2000);
		ar.add();
		ar.delete();
		driver.close();
		
		
	}

}
