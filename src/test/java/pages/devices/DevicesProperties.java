package pages.devices;

import common.BuiltInAction;
import object.devices_object.DevicesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DevicesProperties extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(DevicesProperties.class);

    public DevicesProperties() {
        super();
    }

    public String getDeviceName() {
        return getElementClickable(DevicesLocators.DEVICE_NAME.getBy()).getText();
    }

    public String getManufacturer() {
        return getElementClickable(DevicesLocators.MANUFACTURER.getBy()).getText();
    }

    public String getLocation() {
        return getElementClickable(DevicesLocators.LOCATION.getBy()).getText();
    }

    public String getSESProfile() {
        return getElementClickable(DevicesLocators.SES_PROFILE.getBy()).getText();
    }

    public String getAssetTag() {
        return getElementClickable(DevicesLocators.ASSET_TAG.getBy()).getText();
    }

    public String getIpAddress() {
        return getElementClickable(DevicesLocators.IP_ADDRESS.getBy()).getText();
    }

    public String getVersion() {
        return getElementClickable(DevicesLocators.VERSION.getBy()).getText();
    }

    public String getEncType() {
        return getElementClickable(DevicesLocators.ENCRYPTION_TYPE.getBy()).getText();
    }

    public String getEncStatus() {
        return getElementClickable(DevicesLocators.ENCRYPTION_STATUS.getBy()).getText();
    }

    public String getIsAClone() {
        return getElementClickable(DevicesLocators.IS_A_CLONE.getBy()).getText();
    }

    public String getSerialNumber() {
        return getElementClickable(DevicesLocators.SERIAL_NUMBER.getBy()).getText();
    }

    public String getModel() {
        return getElementClickable(DevicesLocators.MODEL.getBy()).getText();
    }

    public String getType() {
        return getElementClickable(DevicesLocators.TYPE.getBy()).getText();
    }

    public String getProfileStatus() {
        return getElementClickable(DevicesLocators.PROFILE_STATUS.getBy()).getText();
    }

    public String getButtonStatus() {
        return getElementClickable(DevicesLocators.BUTTON_STATUS.getBy()).getText();
    }

    public String getPort() {
        return getElementClickable(DevicesLocators.PORT.getBy()).getText();
    }

    public String getLastComm() {
        return getElementClickable(DevicesLocators.LAST_COMMUNICATED.getBy()).getText();
    }









}
