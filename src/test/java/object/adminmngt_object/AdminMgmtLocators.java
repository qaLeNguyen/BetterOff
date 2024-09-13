package object.adminmngt_object;

import object.z_type.LocatorsType;
import org.openqa.selenium.By;

public enum AdminMgmtLocators {

    CHECK_BOX_OF_NAME_USER_DISPLAYED_IN_PANEL(LocatorsType.XPATH, "//tr[td[a[text()='{{text}}']]]//input[@type='checkbox']"),
    DROPDOWN_ADMINISTRATOR(LocatorsType.ID,"Actions_Type_Admin_Basic"),
    DROPDOWN_GENERAL(LocatorsType.ID,"Actions_Type_General"),
    BUTTON_BACK(LocatorsType.ID,"Actions_Configuration_ViewConfigAdminUsers"),
    ITEM_MANAGE_ROLES(LocatorsType.ID,"Actions_Configuration_ManageRbacRoles"),
    ITEM_ADD_NEW_ADMINISTRATOR(LocatorsType.ID,"Actions_Configuration_AddAdmin"),
    ITEM_DELETE_ADMINISTRATOR(LocatorsType.ID,"Actions_Configuration_DeleteAdminConfirmed"),
    ITEM_VIEW_PROPERTIES(LocatorsType.ID,"Actions_Configuration_ViewAdminGeneral"),
    ITEM_CHANGE_ADMINISTRATOR_PASSWORD(LocatorsType.ID,"Actions_Configuration_ChangePassword"),
    ITEM_MANAGE_ROLES_ADMINISTRATOR_GROUP(LocatorsType.ID,"Actions_Configuration_RemoveAdminGroupConfirmed"),
    ITEM_ADD_ADMINISTRATOR_GROUP(LocatorsType.ID,"Actions_Configuration_AddAdminGroup"),
    ITEM_REMOVE_FROM_ADMINISTRATOR(LocatorsType.ID,"Actions_Configuration_RemoveAdminGroupConfirmed"),
    ITEM_VIEW_PROPERTIES_ADMINISTRATOR(LocatorsType.ID,"Actions_Configuration_ViewAdminGroupGeneral"),
    ITEM_ADD_NEW_ROLE(LocatorsType.ID,"Actions_Configuration_AddRbacRole"),
    ITEM_DELETE_ROLE(LocatorsType.ID,"Actions_Configuration_RemoveRbacRoleConfirmed"),
    ITEM_EDIT_ROLE(LocatorsType.ID,"Actions_Configuration_EditRbacRole"),
    ITEM_ASSIGN_ROLE_TO_ADMIN(LocatorsType.ID,"Actions_Configuration_AssignRbacRoleToAdmin"),
    LABEL_MANAGE_ROLE(LocatorsType.CSS,"[title='Manage Roles'] > label"),
    LABEL_SELECT_USER(LocatorsType.CSS,"[title='Select user(s)'] > label"),
    LABEL_VIEW_PROPERTIES(LocatorsType.CSS,"[title='Properties: General'] > label"),
    LABEL_CHANGE_ADMINISTRATOR_PASSWORD(LocatorsType.CSS,"[title='Properties: General'] > label"),
    LABEL_ADMINISTRATOR_GROUPS(LocatorsType.CSS,"[title='Administrator Groups'] > label"),
    LABEL_MANAGE_ROLE_GROUPS(LocatorsType.CSS,"[title='Manage Roles'] > label"),
    LABEL_ADD_ADMINISTRATOR_GROUPS(LocatorsType.ID,"id=breadcrumb_Configuration_AddAdminGroup_4"),
    LABEL_SELECT_ROLE_IN_ASSIGN_ROLE_TO_ADMIN(LocatorsType.CSS,"[title='Select role(s)'] > a"),
    NAME_USER_DISPLAYED_IN_PANEL(LocatorsType.XPATH,"//a[.='{{}}']"),
    NEW_ROLE_JUST_ADDED(LocatorsType.XPATH, "//tr[td/a[text()='{{text}}']]//input[@type='checkbox']"),
    ROLE_DESKTOP_SUPPORT(LocatorsType.XPATH, "//tr[td/a[text()='Desktop Support']]//input[@type='checkbox']"),
    ROLE_ADMINISTRATOR(LocatorsType.XPATH, "//tr[td/a[text()='Administrator']]//input[@type='checkbox']"),
    ROLE_HELPDESK(LocatorsType.XPATH, "//tr[td/a[text()='Helpdesk']]//input[@type='checkbox']"),
    ROLE_SUPPORT_DESK(LocatorsType.XPATH, "//tr[td/a[text()='Support Desk']]//input[@type='checkbox']"),

    TAB_ADMINISTRATORS(LocatorsType.XPATH,"//a[@id='tabs_Admin_0' and text()='Administrators']"),
    TAB_ADMINISTRATOR_GROUPS(LocatorsType.XPATH,"//a[@id='tabs_Admin_1' and text()='Administrator Groups']"),
    TAB_PERMISSIONS(LocatorsType.XPATH,"//a[@id='tabs_Admin_1' and text()='Permissions']"),
    TAB_FOLDER(LocatorsType.XPATH,"//a[@id='tabs_Admin_2' and text()='Folders']"),
    TAB_GENERAL(LocatorsType.XPATH,"//a[@id='tabs_Admin_0' and text()='General']"),


    ;

    private final LocatorsType locatorType;
    private final String value;

    AdminMgmtLocators(LocatorsType locatorType, String locatorValue) {
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
