package com.luxoft.sqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {
    WebDriver driver;
    ContactHelper contactHelper;

    protected void init() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        contactHelper = new ContactHelper(driver);
        driver.get("http://localhost:8080/addressbook/");
        login("admin", "secret");
    }

    private void login(String user, String pass) {
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
