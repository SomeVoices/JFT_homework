package jft.addressbook.appmanager;

import jft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends BaseHelper {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void selectContact(){ click(By.name("selected[]")); }

  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
    driver.switchTo().alert().accept();
  }

  public void initialContactModification(){ click(By.xpath("//img[@alt='Edit']")); }

  public void submitContactCreation() { click(By.xpath("//div[@id='content']/form/input[21]")); }

  public void submitContractModification(){ click(By.xpath("//div[@id='content']/form/input[22]")); }

  public void fillContractForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());
  }

  public void returnToHomePage() { click(By.linkText("home page")); }
}
