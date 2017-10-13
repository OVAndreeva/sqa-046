package com.luxoft.sqa.webtests;

import com.luxoft.sqa.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void creation() {
        driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
    }

    protected void goToCreationPage() {
        driver.findElement(By.linkText("add new")).click();
    }

    protected void fillContactForm(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactData.getAddress());
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(contactData.getHome());
    }
}
