package jft.addressbook.tests;

import jft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.addNewContact();
    app.fillContractForm(new ContactData("Firstnmme1", "Lastname1", "Russia, Moscow, st. blablabla, 5", "89118565522", "newemail@gmail.com"));
    app.submitContactCreation();
    app.returnToHomePage();
  }
}
