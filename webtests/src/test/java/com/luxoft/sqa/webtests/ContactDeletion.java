package com.luxoft.sqa.webtests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase{

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("test", "test", "test"));
        }
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteContact();
    }
}
