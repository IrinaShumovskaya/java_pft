package pl.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGropHelper().isThereAreGroup()) {
      app.getGropHelper().createGroup(new GroupData("test", null, null));
    }
  }

  @Test
  public void testGroupModification() {
    List<GroupData> before = app.getGropHelper().getGroupList();
    int index = before.size() - 1;
    GroupData group = new GroupData(before.get(index).getId(), "test1", "test2", "test3");
    app.getGropHelper().ModityGroup(index, group);
    List<GroupData> after = app.getGropHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());
    before.remove(index);
    before.add(group);
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }


}
