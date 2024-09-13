package common;

import object.common_object.CommonLocators;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.loginpage.LoginPage;


public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    LoginPage loginPage;
    BuiltInAction builtInAction;
    private static final Logger logger = LogManager.getLogger(TestBase.class);

    @BeforeClass
    public void setUp() {
        this.driver = WebDriverUtil.getDriver();
        this.wait = WebDriverUtil.getWait();

        driver.get(Constant.URL.MESSO_ASIA.getUrl());

        builtInAction = new BuiltInAction();
        loginPage = new LoginPage();

        loginPage.loginSESWeb(Constant.Credential.ADMIN.getUsername(),
                Constant.Credential.ADMIN.getPassword());
    }

    @BeforeMethod
    public void setUpMethod() {
        builtInAction.navigateToUsersPage();
        builtInAction.click(CommonLocators.SIDEBAR_PROFILES_PAGE.getBy());
        builtInAction.hoverOverAndSelect(
                ProfilesLocators.DROPDOWN_PROFILE.getBy(),
                ProfilesLocators.ITEM_ADD_PROFILE.getBy());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }

}
