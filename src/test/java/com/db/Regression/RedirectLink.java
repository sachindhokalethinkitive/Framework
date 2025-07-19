package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.RedirectPom;

public class RedirectLink {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Configuration config = new Configuration();
        driver.get(config.getURL());
        Thread.sleep(2000);
        RedirectPom red=new RedirectPom(driver);
        red.redirectclick();
        String mainurl = driver.getCurrentUrl();
        Thread.sleep(2000);
        red.clickhere();
        red.statuscode();
        
        driver.navigate().to(mainurl);
        Thread.sleep(2000);
        driver.close();
        
        
        
       

        
	}

}
