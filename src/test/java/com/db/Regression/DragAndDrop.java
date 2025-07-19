package com.db.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.DragAndDropPom;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Configuration config = new Configuration();
	    driver.get(config.getURL());
	    DragAndDropPom dp=new DragAndDropPom(driver);
	    dp.moduleclick();
	    Actions act= new Actions(driver);
	    Thread.sleep(2000);
	    WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
	    WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
	    act.dragAndDrop(source, target).perform();
	    driver.close();
	    
	    
	}

}
