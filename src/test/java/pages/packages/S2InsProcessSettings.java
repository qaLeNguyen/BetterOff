package pages.packages;

import common.BuiltInAction;
import object.packages_object.InstallationPackagesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S2InsProcessSettings extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S2InsProcessSettings.class);

    public S2InsProcessSettings() {
        super();
    }

    public void ifUnableToCommunicate(String option){
        try {
            logger.info("Attempting to select option in 'If unable to communicate'");
            selectOptionProfilesPackages(InstallationPackagesLocators.IF_UNABLE_TO_COMM.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If unable to communicate' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If unable to communicate'");
        }
    }

    public void encProcessMonitoring(String option) {
        try {
            logger.info("Attempting to select option in 'Encryption Progress-monitoring'");
            selectOptionProfilesPackages(InstallationPackagesLocators.ENC_PROCESS_MONITORING.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Encryption Progress-monitoring' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Encryption Progress-monitoring'");
        }
    }

    public void ifUsingFileDistribution(String option) {
        try {
            logger.info("Attempting to select option in 'If using File Distribution Software to deploy'");
            selectOptionProfilesPackages(InstallationPackagesLocators.IF_USING_FILE_DISTRIBUTION.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If using File Distribution Software to deploy' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If using File Distribution Software to deploy'");
        }
    }

    public void defineWhetherSDShouldRebootOnceEncIsCompleted(String option) {
        try {
            logger.info("Attempting to select option in 'Define whether the SecureDoc installer should re-boot device once initial encryption is complete'");
            selectOptionProfilesPackages(InstallationPackagesLocators.DEFINE_WHETHER_SD_SHOULD_REBOOT.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Define whether the SecureDoc installer should re-boot device once initial encryption is complete' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Define whether the SecureDoc installer should re-boot device once initial encryption is complete'");
        }
    }

    public void tryToRebootOncePreBootHasBeenInstall(String option) {
        try {
            logger.info("Attempting to select option in 'SecureDoc normally tries to re-boot device once Pre-Boot has been installed'");
            selectOptionProfilesPackages(InstallationPackagesLocators.SD_NORMALLY_TRY_TO_REBOOT_ONCE_PREBOOT_HAS_BEEN_INSTALLED.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SecureDoc normally tries to re-boot device once Pre-Boot has been installed' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SecureDoc normally tries to re-boot device once Pre-Boot has been installed'");
        }
    }

    public void userNotificationDuringInstallation(String option) {
        try {
            logger.info("Attempting to select option in 'User Notifications during Installation'");
            selectOptionProfilesPackages(InstallationPackagesLocators.USER_NOTIFICATION_DURING_INSTALLATION.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User Notifications during Installation' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User Notifications during Installation'");
        }
    }

    public void commToSDConnexDuringInstall(String option) {
        try {
            logger.info("Attempting to select option in 'Communication to SDConnex during Install'");
            selectOptionProfilesPackages(InstallationPackagesLocators.COMM_TO_SDCONNEX_DURING_INSTALL.getBy(),
                    InstallationPackagesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Communication to SDConnex during Install' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Communication to SDConnex during Install'");
        }
    }

}
