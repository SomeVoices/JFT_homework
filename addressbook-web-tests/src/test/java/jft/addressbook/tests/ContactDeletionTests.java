package jft.addressbook.tests;

import jft.addressbook.model.ContactData;
import jft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion(){
    if (! app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().addNewContact();
      app.getContactHelper().createContact(new ContactData("Firstnmme1", "Lastname1", "Russia, Moscow, st. blablabla, 5",
              "89118565522", "newemail@gmail.com"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
  }
}
