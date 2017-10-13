package com.luxoft.sqa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass) {
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }
}
