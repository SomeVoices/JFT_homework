package jft.addressbook.tests;

import jft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification() {
    app.getNavigationHelper().openGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("group1", "group1", "group1"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initialGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("updatedName1", "updatedHeader1", "updatedFooter1"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
