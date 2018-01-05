package pl.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

  @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGropHelper().initGroupCreation();
        app.getGropHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGropHelper().submitGroupCreation();
        app.getNavigationHelper().gotoGroupPage();
    }

}
