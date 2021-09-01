package jft.addressbook.tests;

import jft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.openGroupPage();
    app.getGroupHelper().initialGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("group1", "group1", "group1"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
