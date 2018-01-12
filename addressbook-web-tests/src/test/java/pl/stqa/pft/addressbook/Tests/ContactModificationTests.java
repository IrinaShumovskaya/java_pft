package pl.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModifiction(){
    app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().thereAreContacts()){
      app.getContactHelper().creationContact(new ContactData("Irena", "Shumouskaya", "test1","Magellana 5",
              "test@email.pl", "test2@email.pl", "test3@email.pl", "12345678",
              "987654321", "321123654", "654987456"),true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ira1", null, null,null, null, null,null,
            null,null, null,null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(before, after);
  }
}
