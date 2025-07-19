package com.db.Regression;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.CheckboxesPom;



public class ClickCheckboxes {
	@Test
	public static void main(String[] args) throws IOException, InterruptedException {
		
	//System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\automationFramework\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Configuration config = new Configuration();
    driver.get(config.getURL());
	CheckboxesPom check=new CheckboxesPom(driver);
	check.checkboxes();
	Thread.sleep(2000);
	check.checkbox1();
	Thread.sleep(2000);
	check.checkbox1();
	check.checkbox2();
	Thread.sleep(2000);
	//check.checkbox2();
	Thread.sleep(2000);
	//check.checkbox2();
	
//WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
//if(checkbox1.isSelected()) {
//	System.out.println("Checkbox is selected");
//}

	driver.close();
	
	

}
}