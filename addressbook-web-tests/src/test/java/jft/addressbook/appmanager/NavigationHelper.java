package jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void openGroupPage() {
    click(By.linkText("groups"));
  }

  public void addNewContact() {
    click(By.linkText("add new"));
  }
}
