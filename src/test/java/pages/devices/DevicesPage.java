package pages.devices;

import common.BuiltInAction;
import object.common_object.CommonLocators;
import object.devices_object.DevicesLocators;
import object.users_object.UsersLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;


public class DevicesPage extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(DevicesPage.class);

    public DevicesPage() {
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

    public void clickDisplayAllUsers() {
        click(CommonLocators.CHECK_BOX_DISPLAY_ALL_USERS.getBy());
    }

    public void scrollToViewFolderInMoveToFolderPage(String name) {
        scrollToView(CommonLocators.FOLDER_NAME_DISPLAYED_IN_MOVE_TO_FOLDER.getBy(name));
    }

    public void scrollToViewFolderOnSidebar(String name) {
        scrollToView(CommonLocators.SIDEBAR_DEVICES_FOLDER_NAME_DISPLAYED.getBy(name));
    }

    public void scrollToViewGroupOnSidebar(String name) {
        scrollToView(CommonLocators.SIDEBAR_DEVICES_GROUP_NAME_DISPLAYED.getBy(name));
    }

    public void selectFolderOnSidebarInDevicesPage(String name) {
        try {
            scrollToViewFolderOnSidebar(name);
            click(CommonLocators.SIDEBAR_DEVICES_FOLDER_NAME_DISPLAYED.getBy(name));
            logger.info("Clicked folder '{}' on sidebar of devices successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when trying to select folder on sidebar of devices");
        }
    }

    public void selectGroupOnSidebarInDevicesPage(String name) {
        try {
            scrollToViewGroupOnSidebar(name);
            click(CommonLocators.SIDEBAR_DEVICES_GROUP_NAME_DISPLAYED.getBy(name));
            logger.info("Clicked group '{}' on sidebar of devices successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when trying to select group on sidebar of devices");
        }
    }

    public void navigateToRecycleInDevicesPage() {
        try {
            scrollToView(CommonLocators.SIDEBAR_RECYCLE_BIN.getBy());
            click(CommonLocators.SIDEBAR_RECYCLE_BIN.getBy());
            logger.info("Navigated to 'Recycle' page successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Recycle' page");
        }
    }

    public void search(String name) {
        input(CommonLocators.SEARCH_FIELD.getBy(), name);
    }

    public void selectDevice(String name) {
        try {
            boolean isDeviceFound = isElementPresent(DevicesLocators.CHECK_BOX_OF_SEARCHED_DEVICE.getBy(name));
            if (isDeviceFound) {
                click(DevicesLocators.CHECK_BOX_OF_SEARCHED_DEVICE.getBy(name));
                logger.info("Selected device '{}' at 1st attempt", name);
            } else {
                clickViewAllSubFolders();
                if (isDeviceFound) {
                    click(DevicesLocators.CHECK_BOX_OF_SEARCHED_DEVICE.getBy(name));
                    logger.info("Selected device '{}' at 2nd attempt", name);
                } else {
                    search(name);
                    click(DevicesLocators.CHECK_BOX_OF_SEARCHED_DEVICE.getBy(name));
                    logger.info("Selected device '{}' at 3rd attempt", name);
                }
            }
        } catch (Exception e) {
            logger.error("Error occurred when trying to select device");
        }
    }

    public void checkFolderExistedInDevicePage(String name) {
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

    public void checkGroupExistedInDevicePage(String name) {
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

    public void goToViewPropertiesOfDevice() {
        try {
            hoverOverAndSelect(DevicesLocators.ITEM_VIEW_PROPERTIES_OF_DEVICE.getBy(),
                    DevicesLocators.ITEM_VIEW_PROPERTIES_OF_DEVICE.getBy());

            boolean propertiesPage = isElementPresent(DevicesLocators.LABEL_PROPERTIES.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'View properties' of device");
            logger.info("Navigated to 'View properties' of device successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'View properties' of device");
        }
    }

    public void goToAssignUsersToDevices() {
        try {
            hoverOverAndSelect(DevicesLocators.DROPDOWN_DEVICE.getBy(),
                    DevicesLocators.ITEM_ADD_DEVICES_TO_GROUP.getBy());

            boolean propertiesPage = isElementPresent(DevicesLocators.LABEL_ASSIGN_USERS_TO_DEVICES.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'Move to folder'");
            logger.info("Navigated to 'Assign user(s) to device(s)' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Assign user(s) to device(s)'");
        }
    }

    public void goToAddDevicesToGroup() {
        try {
            hoverOverAndSelect(DevicesLocators.DROPDOWN_DEVICE.getBy(),
                    DevicesLocators.ITEM_ADD_DEVICES_TO_GROUP.getBy());

            boolean propertiesPage = isElementPresent(DevicesLocators.LABEL_ADD_DEVICES_TO_GROUP.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'Move to folder'");
            logger.info("Navigated to 'Add devices to group' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Add devices to group'");
        }
    }

    public void goToMoveDevicesToFolder() {
        try {
            hoverOverAndSelect(DevicesLocators.DROPDOWN_DEVICE.getBy(),
                    DevicesLocators.ITEM_MOVE_DEVICES_TO_FOLDER.getBy());

            boolean propertiesPage = isElementPresent(DevicesLocators.LABEL_MOVE_DEVICES_TO_FOLDER.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'Move to folder'");
            logger.info("Navigated to 'Move devices to folder' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Move devices to folder'");
        }
    }

    public void goToAssignKeysToDevices() {
        try {
            hoverOverAndSelect(DevicesLocators.DROPDOWN_DEVICE.getBy(),
                    DevicesLocators.ITEM_ASSIGN_KEYS_TO_DEVICES.getBy());

            boolean propertiesPage = isElementPresent(DevicesLocators.LABEL_ASSIGN_KEYS_TO_DEVICES.getBy());
            Assert.assertTrue(propertiesPage, "Unable to navigate to 'Move to folder'");
            logger.info("Navigated to 'Assign key(s) to device(s)' successfully");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Assign key(s) to device(s)'");
        }
    }

    public void goToViewPropertiesKeysOfDevice() {
        try {
            isElementPresent(UsersLocators.LABEL_PROPERTIES.getBy());
            click(DevicesLocators.MENU_DEVICE_PROPERTIES_KEYS.getBy());

            boolean propertiesKeysPage = isElementPresent(DevicesLocators.LABEL_PROPERTIES_KEYS.getBy());
            Assert.assertTrue(propertiesKeysPage, "Unable to navigate to properties Keys");
            logger.info("Navigated to View Properties Keys successfully");

        } catch (Exception e) {
            logger.error("Error occurred when checking if navigating to properties Keys");
        }
    }

    public void goToViewPropertiesUsersOfDevice() {
        try {
            isElementPresent(UsersLocators.LABEL_PROPERTIES.getBy());
            click(DevicesLocators.MENU_DEVICE_PROPERTIES_USERS.getBy());

            boolean propertiesKeysPage = isElementPresent(DevicesLocators.LABEL_PROPERTIES_USERS.getBy());
            Assert.assertTrue(propertiesKeysPage, "Unable to navigate to properties Keys");
            logger.info("Navigated to device's properties users successfully");

        } catch (Exception e) {
            logger.error("Error occurred when checking if navigating to device's properties users");
        }
    }

    public void selectFolderToMoveForDevice(String name) {
        try {
            isElementPresent(UsersLocators.LABEL_MOVE_TO_FOLDER.getBy());
            scrollToViewFolderInMoveToFolderPage(name);
            click(CommonLocators.FOLDER_NAME_DISPLAYED_IN_MOVE_TO_FOLDER.getBy(name));
            clickMoveButton();
            isSucceed();
            logger.info("Selected folder '{}' and clicked 'Move' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting folder for device");
        }
    }

    public void selectGroupToAddForDevice(String name) {
        try {
            clickDisplayAllGroups();

            search(name);
            clickWithRetry(CommonLocators.SEARCHED_GROUP.getBy(name), 2);

            clickSaveButton();
            isSucceed();
            logger.info("Selected group '{}' and clicked 'Save' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting group for device");
        }
    }

    public void selectKeysAndAssignToDevice(String name) {
        try {
            clickDisplayAllKeys();

            search(name);
            clickWithRetry(CommonLocators.SEARCHED_KEY.getBy(name), 2);

            clickSaveButton();
            isSucceed();
            logger.info("Select key '{}' and click 'Save' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting key for device");
        }
    }

    public void selectUsersAndAssignToDevice(String name) {
        try {
            clickDisplayAllUsers();
            search(name);

            clickWithRetry(DevicesLocators.SEARCHED_USERS_NAME_DISPLAYED_IN_PANEL.getBy(), 2);
            clickSaveButton();
            isSucceed();
            logger.info("Select user '{}' and click 'Save' button successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when selecting user for device");
        }
    }

    public void selectDeleteDevices() {
        try {
            hoverOverAndSelect(DevicesLocators.DROPDOWN_DEVICE.getBy(),
                    DevicesLocators.ITEM_DELETE_DEVICES.getBy());

            boolean confirmDialogOfDeleteUser = isElementPresent(DevicesLocators.CONFIRM_DIALOG_DELETE_DEVICE.getBy());
            Assert.assertTrue(confirmDialogOfDeleteUser,
                    "Failed to perform 'Delete device(s)'");
            logger.info("Clicked 'Delete device(s)' and the confirm dialog is displayed");

        } catch (Exception e) {
            logger.error("Error occurred when perform 'Delete device(s)'");
        }
    }

    public void checkDeviceExisted(String name) {
        try {
            search(name);

            boolean isDeviceExisted = isElementPresent(DevicesLocators.SEARCHED_DEVICES_NAME_DISPLAYED_IN_PANEL.getBy(name));
            Assert.assertTrue(isDeviceExisted, "Device {" + name + "} is not existed");
            logger.info("Device '{}' is existed", name);

        } catch (Exception e) {
            logger.error("Error occurred when checking if device '{}' is existed", name);
        }
    }

    public void checkKeyBelongToDevice(String nameKey) {
        try {
            search(nameKey);

            boolean isKeyDisplayed = isElementPresent(CommonLocators.SEARCHED_KEY.getBy(nameKey));
            Assert.assertTrue(isKeyDisplayed, "The key is not belong to user");
            logger.info("The key '{}' is belong to device", nameKey);

        } catch (Exception e) {
            logger.error("Error occurred when checking if the key is belong to device");
        }
    }

    public void checkUserBelongToDevice(String nameUser) {
        try {
            search(nameUser);

            boolean isUserDisplayed = isElementPresent(DevicesLocators.SEARCHED_USERS_NAME_DISPLAYED_IN_PANEL.getBy(nameUser));
            Assert.assertTrue(isUserDisplayed, "The key is not belong to user");
            logger.info("The user '{}' is belong to device", nameUser);

        } catch (Exception e) {
            logger.error("Error occurred when checking if the user is belong to device");
        }
    }

    public void checkDeviceExistedInFolder(String nameFolder, String nameDevice) {
        try {
            navigateToDevicesPage();
            selectFolderOnSidebarInDevicesPage(nameFolder);
            search(nameDevice);

            boolean isUserExisted = isElementPresent(DevicesLocators.SEARCHED_DEVICES_NAME_DISPLAYED_IN_PANEL.getBy(nameDevice));
            Assert.assertTrue(isUserExisted, "User " + nameDevice + " is not existed in folder " + nameFolder);
            logger.info("Device '{}' is existed in folder '{}'", nameDevice, nameFolder);

        } catch (Exception e) {
            logger.error("Error occurred when checking if device is existed in folder");
        }
    }

    public void checkDeviceExistedInGroup(String nameGroup, String nameDevice) {
        try {
            navigateToDevicesPage();
            selectGroupOnSidebarInDevicesPage(nameGroup);
            search(nameDevice);

            boolean isDeviceExisted = isElementPresent(DevicesLocators.SEARCHED_DEVICES_NAME_DISPLAYED_IN_PANEL.getBy(nameDevice));
            Assert.assertTrue(isDeviceExisted, "User " + nameDevice + " is not existed in group " + nameGroup);
            logger.info("Device '{}' is existed in group '{}'", nameDevice, nameGroup);

        } catch (Exception e) {
            logger.error("Error occurred when checking if device is existed in group");
        }
    }

    public void moveDevicesToFolder(String nameFolder,
                                    String nameDevice)
    {
        selectDevice(nameDevice);

        goToMoveDevicesToFolder();

        selectFolderToMoveForDevice(nameFolder);

        checkDeviceExisted(nameDevice);

        navigateToUsersPage();

        checkDeviceExistedInFolder(nameFolder, nameDevice);
    }

    public void assignKeysToDevice(String nameKey,
                                   String nameDevice)
    {
        selectDevice(nameDevice);

        goToAssignKeysToDevices();

        selectKeysAndAssignToDevice(nameKey);

        checkKeyBelongToDevice(nameKey);
    }

    public void assignUsersToDevices(String nameUser,
                                     String nameDevice)
    {
        selectDevice(nameDevice);

        goToAssignUsersToDevices();

        selectUsersAndAssignToDevice(nameUser);

        checkUserBelongToDevice(nameUser);
    }

    public void addDevicesToGroup(String nameGroup,
                                  String nameDevice)
    {
        selectDevice(nameDevice);

        goToAddDevicesToGroup();

        selectGroupToAddForDevice(nameGroup);

        checkDeviceExisted(nameDevice);
    }




}
