package pages.packages;

import common.BuiltInAction;
import object.packages_object.InstallationPackagesLocators;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S3DeviceInfoKeyCreationSettings extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S3DeviceInfoKeyCreationSettings.class);

    public S3DeviceInfoKeyCreationSettings() {
        super();
    }

    public void deviceDataVerification(String option) {
        try {
            logger.info("Attempting to select option in 'Device Data Verification'");
            selectOptionProfilesPackages(InstallationPackagesLocators.DEVICE_DATA_VERIFICATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device Data Verification' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device Data Verification'");
        }
    }

    public void newDeviceKeyNameFormat(String option) {
        try {
            logger.info("Attempting to select option in 'New Device Key Name format'");
            selectOptionProfilesPackages(InstallationPackagesLocators.NEW_DEVICE_KEY_NAME_FORMAT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'New Device Key Name format' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'New Device Key Name format'");
        }
    }

    public void newKeyNameSuffix(String option) {
        try {
            logger.info("Attempting to select option in 'New Key Name suffix'");
            selectOptionProfilesPackages(InstallationPackagesLocators.NEW_KEY_NAME_SUFFIX.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'New Key Name suffix' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'New Key Name suffix'");
        }
    }

    public void newDeviceOrganization(String option) {
        try {
            logger.info("Attempting to select option in 'New Device Organization'");
            selectOptionProfilesPackages(InstallationPackagesLocators.NEW_DEVICE_ORGANIZATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'New Device Organization' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'New Device Organization'");
        }
    }

    public void sdClientUpgradeDefineIfDeviceChangeFolder(String option) {
        try {
            logger.info("Attempting to select option in 'SD Client Upgrade: Define if devices change folders per above rule'");
            selectOptionProfilesPackages(InstallationPackagesLocators.CLIENT_UPGRADE_DEFINE_IF_DEVICES_CHANGE_FOLDER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SD Client Upgrade: Define if devices change folders per above rule' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SD Client Upgrade: Define if devices change folders per above rule'");
        }
    }

}
