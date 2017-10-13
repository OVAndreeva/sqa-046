package com.luxoft.sqa.webtests;

import com.luxoft.sqa.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewContactTest extends TestBase{

    @Test
    public void testNewContact() {
        goToCreationPage();
        fillContactForm(new ContactData("Ivan", "Ivanov", "12345", "55-55-55"));
        creation();
    }

}
