package pl.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGropHelper().selectGroup();
        app.getGropHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();
    }
}
