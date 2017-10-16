package com.luxoft.sqa.fw;

import com.luxoft.sqa.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void creation() {
        click(By.cssSelector("input[name=\"submit\"]"));
    }

    public void goToCreationPage() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        if(creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByIndex(0);
        }else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());

    }
    public void selectFirstContact() {
        NavigationHelper navigationHelper;
    }
    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
    public void deleteContact() {
        click(By.name("delete"));
    }
}
