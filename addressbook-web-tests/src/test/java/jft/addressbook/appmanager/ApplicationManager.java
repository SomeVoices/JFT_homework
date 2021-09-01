package jft.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  ChromeDriver driver;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private ContactHelper contactHelper;
  private GroupHelper groupHelper;

  public void init() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    sessionHelper = new SessionHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    groupHelper = new GroupHelper(driver);
    contactHelper = new ContactHelper(driver);

    driver.get("http://localhost/addressbook/");
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    sessionHelper.logout();
    driver.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
