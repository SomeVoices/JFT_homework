package jft.addressbook.appmanager;

import jft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupHelper extends BaseHelper {

  public GroupHelper(ChromeDriver driver) {
    super(driver);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initialGroupCreation() {
    click(By.name("new"));
  }
}
