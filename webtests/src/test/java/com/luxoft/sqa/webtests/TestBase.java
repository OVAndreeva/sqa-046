package com.luxoft.sqa.webtests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeMethod;


public class TestBase {


    public Application app = new Application(BrowserType.CHROME);

    @BeforeMethod
    public void setup() {
        app.init();
    }

}
