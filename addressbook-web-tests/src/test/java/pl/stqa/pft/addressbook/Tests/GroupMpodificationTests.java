package pl.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

public class GroupMpodificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGropHelper().getGroupCount();
    app.getGropHelper().selectGroup();
    app.getGropHelper().initGroupModification();
    app.getGropHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGropHelper().submitGroupModification();
    app.getNavigationHelper().gotoGroupPage();
    int after = app.getGropHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }
}
