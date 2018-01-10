package pl.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGropHelper().getGroupCount();
    System.out.println(before);
    app.getGropHelper().createGroup(new GroupData("test1", null, null));
    int after = app.getGropHelper().getGroupCount();
    Assert.assertEquals(after, before+1);
  }

}
