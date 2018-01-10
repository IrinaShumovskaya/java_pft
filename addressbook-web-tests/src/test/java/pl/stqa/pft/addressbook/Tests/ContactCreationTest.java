package pl.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    int before = app.getContactHelper().getContactCount();
    System.out.println(before);
    app.getContactHelper().creationContact(new ContactData("Irena", "Shumouskaya", "test1","Magellana 5",
            "test@email.pl", "test2@email.pl", "test3@email.pl", "12345678",
            "987654321", "321123654", "654987456"),true);

    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before+1);
  }
}
