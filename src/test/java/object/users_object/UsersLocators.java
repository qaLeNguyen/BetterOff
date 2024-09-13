package object.users_object;

import object.z_type.LocatorsType;
import org.openqa.selenium.By;

public enum UsersLocators {

    BUTTON_VIEW_ALL_SUB_FOLDERS(LocatorsType.XPATH, "//a[.='View all sub-folders']"),
    BUTTON_VIEW_THIS_FOLDER(LocatorsType.XPATH, "//a[.='View this folder']"),
    CHECK_BOX_CHANGE_PASSWORD_CREATE_KEY_FILE(LocatorsType.ID,"PwdForceChange"),
    CHECK_BOX_CHANGE_PASSWORD_ADD_USER(LocatorsType.ID,"IsAdminSetPassword"),
    CHECK_BOX_OF_SEARCHED_USER_NAME_DISPLAYED(LocatorsType.XPATH, "//tr[td[a[text()='{{text}}']]]//input[@type='checkbox']"),
    CHECK_BOX_OF_SEARCHED_KEY_NAME_DISPLAYED(LocatorsType.XPATH, "//tr[td[text()='{{text}}']]//input[@type='checkbox']"),
    CHECK_BOX_OF_SEARCHED_GROUP_NAME_DISPLAYED(LocatorsType.XPATH, "//tr[td[text()='{{text}}']]//input[@type='checkbox']"),

    CONFIRM_DIALOG_DELETE_USER(LocatorsType.XPATH,"//div[@class='jconfirm-content']/div[.='Delete the selected user(s)?']"),
    CONFIRM_DIALOG_RESET_FAILED_LOGIN(LocatorsType.XPATH,"//div[@class='jconfirm-content']/div[.='Reset failed login number to zero for the selected user(s)?']"),
    CONFIRM_DIALOG_DELETE_FOLDER(LocatorsType.XPATH,"//div[@class='jconfirm-content']/div[contains(.,'Warning ! You are about to delete a folder that may: user(s), key(s), and device')]"),
    CONFIRM_DIALOG_DELETE_GROUP(LocatorsType.CSS,".jconfirm-content"),

    DRAG_USER_NAME(LocatorsType.XPATH,"//span[contains(@id, '{{text}}')]"),
    DROPDOWN_USER(LocatorsType.ID,"Actions_Type_User_Basic"),
    DROPDOWN_USER_ADVANCED(LocatorsType.ID,"Actions_Type_User_Advanced"),
    DROPDOWN_FOLDER(LocatorsType.ID,"Actions_Type_Folder_Basic"),
    DROPDOWN_USER_TYPE_IN_ADD_NEW_USER(LocatorsType.ID, "UserType"),
    DROPDOWN_GENERAL_IN_VIEW_PROPERTIES(LocatorsType.ID, "Actions_Type_General"),

    ITEM_BACK_INSIDE_VIEW_PROPERTIES(LocatorsType.XPATH,"//div[@id='actions_panel']//a[.='Back']"),
    ITEM_PERMISSIONS_IN_VIEW_PROPERTIES(LocatorsType.XPATH,"//a[.='Permissions']"),
    ITEM_AUTOBOOT_USER_TYPE(LocatorsType.XPATH,"//option[.='Autoboot User']"),
    ITEM_REGULAR_USER_TYPE(LocatorsType.XPATH,"//option[.='Regular User']"),
    ITEM_TEMPORARY_USER_TYPE(LocatorsType.XPATH,"//option[.='Temporary User']"),
    ITEM_VIEW_PROPERTIES(LocatorsType.ID,"Actions_User_ViewUserGeneral"),
    ITEM_ASSIGN_KEYS_TO_USERS(LocatorsType.ID,"Actions_User_AssignKeys"),
    ITEM_ADD_USERS_TO_GROUP(LocatorsType.ID,"Actions_User_AssignGroups"),
    ITEM_VIEW_LOGS(LocatorsType.ID,"Actions_User_ViewLogs"),
    ITEM_CREATE_KEY_FILE(LocatorsType.ID,"Actions_Key_CreateKeyFile"),
    ITEM_CR_USER_ADVANCED(LocatorsType.ID,"Actions_User_ChallengeResponse"),
    ITEM_CHECK_PBCONNEX(LocatorsType.ID,"Actions_User_CheckPBConnex"),
    ITEM_RESET_FAILED_PREBOOT_LOGIN(LocatorsType.ID,"Actions_User_ResetFailedLoginsConfirmed"),
    ITEM_ADD_FOLDER(LocatorsType.ID,"Actions_Folder_AddFolder"),
    ITEM_ADD_NEW_USER(LocatorsType.ID,"Actions_Folder_AddUserGeneral"),
    ITEM_ADD_NEW_GROUP(LocatorsType.ID,"Actions_Group_AddGroup"),
    ITEM_CR_FOLDER(LocatorsType.ID,"Actions_User_ChallengeResponseGen"),
    ITEM_DE_ASSIGN_KEY_FROM_USER(LocatorsType.ID,"Actions_User_DeassignKeys"),
    INPUT_FIELD_PASSWORD_CREATE_KEY_FILE(LocatorsType.ID,"PwdNew"),
    INPUT_FIELD_PASSWORD_CONFIRM_CREATE_KEY_FILE(LocatorsType.ID,"PwdConfirm"),
    INPUT_FIELD_FOLDER_NAME(LocatorsType.ID,"Folder_Name"),
    INPUT_FIELD_GROUP_NAME(LocatorsType.ID,"GroupName"),
    INPUT_FIELD_DESCRIPTION(LocatorsType.ID,"Description"),
    INPUT_FIELD_USERNAME(LocatorsType.ID,"User_Name"),
    INPUT_FIELD_PASSWORD(LocatorsType.ID,"password-input"),
    INPUT_FIELD_FIRSTNAME(LocatorsType.ID,"FirstName"),
    INPUT_FIELD_LASTNAME(LocatorsType.ID,"LastName"),
    INPUT_FIELD_PHONE(LocatorsType.ID,"Phone"),
    INPUT_FIELD_EMAIL(LocatorsType.ID,"Email"),

    TAB_TOKENS(LocatorsType.XPATH,"//a[.='Token']"),
    TAB_DEVICES(LocatorsType.XPATH,"//a[.='Devices']"),
    TAB_KEYS(LocatorsType.XPATH,"//a[.='Keys']"),
    TAB_LOGS(LocatorsType.XPATH,"//a[.='Logs']"),
    TAB_MULTIPLE_IDP(LocatorsType.XPATH,"//a[.='IDP Multi-Account']"),

    LABEL_PROPERTIES_KEYS(LocatorsType.XPATH, "//label[.='Properties: Keys']"),
    LABEL_ASSIGN_KEYS_TO_USERS(LocatorsType.XPATH, "//label[.='Assign keys to user(s)']"),
    LABEL_ADD_USERS_TO_GROUP(LocatorsType.XPATH, "//label[.='Add user(s) to group']"),
    LABEL_CREATE_KEY_FILE(LocatorsType.XPATH, "//label[.='Create Key File']"),
    LABEL_ADD_NEW_USER(LocatorsType.XPATH, "//label[.='Add new user']"),
    LABEL_CR_IN_USER_ADVANCED(LocatorsType.XPATH, "//li[@id='breadcrumbnav']//label[.='Challenge Response']"),

    SEARCHED_NAME_DISPLAYED(LocatorsType.XPATH, "//a[.='{{text}}']"),
    LABEL_PROPERTIES(LocatorsType.XPATH, "//label[.='Properties: General']"),
    LABEL_MOVE_TO_FOLDER(LocatorsType.XPATH, "//label[.='Move to folder']"),
    ITEM_DELETE_USERS(LocatorsType.ID,"Actions_User_DeleteUserConfirmed"),
    ITEM_MOVE_TO_FOLDER(LocatorsType.ID,"Actions_User_MoveUser"),




    ;

    private final LocatorsType locatorType;
    private final String valueString;

    UsersLocators(LocatorsType locatorType, String locatorValue) {
        this.locatorType = locatorType;
        this.valueString = locatorValue;
    }

    public By getBy(String value) {
        return locatorType.buildBy(valueString.replace("{{text}}", value));
    }

    public By getBy() {
        return locatorType.buildBy(valueString);
    }

}




