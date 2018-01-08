package pl.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModifiction(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ira1", null, null, null, null,null,
            null,null, null,null));
    app.getContactHelper().submitContactModification();
  }
}
