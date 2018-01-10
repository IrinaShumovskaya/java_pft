package pl.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGropHelper().getGroupCount();
    if (!app.getGropHelper().isThereAreGroup()) {
      app.getGropHelper().createGroup(new GroupData("test", null, null));
    }
    app.getGropHelper().selectGroup();
    app.getGropHelper().deleteSelectedGroups();
    app.getNavigationHelper().gotoGroupPage();
    int after = app.getGropHelper().getGroupCount();
    Assert.assertEquals(after, before-1);
  }
}
