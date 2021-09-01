package jft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
  private ChromeDriver driver;

  public NavigationHelper(ChromeDriver driver) {

    this.driver = driver;
  }

  public void openGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  public void addNewContact() {
    driver.findElement(By.linkText("add new")).click();
  }
}
