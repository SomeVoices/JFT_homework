package jft.addressbook.tests;

import jft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    if (! app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().addNewContact();
      app.getContactHelper().createContact(new ContactData("Firstnmme1", "Lastname1", "Russia, Moscow, st. blablabla, 5",
              "89118565522", "newemail@gmail.com"));
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().initialContactModification();
    app.getContactHelper().fillContractForm(new ContactData("newName", "newFamily", "Russia, SPB, st. blablabla, 6",
            "89118565523", "bestemail@gmail.com"));
    app.getContactHelper().submitContractModification();
    app.getContactHelper().returnToHomePage();
  }
}
