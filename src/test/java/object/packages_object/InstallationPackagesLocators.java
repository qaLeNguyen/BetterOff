package object.packages_object;

import object.z_type.LocatorsType;
import org.openqa.selenium.By;

public enum InstallationPackagesLocators {

    DROPDOWN_OPTION(LocatorsType.XPATH, "//div[@class='k-animation-container']//li[text()='{{text}}']"),


    PACKAGE_DROPDOWN(LocatorsType.ID,"Actions_Type_Package_Basic"),
    PACKAGE_CREATE(LocatorsType.ID,"Actions_Package_AddPackages"),
    PACKAGE_DELETE(LocatorsType.ID,"Actions_Package_DeletePackageConfirmed"),
    PACKAGE_MODIFY(LocatorsType.ID,"Actions_Package_ModifyPackages"),
    PACKAGE_COPY(LocatorsType.ID,"Actions_Package_CopyPackages"),

    /**
     * Installation Package Basics
     */
    PROFILE_TO_BE_DEPLOYED(LocatorsType.XPATH, "//div[@name='formRowProfile']//span[@class='k-input']"),
    PACKAGE_NAME(LocatorsType.XPATH, "//div[@name='formRowPackageName']//span[@class='k-input']"),
    PACKAGES_COMMENTS(LocatorsType.XPATH, "//div[@name='formRowPackageDescription']//span[@class='k-input']"),
    PACKAGES_TYPE(LocatorsType.XPATH, "//div[@name='formRowDeviceType']//span[@class='k-input']"),
    TARGET_PLATFORM(LocatorsType.XPATH, "//div[@name='formRowTargetPlatform']//span[@class='k-input']"),

    /**
     * Installation Process Settings
     */
    IF_UNABLE_TO_COMM(LocatorsType.XPATH, "//div[@name='formRowTransparentRemoteInst']//span[@class='k-input']"),
    ENC_PROCESS_MONITORING(LocatorsType.XPATH, "//div[@name='formRowNoProgressWC']//span[@class='k-input']"),
    IF_USING_FILE_DISTRIBUTION(LocatorsType.XPATH, "//div[@name='formRowNoProgressWC']//span[@class='k-input']"),
    SD_NORMALLY_TRY_TO_REBOOT_ONCE_PREBOOT_HAS_BEEN_INSTALLED(LocatorsType.XPATH, "//div[@name='formRowNoProgressWC']//span[@class='k-input']"),
    USER_NOTIFICATION_DURING_INSTALLATION(LocatorsType.XPATH, "//div[@name='formRowNoProgressWC']//span[@class='k-input']"),
    COMM_TO_SDCONNEX_DURING_INSTALL(LocatorsType.XPATH, "//div[@name='formRowKeepFirstUserInfo']//span[@class='k-input']"),
    DEFINE_WHETHER_SD_SHOULD_REBOOT(LocatorsType.XPATH, "//div[@name='formRowRestartPC']//span[@class='k-input']"),

    /**
     * Device Information and Key-Creation Settings
     */
    DEVICE_DATA_VERIFICATION(LocatorsType.XPATH, "//div[@name='formRowShowSDForm']//span[@class='k-input']"),
    NEW_DEVICE_KEY_NAME_FORMAT(LocatorsType.XPATH, "//div[@name='formRowKeyNameFormat']//span[@class='k-input']"),
    NEW_KEY_NAME_SUFFIX(LocatorsType.XPATH, "//div[@name='formRowRandomKeyName']//span[@class='k-input']"),
    NEW_DEVICE_ORGANIZATION(LocatorsType.XPATH, "//div[@name='formRowLeaveDeviceInRegistrationFolder']//span[@class='k-input']"),
    CLIENT_UPGRADE_DEFINE_IF_DEVICES_CHANGE_FOLDER(LocatorsType.XPATH, "//div[@name='formRowMoveFolderOnUpgrade']//span[@class='k-input']"),

    /**
     * Device Provisioning and Access Settings
     */
    INSTALL_TECHNICIAN_POST_INSTALL_ACCESS(LocatorsType.XPATH, "//div[@name='formRowNoKeyFileForDeployW']//span[@class='k-input']"),
    ACCESS_TO_THE_DEVICE_DURING_PROVISIONING(LocatorsType.XPATH, "//div[@name='formRowInterim']//span[@class='k-input']"),
    DEVICE_ACCESS_PROTECTION_DURING_PROVISIONING(LocatorsType.XPATH, "//div[@name='formRowTempUserII']//span[@class='k-input']"),
    HOW_DEVICE_OWNERSHIP_IS_DETERMINED(LocatorsType.XPATH, "//div[@name='formRowSecureMoment']//span[@class='k-input']"),
    IS_CONNECTION_TO_SES_REQUIRED_TO_DEFINE_DEVICE_OWNERSHIP(LocatorsType.XPATH, "//div[@name='formRowAllowOfflineAutoSM']//span[@class='k-input']"),
    DEFINE_WHICH_USER_DEPLOYS_SECUREDOC_ON_DEVICE(LocatorsType.XPATH, "//div[@name='formRowDeployingUserDropW']//span[@class='k-input']"),

    /**
     * New Users, User Privileges and Recovery Access Settings
     */
    BUTTON_BROWSE(LocatorsType.ID, "AdminUserList_Selectbtn"),
    BUTTON_BROWSE_OF_SPECIFIED_FOLDER(LocatorsType.ID, "LocSpecifiedFolder_Selectbtn"),
    BUTTON_REMOVE(LocatorsType.ID, "AdminUserList_Removebtn"),
    CHECKBOX_OF_USER_NAME_IN_PANEL_AFTER_CLICK_BUTTON_BROWSE(LocatorsType.XPATH, "//tr[td[text()='{{text}}']]//input[@type='checkbox']"),
    RADIO_BUTTON_USER_RIGHTS(LocatorsType.XPATH, "UserRights"),
    RADIO_BUTTON_ADMIN_RIGHTS(LocatorsType.XPATH, "AdminRights"),













    ;














    private final LocatorsType locatorType;
    private final String valueString;

    InstallationPackagesLocators(LocatorsType locatorType, String locatorValue) {
        this.locatorType = locatorType;
        this.valueString = locatorValue;
    }

    public By getBy(String value) {
        return locatorType.buildBy(this.valueString.replace("{{text}}", value));
    }

    public By getBy() {
        return locatorType.buildBy(this.valueString);
    }

}
