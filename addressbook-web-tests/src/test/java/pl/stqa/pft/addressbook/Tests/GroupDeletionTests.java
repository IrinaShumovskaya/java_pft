package pl.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGropHelper().isThereAreGroup()) {
      app.getGropHelper().createGroup(new GroupData("test", null, null));
    }
    List<GroupData> before = app.getGropHelper().getGroupList();
    app.getGropHelper().selectGroup(before.size()-1);
    app.getGropHelper().deleteSelectedGroups();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGropHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size()-1);

    before.remove(before.size() - 1);
    for (int i=0; i< after.size(); i++){
      Assert.assertEquals(before.get(i), after.get(i));
    }

  }
}
