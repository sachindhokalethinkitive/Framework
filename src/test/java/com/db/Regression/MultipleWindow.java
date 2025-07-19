package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.MultipleWindowPom;

public class MultipleWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Configuration config = new Configuration();
    driver.get(config.getURL());
    MultipleWindowPom mw=new MultipleWindowPom(driver);
    mw.MultiWin();
    String main = driver.getWindowHandle();
    Thread.sleep(2000);
    mw.Here();
    driver.switchTo().window(main);
    Thread.sleep(2000);
    driver.close();
    

}
}
