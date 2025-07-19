package com.db.Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
	    public static void main(String[] args) {
	     

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        try {
	            // 1. Open the WYSIWYG Editor page
	            driver.get("https://the-internet.herokuapp.com/iframe");

	            // 2. Switch to the editor's iframe
	            WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
	            driver.switchTo().frame(iframe);

	            // 3. Clear any existing text
	            WebElement editorBody = driver.findElement(By.id("tinymce"));
	            editorBody.clear();

	            // 4. Enter new text
	            editorBody.sendKeys("Hello, this is a test!");

	            // 5. Switch back to the main page to click the Bold button
	            driver.switchTo().defaultContent();
	            WebElement boldButton = driver.findElement(By.cssSelector("button[title='Bold']"));
	            boldButton.click();

	            // 6. Switch back to iframe and type bold text
	            driver.switchTo().frame(iframe);
	            editorBody.sendKeys(" This is bold text.");

	            // 7. (Optional) Print the editor content
	            String content = editorBody.getText();
	            System.out.println("Editor Content: " + content);

	        } finally {
	            // 8. Close the browser
	            driver.quit();
	        }
	    }
	}


