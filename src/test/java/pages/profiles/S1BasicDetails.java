package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S1BasicDetails extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S1BasicDetails.class);

    public S1BasicDetails() {
        super();
    }

    public void profileName(String name) {
        try {
            if(!name.isEmpty() || !name.isBlank()) {
                input(ProfilesLocators.PROFILE_NAME.getBy(), name);
                logger.info("Profile Name: '{}'", name);
            }
        } catch (Exception e) {
            logger.error("Error occurred when inputting Profile Name: '{}' ", name);
        }
    }

    public void profileComments(String comments) {
        try {
            input(ProfilesLocators.PROFILE_COMMENTS.getBy(), comments);
            logger.info("Profile Comments: '{}'", comments);
        } catch (Exception e) {
            logger.error("Error occurred when inputting Profile Comments: '{}' ", comments);
        }
    }

    public void targetPlatform(String option) {
        try {
            selectOptionProfilesPackages(ProfilesLocators.TARGET_PLATFORM.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Target Platform: '{}'", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring Target Platform: '{}'",option);
        }
    }

    public void profileType(String option) {
        try {
            selectOptionProfilesPackages(ProfilesLocators.PROFILE_TYPE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Profile Type: '{}'", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring Profile Type: '{}'",option);
        }
    }

    public void clientUILanguage(String option) {
        try {
            selectOptionProfilesPackages(ProfilesLocators.CLIENT_USER_INTERFACE_LANGUAGE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Client User Interface Language: '{}'", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring Client User Interface Language: '{}'", option);
        }
    }

}
