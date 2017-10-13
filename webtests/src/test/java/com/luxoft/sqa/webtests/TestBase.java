package com.luxoft.sqa.webtests;

import org.testng.annotations.BeforeMethod;

public class TestBase {


    public Application app = new Application();

    @BeforeMethod
    public void setup() {
        app.init();
    }

}
