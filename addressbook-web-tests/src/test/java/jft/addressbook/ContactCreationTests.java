package jft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    addNewContact();
    fillContractForm(new ContactData("Firstnmme1", "Lastname1", "Russia, Moscow, st. blablabla, 5", "89118565522", "newemail@gmail.com"));
    submitContactCreation();
    returnToHomePage();
  }
}
