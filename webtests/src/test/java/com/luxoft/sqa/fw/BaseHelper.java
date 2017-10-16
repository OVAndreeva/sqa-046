package com.luxoft.sqa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    protected WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    void type(By locator, String text) {
        if(text != null) {
            String existingText = driver.findElement(locator).getAttribute("value");
            if(! text.equals(existingText)) {
                click(locator);
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }
    }

    void click(By locator) {
        driver.findElement(locator).click();
    }
    protected boolean isElementPresent(By locator) {
        try {
            driver.findElemet(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}


