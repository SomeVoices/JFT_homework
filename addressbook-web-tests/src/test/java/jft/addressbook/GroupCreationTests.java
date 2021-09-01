package jft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    openGroupPage();
    initialGroupCreation();
    fillGroupForm(new GroupData("group1", "group1", "group1"));
    submitGroupCreation();
    returnToGroupPage();

  }

}
