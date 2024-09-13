package test;

import common.BuiltInAction;
import common.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.profiles.*;
import pages.users.UsersPage;

public class TestClass extends TestBase {
    private BuiltInAction builtInAction;
    private UsersPage usersPage;
    private ProfilesPage profilesPage;
    private S1BasicDetails s1BasicDetails;

    public TestClass() {
        builtInAction = new BuiltInAction();
        usersPage = new UsersPage();
        s1BasicDetails = new S1BasicDetails();
    }

    @DataProvider(name = "profileDataProvider")
    @Test
    public void TestConfigureBasicDetails(
            String profileName,
            String profileComments,
            String targetPlatform,
            String profileType,
            String clientUILanguage)
    {
        s1BasicDetails.profileName(profileName);
        s1BasicDetails.profileComments(profileComments);
        s1BasicDetails.targetPlatform(targetPlatform);
        s1BasicDetails.profileType(profileType);
        s1BasicDetails.clientUILanguage(clientUILanguage);

    }

}
