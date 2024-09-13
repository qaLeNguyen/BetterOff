package object.devices_object;

import object.z_type.LocatorsType;
import org.openqa.selenium.By;

public enum DevicesLocators {

    DEVICE_NAME(LocatorsType.ID,"DeviceName"),
    MANUFACTURER(LocatorsType.ID,"Manufacturer"),
    LOCATION(LocatorsType.ID,"Location"),
    SES_PROFILE(LocatorsType.ID,"SesProfile"),
    ASSET_TAG(LocatorsType.ID,"AssetTag"),
    IP_ADDRESS(LocatorsType.ID,"IPAddress"),
    VERSION(LocatorsType.ID,"Version"),
    ENCRYPTION_TYPE(LocatorsType.ID,"HardwareEncryption"),
    ENCRYPTION_STATUS(LocatorsType.ID,"EncryptionStatus"),
    IS_A_CLONE(LocatorsType.ID,"isClone"),
    SERIAL_NUMBER(LocatorsType.ID,"SerialNumber"),
    MODEL(LocatorsType.ID,"Model"),
    TYPE(LocatorsType.ID,"Type"),
    PROFILE_STATUS(LocatorsType.ID,"ProfileStatus"),
    BUTTON_STATUS(LocatorsType.ID,"Status"),
    PORT(LocatorsType.ID,"Port"),
    LAST_COMMUNICATED(LocatorsType.ID,"LastCommunicated"),
    CHECK_BOX_OF_SEARCHED_DEVICE(LocatorsType.XPATH, "//tr[td[a[text()='{{text}}']]]//input[@type='checkbox']"),
    SEARCHED_USERS_NAME_DISPLAYED_IN_PANEL(LocatorsType.XPATH, "//a[.='{{text}}']"),
    SEARCHED_DEVICES_NAME_DISPLAYED_IN_PANEL(LocatorsType.XPATH, "//a[.='{{text}}']"),
    DROPDOWN_DEVICE(LocatorsType.ID,"Actions_Type_Device_Basic"),
    DROPDOWN_DEVICE_ADVANCED(LocatorsType.ID,"Actions_Type_Device_Advanced"),
    DROPDOWN_FOLDER(LocatorsType.ID,"Actions_Type_Folder_Basic"),
    DROPDOWN_FOLDER_ADVANCED(LocatorsType.ID,"Actions_Type_Folder_Advanced"),
    LABEL_MOVE_DEVICES_TO_FOLDER(LocatorsType.CSS, "[title='Move device(s) to folder'] > label"),
    LABEL_ADD_DEVICES_TO_GROUP(LocatorsType.CSS, "[title='Add device(s) to group'] > label"),
    LABEL_ASSIGN_USERS_TO_DEVICES(LocatorsType.CSS, "[title='Assign user(s) to device(s)'] > label"),
    LABEL_ASSIGN_KEYS_TO_DEVICES(LocatorsType.CSS, "[title='Assign user(s) to device(s)'] > label"),
    LABEL_PROPERTIES(LocatorsType.XPATH, "//label[.='Properties: General']"),
    LABEL_PROPERTIES_KEYS(LocatorsType.XPATH, "//label[.='Properties: Keys']"),
    LABEL_PROPERTIES_USERS(LocatorsType.XPATH, "//label[.='Properties: Users']"),
    ITEM_MOVE_DEVICES_TO_FOLDER(LocatorsType.ID, "Actions_Device_MoveDevice"),
    ITEM_ADD_DEVICES_TO_GROUP(LocatorsType.ID, "Actions_Device_AddGroup"),
    ITEM_VIEW_PROPERTIES_OF_DEVICE(LocatorsType.ID, "Actions_Device_ViewDeviceGeneral"),
    ITEM_DELETE_DEVICES(LocatorsType.ID, "Actions_Device_DeleteConfirmed"),
    ITEM_ASSIGN_KEYS_TO_DEVICES(LocatorsType.ID, "Actions_Device_AddKey"),
    CONFIRM_DIALOG_DELETE_DEVICE(LocatorsType.XPATH, "//div[@class='jconfirm-content']/div[.='Delete the selected device(s) ?']"),
    MENU_DEVICE_PROPERTIES_KEYS(LocatorsType.XPATH,"//a[.='Keys']"),
    MENU_DEVICE_PROPERTIES_USERS(LocatorsType.XPATH,"//a[.='Users']"),






    ;

    private final LocatorsType locatorType;
    private final String valueString;

    DevicesLocators(LocatorsType locatorType, String locatorValue) {
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
