package pages.packages;

import common.BuiltInAction;
import object.packages_object.InstallationPackagesLocators;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S1InsPackageBasic extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S1InsPackageBasic.class);

    public S1InsPackageBasic() {
        super();
    }

    public void targetPlatform(String option) {
        try {
            logger.info("Attempting to select option in 'Target Platform'");
            selectOptionProfilesPackages(InstallationPackagesLocators.TARGET_PLATFORM.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Target Platform' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Target Platform'");
        }
    }

    public void packageType(String option) {
        try {
            logger.info("Attempting to select option in 'Package Type'");
            selectOptionProfilesPackages(InstallationPackagesLocators.PACKAGES_TYPE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Package Type' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Package Type'");
        }
    }

    public void profileToBeDeployed(String name) {
        try {
            logger.info("Attempting to select option in 'Profile to be deployed'");
            scrollToView(InstallationPackagesLocators.PROFILE_TO_BE_DEPLOYED.getBy(name));
            selectOptionProfilesPackages(InstallationPackagesLocators.PROFILE_TO_BE_DEPLOYED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(name));
            logger.info("Selected '{}' in 'Profile to be deployed' successfully", name);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Profile to be deployed'");
        }
    }

    public void packageName(String name) {
        try {
            logger.info("Attempting to input in 'Package Name'");
            input(InstallationPackagesLocators.PACKAGE_NAME.getBy(), name);
            logger.info("Inputted '{}' in 'Package Name' successfully", name);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Package Name'");
        }
    }

    public void comments(String text) {
        try {
            logger.info("Attempting to input in in 'Comments'");
            input(InstallationPackagesLocators.PACKAGES_COMMENTS.getBy(), text);
            logger.info("Inputted '{}' in 'Comments' successfully", text);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Comments'");
        }
    }

}
