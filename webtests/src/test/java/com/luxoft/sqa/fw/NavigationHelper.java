package com.luxoft.sqa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {


    NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
        if (isElementPresent(By.tagName("h1"))
            && driver.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }



    public void goToLoginPage(Application application) {
        application.driver.get("http://localhost:8080/addressbook/");
    }
}
