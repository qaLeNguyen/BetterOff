package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S3EncAdvanced extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S3EncAdvanced.class);

    public S3EncAdvanced() {
        super();
    }

    public void removableMediaEncryption(String option){
        try {
            logger.info("Attempting to select option in 'Removable Media Encryption'");
            scrollToView(ProfilesLocators.RMO.getBy());
            click(ProfilesLocators.RMO.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Removable Media Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Removable Media Encryption'");
        }
    }

    public void defineHowMediaCanBeAccessed(String option){
        try {
            logger.info("Attempting to select option in 'Define how Media can be accessed'");
            click(ProfilesLocators.DEFINE_HOW_MEDIA_CAN_BE_ACCESSED.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Define how Media can be accessed' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Define how Media can be accessed'");
        }
    }

    public void defaultMediaEncryptionSettings(String option){
        try {
            logger.info("Attempting to select option in 'Default Media encryption settings'");
            click(ProfilesLocators.DEFAULT_MEDIA_ENCRYPTION_SETTINGS.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Default Media encryption settings' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Default Media encryption settings'");
        }
    }

    public void deviceKeyForMediaEncryption(String option){
        try {
            logger.info("Attempting to select option in 'Device Key for Media Encryption'");
            click(ProfilesLocators.DEVICE_KEY_FOR_MEDIA_ENCRYPTION.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device Key for Media Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device Key for Media Encryption'");
        }
    }

    public void cdDvdContainerEncryption(String option){
        try {
            logger.info("Attempting to select option in 'CD/DVD Container Encryption'");
            click(ProfilesLocators.CD_DVD_CONTAINER_ENCRYPTION.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'CD/DVD Container Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'CD/DVD Container Encryption'");
        }
    }

    public void logging(String option){
        try {
            selectOptionProfilesPackages(ProfilesLocators.LOGGING.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Logging: {{}}", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring Logging: {{}}",option);
        }
    }

    public void fileAndFolderEncryption(String option){
        try {
            logger.info("Attempting to select option in 'File and Folder Encryption'");
            click(ProfilesLocators.FILE_AND_FOLDER_ENCRYPTION.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'File and Folder Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'File and Folder Encryption'");
        }
    }

    public void individualFileEncryption(String option){
        try {
            logger.info("Attempting to select option in 'Individual File Encryption'");
            click(ProfilesLocators.INDIVIDUAL_FILE_ENCRYPTION.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Individual File Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Individual File Encryption'");
        }
    }

    public void selfExtractorEncryption(String option){
        try {
            logger.info("Attempting to select option in 'Self-Extractor Encryption'");
            click(ProfilesLocators.SELF_EXTRACTOR_ENCRYPTION.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Self-Extractor Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Self-Extractor Encryption'");
        }
    }

    public void secureFileWipe(String option){
        try {
            logger.info("Attempting to select option in 'Secure File Wipe'");
            click(ProfilesLocators.SECURE_FILE_WIPE.getBy());
            click(ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Secure File Wipe' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Secure File Wipe'");
        }
    }

}
