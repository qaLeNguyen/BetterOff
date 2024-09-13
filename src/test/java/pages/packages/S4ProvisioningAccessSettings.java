package pages.packages;

import common.BuiltInAction;
import object.packages_object.InstallationPackagesLocators;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S4ProvisioningAccessSettings extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S4ProvisioningAccessSettings.class);

    public S4ProvisioningAccessSettings() {
        super();
    }

    public void installTechnicianPostInstallAccess(String option) {
        try {
            logger.info("Attempting to select option in 'Install-Technician's post-install access'");
            selectOptionProfilesPackages(InstallationPackagesLocators.INSTALL_TECHNICIAN_POST_INSTALL_ACCESS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Install-Technician's post-install access' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Install-Technician's post-install access'");
        }
    }

    public void accessToTheDeviceDuringProvisioning(String option) {
        try {
            logger.info("Attempting to select option in 'Access to the device during Provisioning'");
            selectOptionProfilesPackages(InstallationPackagesLocators.ACCESS_TO_THE_DEVICE_DURING_PROVISIONING.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Access to the device during Provisioning' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Access to the device during Provisioning'");
        }
    }

    public void deviceAccessProtectionDuringProvisioning(String option) {
        try {
            logger.info("Attempting to select option in 'Device access-protection during Provisioning'");
            selectOptionProfilesPackages(InstallationPackagesLocators.DEVICE_ACCESS_PROTECTION_DURING_PROVISIONING.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device access-protection during Provisioning' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device access-protection during Provisioning'");
        }
    }

    public void howDeviceOwnershipIsDetermined(String option) {
        try {
            logger.info("Attempting to select option in 'How device ownership is determined'");
            selectOptionProfilesPackages(InstallationPackagesLocators.HOW_DEVICE_OWNERSHIP_IS_DETERMINED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'How device ownership is determined' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'How device ownership is determined'");
        }
    }

    public void isConnectionToSESRequiredToDefineDeviceOwnership(String option) {
        try {
            logger.info("Attempting to select option in 'Is connection to SES required to define Device Ownership?'");
            selectOptionProfilesPackages(InstallationPackagesLocators.IS_CONNECTION_TO_SES_REQUIRED_TO_DEFINE_DEVICE_OWNERSHIP.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Is connection to SES required to define Device Ownership?' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Is connection to SES required to define Device Ownership?'");
        }
    }

    public void defineWhichUserDeploysSecureDocOnDevice(String option) {
        try {
            logger.info("Attempting to select option in 'Define which user deploys SecureDoc on device'");
            selectOptionProfilesPackages(InstallationPackagesLocators.DEFINE_WHICH_USER_DEPLOYS_SECUREDOC_ON_DEVICE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Define which user deploys SecureDoc on device' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Define which user deploys SecureDoc on device'");
        }
    }

}
