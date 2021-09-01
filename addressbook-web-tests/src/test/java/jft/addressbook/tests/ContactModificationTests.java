package jft.addressbook.tests;

import jft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getContactHelper().selectContact();
    app.getContactHelper().initialContactModification();
    app.getContactHelper().fillContractForm(new ContactData("newName", "newFamily", "Russia, SPB, st. blablabla, 6",
            "89118565523", "bestemail@gmail.com"));
    app.getContactHelper().submitContractModification();
    app.getContactHelper().returnToHomePage();
  }
}
