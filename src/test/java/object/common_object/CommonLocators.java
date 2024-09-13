package object.common_object;

import object.z_type.LocatorsType;
import org.openqa.selenium.By;

public enum CommonLocators {

    USER_ID_FIELD(LocatorsType.ID, "UserName"),
    PASSWORD_FIELD(LocatorsType.ID, "password-input"),
    LOGIN_BUTTON(LocatorsType.ID, "ses-submit-btn"),
    BUTTON_YES(LocatorsType.XPATH, "//button[.='Yes']"),
    BUTTON_NO(LocatorsType.XPATH, "//button[.='No']"),
    BUTTON_MOVE(LocatorsType.ID,"btnSubmitMove"),
    BUTTON_SAVE(LocatorsType.NAME ,"save"),
    BUTTON_ADD(LocatorsType.NAME ,"save"),
    BUTTON_OK(LocatorsType.NAME ,"save"),
    BUTTON_OK_CONFIRM_DIALOG(LocatorsType.XPATH, "//button[@class='btn btn-default']"),

    LABEL_ADD_FOLDER(LocatorsType.XPATH, "//li[@id='breadcrumbnav']//label[.='Add folder']"),
    LABEL_ADD_GROUP(LocatorsType.XPATH, "//li[@id='breadcrumbnav']//label[.='Add group']"),
    LABEL_VIEW_AUDIT_LOG(LocatorsType.XPATH, "//label[.='View Audit Log']"),
    LABEL_CHECK_PBCONNEX(LocatorsType.XPATH, "//li[@id='breadcrumbnav']//label[.='Challenge Response']"),

    SECUREDOC_LOGO(LocatorsType.XPATH, "//li[@id='breadcrumbnav']//li[1]//span[1]"),
    SIDEBAR_USERS_PAGE(LocatorsType.XPATH, "//li[@class='i_Users']"),
    SIDEBAR_DEVICES_PAGE(LocatorsType.XPATH, "//li[@class='Devices']"),
    SIDEBAR_PROFILES_PAGE(LocatorsType.XPATH, "//li[@class='i_Profiles']"),
    SIDEBAR_PACKAGES_PAGE(LocatorsType.XPATH, "//li[@class='i_Packages']"),
    SIDEBAR_CONFIGURATION_PAGE(LocatorsType.XPATH, "//span[.='Configuration']"),
    SIDEBAR_RECYCLE_BIN(LocatorsType.CSS, ".RecyclingBin"),
    SIDEBAR_ADMIN_MANAGEMENT(LocatorsType.XPATH,"//span[.='Administrator Management']"),
    SIDEBAR_USERS_BUTTON_EXPAND_FOLDER(LocatorsType.XPATH, "//li[@class='jstree-closed']/ins[@class='jstree-icon']"),
    SIDEBAR_USERS_FOLDER_NAME_DISPLAYED(LocatorsType.XPATH, "//a[contains(.,'{{text}}')]"),
    SIDEBAR_USERS_GROUP_NAME_DISPLAYED(LocatorsType.XPATH, "//a[contains(.,'{{text}}')]"),
    SIDEBAR_DEVICES_FOLDER_NAME_DISPLAYED(LocatorsType.XPATH, "//a[contains(.,'{{text}}')]"),
    SIDEBAR_DEVICES_GROUP_NAME_DISPLAYED(LocatorsType.XPATH, "//a[contains(.,'{{text}}')]"),

    SIDEBAR(LocatorsType.ID,"foldermainnav"),
    SEARCH_FIELD(LocatorsType.CSS, "[placeholder='Search...']"),
    SEARCHED_KEY(LocatorsType.XPATH, "//td[@role='gridcell'][normalize-space(text())='{{text}}']"),
    SEARCHED_GROUP(LocatorsType.XPATH, "//td[@role='gridcell'][normalize-space(text())='{{text}}']"),

    OPERATION_SUCCEEDED_ALERT(LocatorsType.XPATH, "//div[@class='alert success']"),

    CHECK_BOX_DISPLAY_ALL_KEYS(LocatorsType.CSS,".aCheckBox"),
    CHECK_BOX_DISPLAY_ALL_GROUPS(LocatorsType.XPATH,"//a[.='Display all groups']"),
    CHECK_BOX_DISPLAY_ALL_USERS(LocatorsType.XPATH,"//a[.='Display all users']"),
    FOLDER_NAME_DISPLAYED_IN_MOVE_TO_FOLDER(LocatorsType.CSS,"[title='{{text}}']")





    ;





    private final LocatorsType locatorType;
    private final String value;

    CommonLocators(LocatorsType locatorType, String locatorValue) {
        this.locatorType = locatorType;
        this.value = locatorValue;
    }

    public By getBy(String value) {
        return locatorType.buildBy(this.value.replace("{{text}}", value));
    }

    public By getBy() {
        return locatorType.buildBy(this.value);
    }

}

