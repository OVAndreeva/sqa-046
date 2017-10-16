package com.luxoft.sqa.webtests;

import com.luxoft.sqa.model.ContactData;
import org.testng.annotations.Test;

public class NewContactTest extends TestBase{

    @Test
    public void testNewContact() {
        app.getContactHelper().goToCreationPage();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", null, "55-55-55"));
        app.getContactHelper().creation();
    }

}
