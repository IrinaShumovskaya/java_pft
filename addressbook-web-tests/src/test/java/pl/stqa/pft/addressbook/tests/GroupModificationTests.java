package pl.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGropHelper().isThereAreGroup()) {
      app.getGropHelper().createGroup(new GroupData("test", null, null));
    }
    List<GroupData> before = app.getGropHelper().getGroupList();
    app.getGropHelper().selectGroup(before.size()-1);
    app.getGropHelper().initGroupModification();
    GroupData group = new GroupData(before.get(before.size() - 1).getId(),"test1", "test2", "test3");
    app.getGropHelper().fillGroupForm(group);
    app.getGropHelper().submitGroupModification();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGropHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size()-1);
    before.add(group);
    Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));
  }
}
