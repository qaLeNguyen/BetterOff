package pages.profiles;

import common.BuiltInAction;
import object.common_object.CommonLocators;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProfilesPage extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(ProfilesPage.class);
    private S1BasicDetails s1BasicDetails;
    private S2EncDisk s2EncDisk;
    private S3EncAdvanced s3EncAdvanced;
    private S4KFDualAuth s4KFDualAuth;
    private S5ClientAgentSettings s5ClientAgentSettings;
    private S6DeviceBootSettings s6DeviceBootSettings;
    private S7BootTextColorSettings s7BootTextColorSettings;
    private S8DiskAccessControl s8DiskAccessControl;

    public boolean doesProfilePageDisplayed(){
        return true;
    }

    public ProfilesPage(S1BasicDetails s1BasicDetails,
                        S2EncDisk s2EncDisk,
                        S3EncAdvanced s3EncAdvanced,
                        S4KFDualAuth s4KFDualAuth,
                        S5ClientAgentSettings s5ClientAgentSettings,
                        S6DeviceBootSettings s6DeviceBootSettings,
                        S7BootTextColorSettings s7BootTextColorSettings,
                        S8DiskAccessControl s8DiskAccessControl) {
        super();
        this.s1BasicDetails = s1BasicDetails;
        this.s2EncDisk = s2EncDisk;
        this.s3EncAdvanced = s3EncAdvanced;
        this.s4KFDualAuth = s4KFDualAuth;
        this.s5ClientAgentSettings = s5ClientAgentSettings;
        this.s6DeviceBootSettings = s6DeviceBootSettings;
        this.s7BootTextColorSettings = s7BootTextColorSettings;
        this.s8DiskAccessControl = s8DiskAccessControl;
    }

    public void clickButtonSubmit() {
        try {
            scrollToView(ProfilesLocators.BUTTON_SUBMIT.getBy());
            click(ProfilesLocators.BUTTON_SUBMIT.getBy());
            logger.info("Clicked 'Submit' button successfully");

        } catch (Exception e) {
            logger.error("Error occurred when clicking 'Submit' button");
        }
    }

    public void clickButtonOK() {
        try {
            click(ProfilesLocators.BUTTON_OK.getBy());
            logger.info("Clicked button 'OK' to confirm create profile");

        } catch (Exception e) {
            logger.error("Error occurred when clicking 'OK' button");
        }
    }

    public void clickButtonYes() {
        try {
            click(ProfilesLocators.BUTTON_YES.getBy());
            logger.info("Clicked button 'Yes' to confirm create profile");

        } catch (Exception e) {
            logger.error("Error occurred when clicking 'Yes' button");
        }
    }

    public void checkProfileExisted(String name) {
        try {
            input(CommonLocators.SEARCH_FIELD.getBy(), name);
            isElementPresent(ProfilesLocators.SEARCHED_PROFILE_NAME.getBy(name));
            logger.info("Profile {} is existed", name);

        } catch (Exception e) {
            logger.error("Error occurred when checking if Profile is existed");
        }
    }

    public void confirmCreateProfile() {
        clickButtonSubmit();

        getElementVisible(ProfilesLocators.CONFIRM_DIALOG_CREATE_SUCCESSFULLY.getBy());

        boolean isSuccessDialog = isElementPresent(ProfilesLocators.CONFIRM_DIALOG_CREATE_SUCCESSFULLY.getBy());
        try {
            if (isSuccessDialog) {
                clickButtonOK();
                logger.info("Confirm dialog of 'Successfully profile' is displayed, clicked 'OK'");

            } else {
                logger.error("Failed to create Profile");
            }
        } catch (Exception e) {
            logger.info("Error occurred when confirm to create Profile");
        }
    }

    public void confirmCreateBLE() {
        clickButtonSubmit();
        getElementVisible(ProfilesLocators.CONFIRM_DIALOG_CREATE_BLE_SUCCESSFULLY.getBy());
        boolean isSuccessDialog = isElementPresent(ProfilesLocators.CONFIRM_DIALOG_CREATE_BLE_SUCCESSFULLY.getBy());
        try {
            if (isSuccessDialog) {
                clickButtonYes();
                getElementVisible(ProfilesLocators.CONFIRM_DIALOG_CREATE_SUCCESSFULLY.getBy());
                clickButtonOK();
                logger.info("Confirm dialog of 'Successfully profile with BLE' is displayed, clicked 'OK'");
            } else {
                logger.error("Failed to create Profile with BLE");
            }
        } catch (Exception e) {
            logger.info("Error occurred when confirm to create Profile");
        }
    }

    public void navigateToS1() {
        try {
            click(ProfilesLocators.BASIC_DETAILS_STEP.getBy());
            scrollToView(ProfilesLocators.WIZARD_STEP_1.getBy());
            isElementNotPresent(ProfilesLocators.WIZARD_STEP_1.getBy());
            logger.info("Navigated to Basic Details");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to Basic Details");
        }
    }

    public void navigateToS2() {
        try {
            click(ProfilesLocators.ENCRYPTION_DISK_STEP.getBy());
            scrollToView(ProfilesLocators.WIZARD_STEP_2.getBy());
            isElementNotPresent(ProfilesLocators.WIZARD_STEP_2.getBy());
            logger.info("Navigated to Encryption Disk");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to Encryption Disk");
        }
    }

    public void navigateToS3() {
        try {
            click(ProfilesLocators.ENCRYPTION_ADVANCED_DISK.getBy());
            scrollToView(ProfilesLocators.WIZARD_STEP_3.getBy());
            isElementNotPresent(ProfilesLocators.WIZARD_STEP_3.getBy());
            logger.info("Navigated to Encryption Advanced");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to Encryption Advanced");
        }
    }

    public void navigateToS4() {
        try {
            click(ProfilesLocators.KEY_FILE_DUAL_AUTH.getBy());
            scrollToView(ProfilesLocators.WIZARD_STEP_4.getBy());
            isElementNotPresent(ProfilesLocators.WIZARD_STEP_4.getBy());
            logger.info("Navigated to Key File Dual Authentication");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to Key File Dual Authentication");
        }
    }

    public void navigateToS5() {
        try {
            click(ProfilesLocators.CLIENT_AGENT_SETTINGS.getBy());
            scrollToView(ProfilesLocators.WIZARD_STEP_5.getBy());
            isElementNotPresent(ProfilesLocators.WIZARD_STEP_5.getBy());
            logger.info("Navigated to Client Agent Settings");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to Client Agent Settings");
        }
    }

    public void navigateToS6() {
        try {
            click(ProfilesLocators.DEVICE_BOOT_SETTINGS.getBy());

            scrollToView(ProfilesLocators.WIZARD_STEP_6.getBy());

            isElementNotPresent(ProfilesLocators.WIZARD_STEP_6.getBy());
            logger.info("Navigated to Device Boot Settings");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to Device Boot Settings");
        }
    }

    public void navigateToS7() {
        try {
            click(ProfilesLocators.BOOT_TEXT_COLOR_SETTINGS.getBy());

            scrollToView(ProfilesLocators.WIZARD_STEP_7.getBy());

            isElementNotPresent(ProfilesLocators.WIZARD_STEP_7.getBy());
            logger.info("Navigated to Boot Text and Color Settings");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to Boot Text and Color Settings");
        }
    }

    public void navigateToS8() {
        try {
            click(ProfilesLocators.DISK_ACCESS_CONTROL.getBy());

            scrollToView(ProfilesLocators.WIZARD_STEP_8.getBy());

            isElementNotPresent(ProfilesLocators.WIZARD_STEP_8.getBy());
            logger.info("Navigated to Disk Access Control");

        } catch (Exception e) {
            logger.error("Error occurred when navigating to Disk Access Control");
        }
    }

    public void configS1(String name,
                         String comments,
                         String targetPlatFormOption,
                         String profileTypeOption,
                         String clientUILanguageOption) {
        try {
            s1BasicDetails.profileName(name);
            s1BasicDetails.profileComments(comments);
            s1BasicDetails.targetPlatform(targetPlatFormOption);
            s1BasicDetails.profileType(profileTypeOption);
            s1BasicDetails.clientUILanguage(clientUILanguageOption);
            logger.info("Configured 'Basic Details' successfully with options: " + "\n" +
                    "Profile Name: " + name + "\n" +
                    "Comments: " + comments + "\n" +
                    "Target Platform: " + targetPlatFormOption + "\n" +
                    "Profile Type: " + profileTypeOption + "\n" +
                    "Client User Interface Language: " + clientUILanguageOption);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Basic Details'");
        }
    }

    public void configS2(String diskEncAgOption,
                         String ifSelfEncDriveDetectedOption,
                         String whatToEncOption,
                         String initialDiskConversionOption) {
        try {
            s2EncDisk.diskEncryptionAgent(diskEncAgOption);
            s2EncDisk.ifSelfEncDriveDetected(ifSelfEncDriveDetectedOption);
            s2EncDisk.whatToEncrypt(whatToEncOption);
            s2EncDisk.initialDiskConversion(initialDiskConversionOption);
            logger.info(
                    "Configured 'Encryption Disk' successfully with some options: " + "\n" +
                    "Disk Encryption Agent: " + diskEncAgOption + "\n" +
                    "If Self-Encrypting Drive detected: " + ifSelfEncDriveDetectedOption + "\n" +
                    "What to encrypt: " + whatToEncOption + "\n" +
                    "Initial Disk Conversion: " + initialDiskConversionOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Encryption Disk'");
        }
    }

    public void configS3(String loggingOption) {
        try {
            s3EncAdvanced.logging(loggingOption);
            logger.info("Configured 'Encryption Advanced' successfully with option: " + "\n" + loggingOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Encryption Advanced'");
        }
    }

    public void configS4(String deviceToSDConnexOption,
                         String enableMEAuthOption,
                         String idpListOption) {
        try {
            s4KFDualAuth.deviceToSDConnexCommunication(deviceToSDConnexOption);
            s4KFDualAuth.magicEndpointAuth(enableMEAuthOption);
            s4KFDualAuth.idpList(idpListOption);
            logger.info("Configured 'Key File Dual Authentication' successfully with options: " + "\n" +
                    "Device to SDConnex Communication: " + deviceToSDConnexOption + "\n" +
                    "MagicEndpoint Authentication: " + enableMEAuthOption + "\n" +
                    "IdP List: " + idpListOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Dual Authentication'");
        }
    }

    public void configS4BLE(
            String bleOption,
            String deviceToSDConnexOption,
            String enableMEAuthOption,
            String idpListOption) {
        try {
            s4KFDualAuth.BLEOption(bleOption);
            s4KFDualAuth.deviceToSDConnexCommunication(deviceToSDConnexOption);
            s4KFDualAuth.magicEndpointAuth(enableMEAuthOption);
            s4KFDualAuth.idpList(idpListOption);
            logger.info("Configured 'Key File Dual Authentication' successfully with options: " + "\n" +
                    "Mobile Device-based Authentication: " + "\n" +
                    "Device to SDConnex Communication: " + deviceToSDConnexOption + "\n" +
                    "MagicEndpoint Authentication: " + enableMEAuthOption + "\n" +
                    "IdP List: " + idpListOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Dual Authentication' with BLE");
        }
    }

    public void configS4OOB(
            String oobOption,
            String deviceToSDConnexOption,
            String enableMEAuthOption,
            String idpListOption) {
        try {
            s4KFDualAuth.OOBOption(oobOption);
            s4KFDualAuth.deviceToSDConnexCommunication(deviceToSDConnexOption);
            s4KFDualAuth.magicEndpointAuth(enableMEAuthOption);
            s4KFDualAuth.idpList(idpListOption);
            logger.info("Configured 'Key File Dual Authentication' successfully with options: " + "\n" +
                    "Passwordless Authentication: " + "\n" +
                    "Device to SDConnex Communication: " + deviceToSDConnexOption + "\n" +
                    "MagicEndpoint Authentication: " + enableMEAuthOption + "\n" +
                    "IdP List: " + idpListOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Dual Authentication' with OOB");
        }
    }

    public void configS4TPMPIN(String tpmPinOption, String deviceToSDConnexOption,
                               String enableMEAuthOption,
                               String idpListOption) {
        try {
            s4KFDualAuth.TPMOption(tpmPinOption);
            s4KFDualAuth.deviceToSDConnexCommunication(deviceToSDConnexOption);
            s4KFDualAuth.magicEndpointAuth(enableMEAuthOption);
            s4KFDualAuth.idpList(idpListOption);
            logger.info("Configured 'Key File Dual Authentication' successfully with options: " + "\n" +
                    "TPM-Protection for Key Files: " + "\n" +
                    "Device to SDConnex Communication: " + deviceToSDConnexOption + "\n" +
                    "MagicEndpoint Authentication: " + enableMEAuthOption + "\n" +
                    "IdP List: " + idpListOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Dual Authentication' with TPM PIN");
        }
    }

    public void configs5(String commWithServerOption,
                         String addSDConnexOption,
                         String SSOOption,
                         String SDCPOption) {
        try {
            s5ClientAgentSettings.communicateWithServer(commWithServerOption);
            s5ClientAgentSettings.sdConnexServer(addSDConnexOption);
            s5ClientAgentSettings.SSOOption(SSOOption);
            s5ClientAgentSettings.SDCPOption(SDCPOption);
            logger.info("Configured 'Client Agent Settings' successfully with options: " + "\n" +
                    "Communicate with Server every (minutes): " + commWithServerOption + "\n" +
                    "SDConnex Servers in IPV4, IPV6 or DNS-Name Format: " + addSDConnexOption + "\n" +
                    "Automated Windows logon: " + SSOOption + "\n" +
                    "Windows Login: " + SDCPOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Client Agent Settings'");
        }
    }

    public void configS6(String uefiBootLoaderOption) {
        try {
            s6DeviceBootSettings.UEFIBootLoader(uefiBootLoaderOption);
            logger.info("Configured 'Device Boot Settings' successfully with option: " + "\n" + uefiBootLoaderOption);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device Boot Settings'");
        }
    }

    public void profilePassword(String name,
                                String comments,
                                String targetPlatFormOption,
                                String profileTypeOption,
                                String clientUILanguageOption,

                                String diskEncAgOption,
                                String ifSelfEncDriveDetectedOption,
                                String whatToEncOption,
                                String initialDiskConversionOption,

                                String loggingOption,

                                String deviceToSDConnexOption,
                                String enableMEAuthOption,
                                String idpListOption,

                                String commWithServerOption,
                                String addSDConnexOption,
                                String SSOOption,
                                String SDCPOption,

                                String uefiBootLoaderOption
    ) {
        try {
            configS1(name+"",
                    comments,
                    targetPlatFormOption,
                    profileTypeOption,
                    clientUILanguageOption);

            navigateToS2();

            configS2(diskEncAgOption,
                    ifSelfEncDriveDetectedOption,
                    whatToEncOption,
                    initialDiskConversionOption);

            navigateToS3();

            configS3(loggingOption);

            navigateToS4();

            configS4(deviceToSDConnexOption,
                    enableMEAuthOption,
                    idpListOption);

            navigateToS5();

            configs5(commWithServerOption,
                    addSDConnexOption,
                    SSOOption,
                    SDCPOption);

            navigateToS6();

            configS6(uefiBootLoaderOption);

            confirmCreateProfile();

            checkProfileExisted(name);
            logger.info("Create Profile {} successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when creating new profile");
        }
    }

    public void profileBLE(String name,
                           String comments,
                           String targetPlatFormOption,
                           String profileTypeOption,
                           String clientUILanguageOption,

                           String diskEncAgOption,
                           String ifSelfEncDriveDetectedOption,
                           String whatToEncOption,
                           String initialDiskConversionOption,

                           String loggingOption,

                           String bleOption,
                           String deviceToSDConnexOption,
                           String enableMEAuthOption,
                           String idpListOption,

                           String commWithServerOption,
                           String addSDConnexOption,
                           String SSOOption,
                           String SDCPOption,

                           String uefiBootLoaderOption
    ) {
        try {
            configS1(name,
                    comments,
                    targetPlatFormOption,
                    profileTypeOption,
                    clientUILanguageOption);

            navigateToS2();

            configS2(diskEncAgOption,
                    ifSelfEncDriveDetectedOption,
                    whatToEncOption,
                    initialDiskConversionOption);

            navigateToS3();

            configS3(loggingOption);

            navigateToS4();

            configS4BLE(bleOption,
                    deviceToSDConnexOption,
                    enableMEAuthOption,
                    idpListOption);

            navigateToS5();

            configs5(commWithServerOption,
                    addSDConnexOption,
                    SSOOption,
                    SDCPOption);

            navigateToS6();

            configS6(uefiBootLoaderOption);

            confirmCreateBLE();

            checkProfileExisted(name);
            logger.info("Create Profile {} with BLE successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when creating new profile with BLE");
        }
    }

    public void profileOOB(String name,
                           String comments,
                           String targetPlatFormOption,
                           String profileTypeOption,
                           String clientUILanguageOption,

                           String diskEncAgOption,
                           String ifSelfEncDriveDetectedOption,
                           String whatToEncOption,
                           String initialDiskConversionOption,

                           String loggingOption,

                           String oobOption,
                           String deviceToSDConnexOption,
                           String enableMEAuthOption,
                           String idpListOption,

                           String commWithServerOption,
                           String addSDConnexOption,
                           String SSOOption,
                           String SDCPOption,

                           String uefiBootLoaderOption
    ) {
        try {
            configS1(name,
                    comments,
                    targetPlatFormOption,
                    profileTypeOption,
                    clientUILanguageOption);

            navigateToS2();

            configS2(diskEncAgOption,
                    ifSelfEncDriveDetectedOption,
                    whatToEncOption,
                    initialDiskConversionOption);

            navigateToS3();

            configS3(loggingOption);

            navigateToS4();

            configS4OOB(
                    oobOption,
                    deviceToSDConnexOption,
                    enableMEAuthOption,
                    idpListOption);

            navigateToS5();

            configs5(
                    commWithServerOption,
                    addSDConnexOption,
                    SSOOption,
                    SDCPOption);

            navigateToS6();

            configS6(uefiBootLoaderOption);

            confirmCreateProfile();

            checkProfileExisted(name);
            logger.info("Create Profile {} with OOB successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when creating new profile with OOB");
        }
    }

    public void profileTPMPIN(String name,
                              String comments,
                              String targetPlatFormOption,
                              String profileTypeOption,
                              String clientUILanguageOption,

                              String diskEncAgOption,
                              String ifSelfEncDriveDetectedOption,
                              String whatToEncOption,
                              String initialDiskConversionOption,

                              String loggingOption,

                              String tpmPinOption,
                              String deviceToSDConnexOption,
                              String enableMEAuthOption,
                              String idpListOption,

                              String commWithServerOption,
                              String addSDConnexOption,
                              String SSOOption,
                              String SDCPOption,

                              String uefiBootLoaderOption
    ) {
        try {
            configS1(
                    name,
                    comments,
                    targetPlatFormOption,
                    profileTypeOption,
                    clientUILanguageOption);

            navigateToS2();

            configS2(
                    diskEncAgOption,
                    ifSelfEncDriveDetectedOption,
                    whatToEncOption,
                    initialDiskConversionOption);

            navigateToS3();

            configS3(loggingOption);

            navigateToS4();

            configS4TPMPIN(
                    tpmPinOption,
                    deviceToSDConnexOption,
                    enableMEAuthOption,
                    idpListOption);

            navigateToS5();

            configs5(
                    commWithServerOption,
                    addSDConnexOption,
                    SSOOption,
                    SDCPOption);

            navigateToS6();

            configS6(uefiBootLoaderOption);

            confirmCreateProfile();

            checkProfileExisted(name);
            logger.info("Create Profile {} with TPM PIN successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when creating new profile with TPM PIN");
        }
    }

    public void profileHWE(String name,
                           String comments,
                           String targetPlatFormOption,
                           String profileTypeOption,
                           String clientUILanguageOption,

                           String diskEncAgOption,
                           String ifSelfEncDriveDetectedOption,
                           String whatToEncOption,
                           String initialDiskConversionOption,

                           String loggingOption,

                           String deviceToSDConnexOption,
                           String enableMEAuthOption,
                           String idpListOption,

                           String commWithServerOption,
                           String addSDConnexOption,
                           String SSOOption,
                           String SDCPOption,

                           String uefiBootLoaderOption
    ) {
        try {
            configS1(
                    name,
                    comments,
                    targetPlatFormOption,
                    profileTypeOption,
                    clientUILanguageOption);

            navigateToS2();

            configS2(
                    diskEncAgOption,
                    ifSelfEncDriveDetectedOption,
                    whatToEncOption,
                    initialDiskConversionOption);

            navigateToS3();

            configS3(loggingOption);

            navigateToS4();

            configS4(
                    deviceToSDConnexOption,
                    enableMEAuthOption,
                    idpListOption);

            navigateToS5();

            configs5(commWithServerOption,
                    addSDConnexOption,
                    SSOOption,
                    SDCPOption);

            navigateToS6();

            configS6(uefiBootLoaderOption);

            confirmCreateProfile();

            checkProfileExisted(name);
            logger.info("Create ProfileHWE {} successfully", name);

        } catch (Exception e) {
            logger.error("Error occurred when creating new profile HWE");
        }
    }


}
