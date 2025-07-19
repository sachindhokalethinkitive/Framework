package com.db.Regression;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.Alert; // Not needed for browser-level popups

import com.ttaf.Library.Configuration;
import com.ttaf.PageObject.FormAuthenticationPom;

public class FormAuthentication {
    public static void main(String[] args) throws InterruptedException {
        // Set Chrome options to disable password manager popups
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-password-manager-reauthentication");
        options.addArguments("--disable-features=PasswordManager");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Configuration config = new Configuration();
        driver.get(config.getURL());

        FormAuthenticationPom fm = new FormAuthenticationPom(driver);
        fm.moduleclick();
        fm.username();
        fm.password();
        fm.login();
        Thread.sleep(2000);

        // Do NOT use driver.switchTo().alert() for browser-level popups
        // If you need to handle a web alert, uncomment below:
        // Alert simple = driver.switchTo().alert();
        // simple.dismiss();

        fm.logout();
        driver.close();
    }
}