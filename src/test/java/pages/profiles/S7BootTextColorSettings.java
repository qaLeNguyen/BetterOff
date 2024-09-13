package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S7BootTextColorSettings extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S7BootTextColorSettings.class);

    public S7BootTextColorSettings() {
        super();
    }

    public void bootHeaderText(String text) {
        try {
            logger.info("Attempting to select option in 'Boot Header Text'");
            input(ProfilesLocators.BOOT_HEADER_TEXT.getBy(), text);
            logger.info("Selected '{}' in 'Boot Header Text' successfully", text);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Boot Header Text'");
        }
    }

    public void keyfilePrompt(String text) {
        try {
            logger.info("Attempting to select option in 'Key File Prompt'");
            input(ProfilesLocators.KEYFILE_PROMPT.getBy(), text);
            logger.info("Selected '{}' in 'Key File Prompt' successfully", text);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Prompt'");
        }
    }

    public void pwdPrompt(String text) {
        try {
            logger.info("Attempting to select option in 'Password Prompt'");
            input(ProfilesLocators.PWD_PROMPT.getBy(), text);
            logger.info("Selected '{}' in 'Password Prompt' successfully", text);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Password Prompt'");
        }
    }

    public void lockPrompt(String text) {
        try {
            logger.info("Attempting to select option in 'Lock Prompt'");
            input(ProfilesLocators.LOCK_PROMPT.getBy(), text);
            logger.info("Selected '{}' in 'Lock Prompt' successfully", text);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Lock Prompt'");
        }
    }

    public void challengeResponsePrompt(String text) {
        try {
            logger.info("Attempting to select option in 'Challenge Response Prompt'");
            input(ProfilesLocators.CHALLENGE_RESPONSE_PROMPT.getBy(), text);
            logger.info("Selected '{}' in 'Challenge Response Prompt' successfully", text);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Challenge Response Prompt'");
        }
    }

    public void backgroundTheme(String option) {
        try {
            logger.info("Attempting to select option in 'Background theme'");
            selectOptionProfilesPackages(ProfilesLocators.BACKGROUND_THEME.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Background theme' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Background theme'");
        }
    }

    public void textColor(String option) {
        try {
            logger.info("Attempting to select option in 'Text Color'");
            selectOptionProfilesPackages(ProfilesLocators.TEXT_COLOR.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Text Color' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Text Color'");
        }
    }

    public void whenToUpdateBackground(String option) {
        try {
            logger.info("Attempting to select option in 'When to update Background'");
            selectOptionProfilesPackages(ProfilesLocators.WHEN_TO_UPDATE_BACKGROUND.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'When to update Background' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'When to update Background'");
        }
    }




}
