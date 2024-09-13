package pages.users;

import common.BuiltInAction;
import object.common_object.CommonLocators;
import object.users_object.UsersLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;


public class UsersPage extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(UsersPage.class);

    public UsersPage() {
        super();
        
    }

    public void clickSaveButton() {
        click(CommonLocators.BUTTON_SAVE.getBy());
    }

    public void clickMoveButton() {
        click(CommonLocators.BUTTON_MOVE.getBy());
    }

    public void clickYesButton() {
        click(CommonLocators.BUTTON_YES.getBy());
    }

    public void clickNoButton() {
        click(CommonLocators.BUTTON_NO.getBy());
    }

    public void clickOkButton() {
        click(CommonLocators.BUTTON_OK_CONFIRM_DIALOG.getBy());
    }
    
    public void clickViewAllSubFolders() {
        click(UsersLocators.BUTTON_VIEW_ALL_SUB_FOLDERS.getBy());
    }

    public void clickExpandButtonOnSidebar() {
        click(CommonLocators.SIDEBAR_USERS_BUTTON_EXPAND_FOLDER.getBy());
    }

    public void clickDisplayAllKeys() {
        click(CommonLocators.CHECK_BOX_DISPLAY_ALL_KEYS.getBy());
    }

    public void clickDisplayAllGroups() {
        click(CommonLocators.CHECK_BOX_DISPLAY_ALL_GROUPS.getBy());
    }

    public void scrollToViewFolderOnSidebar(String name) {
        scrollToView(CommonLocators.SIDEBAR_USERS_FOLDER_NAME_DISPLAYED.getBy(name));
    }

    public void scrollToViewGroupOnSidebar(String name) {
        scrollToView(CommonLocators.SIDEBAR_USERS_GROUP_NAME_DISPLAYED.getBy(name));
    }

    public void scrollToViewFolderInMoveToFolder(String name) {
        scrollToView(CommonLocators.FOLDER_NAME_DISPLAYED_IN_MOVE_TO_FOLDER.getBy(name));
    }

    public void search(String name) {
        input(CommonLocators.SEARCH_FIELD.getBy(), name);
    }

    public void navigateToRecycle() { // consider to log bug
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Users";
            scrollToView(CommonLocators.SIDEBAR_RECYCLE_BIN.getBy());
            click(CommonLocators.SIDEBAR_RECYCLE_BIN.getBy());
            logger.info("Navigated to 'Recycle' page successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Recycle' page");
        }
    }

    public void selectUser(String name) {
        try {
            boolean isUserFound = isElementPresent(UsersLocators.CHECK_BOX_OF_SEARCHED_USER_NAME_DISPLAYED.getBy(name));
            if (isUserFound) {
                click(UsersLocators.CHECK_BOX_OF_SEARCHED_USER_NAME_DISPLAYED.getBy(name));
                logger.info("Selected user '{}' at 1st attempt", name);
            } else {
                clickViewAllSubFolders();
                if (isUserFound) {
                    click(UsersLocators.CHECK_BOX_OF_SEARCHED_USER_NAME_DISPLAYED.getBy(name));
                    logger.info("Selected user '{}' at 2nd attempt", name);
                } else {
                    search(name);
                    click(UsersLocators.CHECK_BOX_OF_SEARCHED_USER_NAME_DISPLAYED.getBy(name));
                    logger.info("Selected user '{}' at 3rd attempt", name);
                }
            }
        } catch (Exception e) {
            logger.error("Error occurred when trying to select user");
        }
    }

    public void selectFolderOnSidebar(String name) {
        try {
            scrollToViewFolderOnSidebar(name);
            click(CommonLocators.SIDEBAR_USERS_FOLDER_NAME_DISPLAYED.getBy(name));
            logger.info("Clicked folder '{}' on sidebar successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when trying to select folder on sidebar");
        }
    }

    public void selectGroupOnSidebar(String name) {
        try {
            scrollToViewGroupOnSidebar(name);
            click(CommonLocators.SIDEBAR_USERS_GROUP_NAME_DISPLAYED.getBy(name));
            logger.info("Clicked group '{}' on sidebar successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when trying to select group on sidebar");
        }
    }

    public void checkUserExisted(String name) {
        try {
            search(name);

            boolean isUserExist = isElementPresent(UsersLocators.SEARCHED_NAME_DISPLAYED.getBy(name));
            Assert.assertTrue(isUserExist, "User {" + name + "} is not existed");
            logger.info("User '{}' is existed", name);

        } catch (Exception e) {
            logger.error("Error occurred when checking if user '{}' is existed", name);
        }
    }

    public void checkFolderExisted(String name) {
        try {
            clickExpandButtonOnSidebar();
            scrollToViewFolderOnSidebar(name);

            boolean isFolderExisted = isElementPresent(CommonLocators.SIDEBAR_USERS_FOLDER_NAME_DISPLAYED.getBy(name));
            Assert.assertTrue(isFolderExisted, "Folder {" + name + "} is not existed");
            logger.info("Folder '{}' is existed", name);

        } catch (Exception e) {
            logger.error("Error occurred when checking if folder '{}' is existed", name);
        }
    }

    public void checkGroupExisted(String name) {
        try {
            clickExpandButtonOnSidebar();
            scrollToViewGroupOnSidebar(name);

            boolean isFolderExisted = isElementPresent(CommonLocators.SIDEBAR_USERS_GROUP_NAME_DISPLAYED.getBy(name));
            Assert.assertTrue(isFolderExisted, "Folder {" + name + "} is not existed");
            logger.info("Group '{}' is existed", name);

        } catch (Exception e) {
            logger.error("Error occurred when checking if group '{}' is existed", name);
        }
    }

    public void checkKeyBelongToUser(String name) {
        try {
            search(name);

            boolean isKeyDisplayed = isElementPresent(CommonLocators.SEARCHED_KEY.getBy(name));
            Assert.assertTrue(isKeyDisplayed, "The key is not belong to user");
            logger.info("The key '{}' is belong to user", name);

        } catch (Exception e) {
            logger.error("Error occurred when checking if key is belong to user");
        }
    }

    public void checkUserExistedInFolder(String nameFolder, String nameUser) {
        try {
            clickExpandButtonOnSidebar();
            scrollToViewFolderOnSidebar(nameFolder);

            selectFolderOnSidebar(nameFolder);
            search(nameUser);

            boolean isUserExisted = isElementPresent(UsersLocators.SEARCHED_NAME_DISPLAYED.getBy(nameUser));
            Assert.assertTrue(isUserExisted, "User " + nameUser + " is not existed in folder " + nameFolder);
            logger.info("User '{}' is existed in folder '{}'", nameUser, nameFolder);

        } catch (Exception e) {
            logger.error("Error occurred when checking if user is existed in folder");
        }
    }

    public void checkUserExistedInGroup(String nameGroup, String nameUser) {
        try {
            clickExpandButtonOnSidebar();
            scrollToViewFolderOnSidebar(nameGroup);

            selectGroupOnSidebar(nameGroup);
            search(nameUser);

            boolean isUserExisted = isElementPresent(UsersLocators.SEARCHED_NAME_DISPLAYED.getBy(nameUser));
            Assert.assertTrue(isUserExisted, "User " + nameUser + " is not existed in group " + nameGroup);
            logger.info("User '{}' is existed in group '{}'", nameUser, nameGroup);

        } catch (Exception e) {
            logger.error("Error occurred when checking if user is existed in group");
        }
    }

    public void selectKeyToAssign(String name) {
        try {

            clickDisplayAllKeys();

            search(name);
            clickWithRetry(CommonLocators.SEARCHED_KEY.getBy(name), 2);

            clickSaveButton();
            isSucceed();
            logger.info("Select key '{}' and click 'Save' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting key for user");
        }
    }

    public void selectFolderToMoveForUser(String name) {
        try {
            isElementPresent(UsersLocators.LABEL_MOVE_TO_FOLDER.getBy());
            scrollToViewFolderInMoveToFolder(name);
            click(CommonLocators.FOLDER_NAME_DISPLAYED_IN_MOVE_TO_FOLDER.getBy(name));
            clickMoveButton();
            isSucceed();
            logger.info("Selected folder '{}' and clicked 'Move' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting folder for user");
        }
    }

    public void selectGroupToAddForUser(String name) {
        try {
            clickDisplayAllGroups();

            search(name);
            clickWithRetry(CommonLocators.SEARCHED_GROUP.getBy(name), 2);

            clickSaveButton();
            isSucceed();
            logger.info("Selected group '{}' and clicked 'Save' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting group for user");
        }
    }

    public void goToViewProperties() {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_USER.getBy(),
                    UsersLocators.ITEM_VIEW_PROPERTIES.getBy());

            boolean propertiesPage = isElementPresent(UsersLocators.LABEL_PROPERTIES.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to View properties");
            logger.info("Navigated to View properties successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to View properties");
        }
    }

    public void selectDeleteUsers() {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_USER.getBy(),
                    UsersLocators.ITEM_DELETE_USERS.getBy());

            boolean confirmDialogOfDeleteUser = isElementPresent(UsersLocators.CONFIRM_DIALOG_DELETE_USER.getBy());
            Assert.assertTrue(confirmDialogOfDeleteUser,
                    "Failed to perform 'Delete user(s)'");
            logger.info("Clicked 'Delete user(s) and the confirm dialog is displayed");

        } catch (Exception e) {
            logger.error("Error occurred when perform 'Delete user(s)'");
        }
    }

    public void goToMoveToFolder() {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_USER.getBy(),
                    UsersLocators.ITEM_MOVE_TO_FOLDER.getBy());

            boolean propertiesPage = isElementPresent(UsersLocators.LABEL_MOVE_TO_FOLDER.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'Move to folder'");
            logger.info("Navigated to 'Move to folder' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Move to folder'");
        }
    }

    public void goToAssignKeysToUsers() {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_USER.getBy(),
                    UsersLocators.ITEM_ASSIGN_KEYS_TO_USERS.getBy());

            boolean assignKeysToUsersPage = isElementPresent(UsersLocators.LABEL_ASSIGN_KEYS_TO_USERS.getBy());
            Assert.assertTrue(assignKeysToUsersPage, "Unable to navigate to 'Assign Keys to users' page");
            logger.info("Navigated to 'Assign keys to user(s)' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Assign keys to user(s)' page");
        }
    }

    public void goToAddUsersToGroup() {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_USER.getBy(),
                    UsersLocators.ITEM_ADD_USERS_TO_GROUP.getBy());

            boolean addUserToGroupPage = isElementPresent(UsersLocators.LABEL_ADD_USERS_TO_GROUP.getBy());
            Assert.assertTrue(addUserToGroupPage, "Unable to navigate to 'Add user(s) to group' page");
            logger.info("Navigated to 'Add user(s) to group' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Add user(s) to group' page");
        }
    }

    public void goToViewPropertiesKeys() {
        try {
            isElementPresent(UsersLocators.LABEL_PROPERTIES.getBy());
            click(UsersLocators.TAB_KEYS.getBy());

            boolean propertiesKeysPage = isElementPresent(UsersLocators.LABEL_PROPERTIES_KEYS.getBy());
            Assert.assertTrue(propertiesKeysPage, "Unable to navigate to properties Keys");
            logger.info("Navigated to View Properties Keys successfully");

        } catch (Exception e) {
            logger.error("Error occurred when checking if navigating to properties Keys");
        }
    }

    public void fillUserInformation(String name,
                                    String password,
                                    String firstName,
                                    String lastName,
                                    String phone,
                                    String email,
                                    String description) {
        try {
            input(UsersLocators.INPUT_FIELD_USERNAME.getBy(), name);
            input(UsersLocators.INPUT_FIELD_PASSWORD.getBy(), password);
            input(UsersLocators.INPUT_FIELD_FIRSTNAME.getBy(), firstName);
            input(UsersLocators.INPUT_FIELD_LASTNAME.getBy(), lastName);
            input(UsersLocators.INPUT_FIELD_PHONE.getBy(), phone);
            input(UsersLocators.INPUT_FIELD_EMAIL.getBy(), email);
            input(UsersLocators.INPUT_FIELD_DESCRIPTION.getBy(), description);
            logger.info("Completed fill all user's information");

        } catch (Exception e) {
            logger.error("Error occurred when filling all user's information");
        }
    }

    public void addUser(String name,
                        String password,
                        String firstName,
                        String lastName,
                        String phone,
                        String email,
                        String description) {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_FOLDER.getBy(),
                    UsersLocators.ITEM_ADD_NEW_USER.getBy());

            fillUserInformation(name,
                    password,
                    firstName,
                    lastName,
                    phone,
                    email,
                    description);

            click(UsersLocators.CHECK_BOX_CHANGE_PASSWORD_ADD_USER.getBy());
            clickSaveButton();
            isSucceed();

            click(CommonLocators.SECUREDOC_LOGO.getBy());
            checkUserExisted(name);
            logger.info("Add new user '{}' successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when adding new user");
        }
    }

    public void addFolder(String name,
                          String description) {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_FOLDER.getBy(),
                    UsersLocators.ITEM_ADD_FOLDER.getBy());

            input(UsersLocators.INPUT_FIELD_FOLDER_NAME.getBy(), name);
            input(UsersLocators.INPUT_FIELD_DESCRIPTION.getBy(), description);

            clickSaveButton();
            isSucceed();

            checkFolderExisted(name);
            logger.info("Add folder '{}' successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when adding new folder");
        }
    }

    public void addGroup(String name,
                         String description) {
        try {
            hoverOverAndSelect(UsersLocators.DROPDOWN_FOLDER.getBy(),
                    UsersLocators.ITEM_ADD_NEW_GROUP.getBy());

            input(UsersLocators.INPUT_FIELD_GROUP_NAME.getBy(), name);
            input(UsersLocators.INPUT_FIELD_DESCRIPTION.getBy(), description);

            clickSaveButton();
            isSucceed();

            checkGroupExisted(name);
            logger.info("Add new group '{}' successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when adding new group");
        }
    }

    public void assignKeysToUsers(String nameKey,
                                  String nameUser) {
        try {
            selectUser(nameUser);

            goToAssignKeysToUsers();

            selectKeyToAssign(nameKey);

            navigateToUsersPage();

            selectUser(nameUser);
            goToViewProperties();
            goToViewPropertiesKeys();

            checkKeyBelongToUser(nameKey);
            logger.info("'Assign keys to user(s)' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when assigning keys to user(s)");
        }
    }

    public void addUsersToGroup(String nameGroup,
                                String nameUser) {
        try {
            selectUser(nameUser);

            goToAddUsersToGroup();

            selectGroupToAddForUser(nameGroup);

            navigateToUsersPage();

            clickExpandButtonOnSidebar();
            selectGroupOnSidebar(nameGroup);

            checkUserExisted(nameUser);
            logger.info("'Add user(s) to group' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when adding user(s) to group");
        }
    }

    public void moveToFolder(String nameFolder,
                             String nameUser) {
        try {
            selectUser(nameUser);

            goToMoveToFolder();

            selectFolderToMoveForUser(nameFolder);

            navigateToUsersPage();

            clickExpandButtonOnSidebar();
            selectFolderOnSidebar(nameFolder);

            checkUserExisted(nameUser);
            logger.info("'Move to folder' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when moving user(s) to folder");
        }
    }

    public void deleteUsers(String nameUser) {
        boolean isUserExistedInRecycle = isElementPresent(UsersLocators.SEARCHED_NAME_DISPLAYED.getBy(nameUser));
        try {
            selectUser(nameUser);

            selectDeleteUsers();
            clickYesButton();
            isSucceed();

            navigateToRecycle();
            Assert.assertTrue(isUserExistedInRecycle, "User is not found, please check again");
            logger.info("User is existed in Recycle page, delete user successfully");

        } catch (Exception e) {
            logger.error("Error occur when deleting user(s)");
        }
    }

}





