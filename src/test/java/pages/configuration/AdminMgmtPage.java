package pages.configuration;

import common.BuiltInAction;
import object.adminmngt_object.AdminMgmtLocators;
import object.common_object.CommonLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class AdminMgmtPage extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(AdminMgmtPage.class);

    public AdminMgmtPage() {
        super();
    }

    public void clickAdministratorsTab() {
        try {
            click(AdminMgmtLocators.TAB_ADMINISTRATORS.getBy());
            logger.info("Clicked 'Administrators' tab");

        } catch (Exception e) {
            logger.error("Error occurred when clicking to 'Administrators' tab");
        }
    }

    public void clickAdministratorGroupTab() {
        try {
            click(AdminMgmtLocators.TAB_ADMINISTRATOR_GROUPS.getBy());
            logger.info("Clicked 'Administrator Group' tab");

        } catch (Exception e) {
            logger.error("Error occurred when clicking to 'Administrator Group' tab");
        }
    }

    public void clickAddButton() {
        click(CommonLocators.BUTTON_ADD.getBy());
    }

    public void clickOKButton() {
        try {
            scrollToView(CommonLocators.BUTTON_OK.getBy());
            click(CommonLocators.BUTTON_OK.getBy());
            logger.info("Clicked 'OK' button successfully");

        } catch (Exception e) {
            logger.error("Error occurred when clicking 'OK' button");
        }
    }

    public void clickDisplayAllGroups() {
        click(CommonLocators.CHECK_BOX_DISPLAY_ALL_GROUPS.getBy());
    }

    public void clickPermissionsTab() {
        try {
            click(AdminMgmtLocators.TAB_PERMISSIONS.getBy());
            logger.info("Clicked 'Permissions' tab");

        } catch (Exception e) {
            logger.error("Error occurred when clicking to 'Permissions' tab");
        }
    }

    public void clickGeneralTab() {
        try {
            click(AdminMgmtLocators.TAB_GENERAL.getBy());
            logger.info("Clicked 'General' tab");

        } catch (Exception e) {
            logger.error("Error occurred when clicking to 'General' tab");
        }
    }

    public void clickBackButtonInGeneralTab() {
        try {
            hoverOver(AdminMgmtLocators.DROPDOWN_GENERAL.getBy());

            click(AdminMgmtLocators.BUTTON_BACK.getBy());
            logger.info("Clicked button 'Back' in 'General' dropdown");

        } catch (Exception e) {
            logger.error("Error occurred when clicking to button 'Back' in 'General' dropdown");
        }
    }

    public void clickFolderTab() {
        try {
            click(AdminMgmtLocators.TAB_FOLDER.getBy());
            logger.info("Clicked 'Folder' tab");

        } catch (Exception e) {
            logger.error("Error occurred when clicking to 'Folder' tab");
        }
    }

    public void search(String name) {
        input(CommonLocators.SEARCH_FIELD.getBy(), name);
    }

    public void selectUser(String name) {
        try {
            click(AdminMgmtLocators.CHECK_BOX_OF_NAME_USER_DISPLAYED_IN_PANEL.getBy(name));
            logger.info("Selected user '{}' successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when trying to select user");
        }
    }

    public void goToManageRolesInAdministrators() {
        try {
            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_MANAGE_ROLES.getBy());

            boolean labelManageRole = isElementPresent(AdminMgmtLocators.LABEL_MANAGE_ROLE.getBy());
            Assert.assertTrue(labelManageRole, "Unable to navigate to 'Manage Role' from Administrators tab");
            logger.info("Navigated to 'Manage Roles' from Administrators tab");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Manage Roles' from Administrators tab");
        }
    }

    public void goToAddNewAdministratorInAdministrators() {
        try {
            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_ADD_NEW_ADMINISTRATOR.getBy());

            boolean labelSelectUser = isElementPresent(AdminMgmtLocators.LABEL_SELECT_USER.getBy());
            Assert.assertTrue(labelSelectUser, "Unable to navigate to 'Add new administrator' from Administrators tab");
            logger.info("Navigated to 'Add new administrators' from Administrators tab");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Add new administrators' from Administrators tab");
        }
    }

    public void goToViewPropertiesInAdministrators() {
        try {
            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_VIEW_PROPERTIES.getBy());

            boolean labelProperties = isElementPresent(AdminMgmtLocators.LABEL_VIEW_PROPERTIES.getBy());
            Assert.assertTrue(labelProperties, "Unable to navigate to 'View properties' from Administrators tab");
            logger.info("Navigated to 'View properties' from Administrators tab");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'View properties' from Administrators tab");
        }
    }

    public void goToViewPropertiesAdminByClickIntoName(String name) {
        try {
            click(AdminMgmtLocators.NAME_USER_DISPLAYED_IN_PANEL.getBy(name));

            boolean propertiesPage = isElementPresent(AdminMgmtLocators.LABEL_VIEW_PROPERTIES.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'View properties' from Administrators tab");
            logger.info("Navigated to 'View properties' from Administrators tab of user '{}' successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when clicking username to navigate to 'View properties' from Administrators tab");
        }
    }

    public void goToChangeAdminPasswordInAdministrators() {
        try {
            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_CHANGE_ADMINISTRATOR_PASSWORD.getBy());

            boolean propertiesPage = isElementPresent(AdminMgmtLocators.LABEL_CHANGE_ADMINISTRATOR_PASSWORD.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'Change admin password' from Administrators tab");
            logger.info("Navigated to 'Change administrator password' from Administrators tab");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Change administrator password' from Administrators tab");
        }
    }

    public void goToManageRoleInAdministratorsGroup() {
        try {
            click(AdminMgmtLocators.TAB_ADMINISTRATOR_GROUPS.getBy());

            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_MANAGE_ROLES_ADMINISTRATOR_GROUP.getBy());

            boolean labelMangeRoleAdminGroup = isElementPresent(AdminMgmtLocators.LABEL_MANAGE_ROLE_GROUPS.getBy());
            Assert.assertTrue(labelMangeRoleAdminGroup, "Unable to navigate to 'Manage Role' from Administrator Groups tab");
            logger.info("Navigated to 'Manage Roles' from Administrator Groups tab");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Manage Roles' from Administrator Groups tab");
        }
    }

    public void goToAddAdministratorGroupInAdministratorsGroup() {
        try {
            click(AdminMgmtLocators.TAB_ADMINISTRATOR_GROUPS.getBy());

            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_ADD_ADMINISTRATOR_GROUP.getBy());

            boolean labelAddGroup = isElementPresent(AdminMgmtLocators.LABEL_ADMINISTRATOR_GROUPS.getBy());
            Assert.assertTrue(labelAddGroup, "Unable to navigate to 'Add Administrator Groups' from Administrator Groups tab");
            logger.info("Navigated to 'Add Administrator Groups' from Administrator Groups tab");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Add Administrator Groups' from Administrator Groups tab");
        }
    }

    public void goToAssignRoleToAdmin() {
        try {
            hoverOverAndSelect(AdminMgmtLocators.DROPDOWN_ADMINISTRATOR.getBy(),
                    AdminMgmtLocators.ITEM_ASSIGN_ROLE_TO_ADMIN.getBy());

            boolean isSelectRole = isElementPresent(AdminMgmtLocators.LABEL_SELECT_ROLE_IN_ASSIGN_ROLE_TO_ADMIN.getBy());
            Assert.assertTrue(isSelectRole, "Unable to navigate to 'Assign Role to administrator' page");
            logger.info("Navigated to 'Assign Role to admin' page");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Assign Role to admin' page");
        }
    }




}
