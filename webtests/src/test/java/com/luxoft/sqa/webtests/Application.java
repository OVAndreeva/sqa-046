package com.luxoft.sqa.webtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {
    WebDriver driver;
    SessionHelper sessionHelper;
    ContactHelper contactHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        contactHelper = new ContactHelper(driver);
        sessionHelper = new SessionHelper(driver);
        driver.get("http://localhost:8080/addressbook/");
        sessionHelper.login("admin", "secret");
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
