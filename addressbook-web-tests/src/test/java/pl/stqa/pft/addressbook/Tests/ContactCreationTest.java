package pl.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactCreationPage();
    app.getContactHelper().fillContactForm(new ContactData("Irena", "Shumouskaya", "Magellana 5",
            "test@email.pl", "test2@email.pl", "test3@email.pl", "12345678",
            "987654321", "321123654", "654987456")
    );
    app.getContactHelper().submitContactCreation();
  }
}
