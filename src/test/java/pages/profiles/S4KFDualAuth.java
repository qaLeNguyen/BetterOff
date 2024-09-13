package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S4KFDualAuth extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S4KFDualAuth.class);

    public S4KFDualAuth() {
        super();
    }

    public void passwordSynchronization(String option){
        try {
            logger.info("Attempting to select option in 'Password Synchronization'");
            selectOptionProfilesPackages(ProfilesLocators.PASSWORD_SYNC.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Password Synchronization' successfully", option);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Password Synchronization'");
        }
    }

    public void userIDInput(String option){
        try {
            logger.info("Attempting to select option in 'User ID Input (Key File name)'");
            selectOptionProfilesPackages(ProfilesLocators.USER_ID_INPUT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User ID Input (Key File name)' successfully", option);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User ID Input (Key File name)'");
        }
    }

    public void userIDRequired(String option){
        try {
            logger.info("Attempting to select option in 'User ID Required'");
            selectOptionProfilesPackages(ProfilesLocators.USER_ID_REQUIRED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User ID Required' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User ID Required'");
        }
    }

    public void OTPOption(String option){
        try {
            logger.info("Attempting to select option in 'One-Time Password (OTP)'");
            selectOptionProfilesPackages(ProfilesLocators.OTP_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'One-Time Password (OTP)' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring One-Time Password (OTP): '{}'",option);
        }
    }

    public void OOBOption(String option){
        try {
            logger.info("Attempting to select option in 'Passwordless Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.OOB_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Passwordless Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Passwordless Authentication'");
        }
    }

    public void protectingAutoBoot(String option){
        try {
            logger.info("Attempting to select option in 'Protecting Auto-Boot'");
            selectOptionProfilesPackages(ProfilesLocators.PROTECTING_AUTOBOOT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Protecting Auto-Boot' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Protecting Auto-Boot'");
        }
    }

    public void ifUsingTokenDefineWhereUserKeyFileIs(String option){
        try {
            logger.info("Attempting to select option in 'If using Tokens, define where User’s Key File is'");
            selectOptionProfilesPackages(ProfilesLocators.OOB_OPTION.getBy(), // Wrong XPATH
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If using Tokens, define where User’s Key File is' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If using Tokens, define where User’s Key File is'");
        }
    }

    public void KeyFileDualAuthentication(String option){
        try {
            logger.info("Attempting to select option in 'Key File Dual Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.KEYFILE_DUAL_AUTHENTICATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Key File Dual Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Dual Authentication'");
        }
    }

    public void TPMOption(String option){
        try {
            logger.info("Attempting to select option in 'TPM-Protection for Key Files'");
            selectOptionProfilesPackages(ProfilesLocators.TPM_PROTECTION_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'TPM-Protection for Key Files' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'TPM-Protection for Key Files'");
        }
    }

    public void BLEOption(String option){
        try {
            logger.info("Attempting to select option in 'Mobile Device-based Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.BLE_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Mobile Device-based Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Mobile Device-based Authentication'");
        }
    }

    public void convertToTokenProtectionFollowingInstallation(String option){
        try {
            logger.info("Attempting to select option in 'Convert to Token Protection following installation'");
            selectOptionProfilesPackages(ProfilesLocators.CONVERT_TO_TOKEN_PROTECTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Convert to Token Protection following installation' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Convert to Token Protection following installation'");
        }
    }

    public void howIsUserIDDerivedWhenSmartCardAreUsed(String option){
        try {
            logger.info("Attempting to select option in 'How is User ID derived when Smart Cards are used'");
            selectOptionProfilesPackages(ProfilesLocators.HOW_IS_USERID_DERIVED_WHEN_SMART_CARD_ARE_USED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'How is User ID derived when Smart Cards are used' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'How is User ID derived when Smart Cards are used'");
        }
    }

    public void mayUserCryptoEraseDevice(String option){
        try {
            logger.info("Attempting to select option in 'May user crypto-erase device at Pre-Boot?'");
            selectOptionProfilesPackages(ProfilesLocators.CRYPTO_ERASE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'May user crypto-erase device at Pre-Boot?' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'May user crypto-erase device at Pre-Boot?'");
        }
    }

    public void deviceBootSettings(String option){
        try {
            logger.info("Attempting to select option in 'Device Boot Settings'");
            selectOptionProfilesPackages(ProfilesLocators.DEVICE_BOOT_SETTINGS_IN_KF_DUAL_AUTH.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device Boot Settings' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device Boot Settings'");
        }
    }

    public void silentAutoBoot(String option){
        try {
            logger.info("Attempting to select option in 'Silent Auto-Boot'");
            selectOptionProfilesPackages(ProfilesLocators.SILENT_AUTOBOOT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Silent Auto-Boot' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Silent Auto-Boot'");
        }
    }

    public void defineWhatDeviceExpectsOfUserAtPreBoot(String option){
        try {
            logger.info("Attempting to select option in 'Define what device expects of user at Pre-Boot'");
            selectOptionProfilesPackages(ProfilesLocators.DEFINE_WHAT_DEVICE_EXPECTS_OF_USER_AT_PREBOOT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Define what device expects of user at Pre-Boot' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Define what device expects of user at Pre-Boot'");
        }
    }

    public void maximumFailedLoginsToleratedAtPreBoot(String option){
        try {
            logger.info("Attempting to select option in 'Maximum failed logins tolerated at Boot Logon'");
            input(ProfilesLocators.MAXIMUM_FAILED_LOGINS_TOLERATED_AT_BOOT_LOGON.getBy(), option);
            logger.info("Inputted '{}' in 'Maximum failed logins tolerated at Boot Logon' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Maximum failed logins tolerated at Boot Logon'");
        }
    }

    public void unattendedDevicesLeftAtPreBoot(String option){
        try {
            logger.info("Attempting to select option in 'Unattended devices left at Pre-Boot will auto power-down after (max 60) minutes'");
            input(ProfilesLocators.UNATTENDED_DEVICES_LEFT_AT_PREBOOT_WILL_AUTO_POWER_DOWN.getBy(), option);
            logger.info("Inputted '{}' in 'Unattended devices left at Pre-Boot will auto power-down after (max 60) minutes' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Unattended devices left at Pre-Boot will auto power-down after (max 60) minutes'");
        }
    }

    public void deviceToSDConnexCommunication(String option){
        try {
            logger.info("Attempting to select option in 'Device to SDConnex Communication'");
            selectOptionProfilesPackages(ProfilesLocators.DEVICE_TO_SDCONNEX.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device to SDConnex Communication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device to SDConnex Communication'");
        }
    }

    public void staticIPAtPreBoot(String option){
        try {
            logger.info("Attempting to select option in 'Static IP at Pre-Boot'");
            selectOptionProfilesPackages(ProfilesLocators.DEVICE_TO_SDCONNEX.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Static IP at Pre-Boot' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Static IP at Pre-Boot'");
        }
    }

    public void deviceWillAttemptToSDConnexAtPreBootBeforeUnreachable(String option){
        try {
            logger.info("Attempting to select option in 'Devices will attempt to connect to SDConnex for the maximum # seconds at right before assuming unreachable'");
            input(ProfilesLocators.DEVICE_WILL_ATTEMPT_TO_SDCONNEX_AT_PREBOOT_BEFORE_ASSUMING_UNREACHABLE.getBy(), option);
            logger.info("Inputted '{}' in 'Devices will attempt to connect to SDConnex for the maximum # seconds at right before assuming unreachable' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Devices will attempt to connect to SDConnex for the maximum # seconds at right before assuming unreachable'");
        }
    }

    public void magicEndpointAuth(String option){
        try {
            logger.info("Attempting to select option in 'MagicEndpoint Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.MAGICENDPOINT_AUTHENTICATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'MagicEndpoint Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'MagicEndpoint Authentication'");
        }
    }

    public void syncMECredentialKeyToSES(String option){
        try {
            logger.info("Attempting to select option in 'Synchronize MagicEndpoint Credential Key to SES'");
            selectOptionProfilesPackages(ProfilesLocators.SYNC_ME_CREDENTIAL_KEY_TO_SES.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Synchronize MagicEndpoint Credential Key to SES' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Synchronize MagicEndpoint Credential Key to SES'");
        }
    }

    public void faceIDBasedAuthentication(String option){
        try {
            logger.info("Attempting to select option in 'Face ID-based Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.FACE_ID_BASED_AUTH.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Face ID-based Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Face ID-based Authentication'");
        }
    }

    public void autoLoginME(String option){
        try {
            logger.info("Attempting to select option in 'Auto-login MagicEndpoint'");
            selectOptionProfilesPackages(ProfilesLocators.AUTO_LOGIN_ME.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Auto-login MagicEndpoint' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Auto-login MagicEndpoint'");
        }
    }

    public void MELogOut(String option){
        try {
            logger.info("Attempting to select option in 'MagicEndpoint auto-logout'");
            selectOptionProfilesPackages(ProfilesLocators.ME_AUTO_LOGOUT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'MagicEndpoint auto-logout' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'MagicEndpoint auto-logout'");
        }
    }

    public void MENotification(String option){
        try {
            logger.info("Attempting to select option in 'MagicEndpoint Notification'");
            selectOptionProfilesPackages(ProfilesLocators.ME_NOTIFICATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'MagicEndpoint Notification' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'MagicEndpoint Notification'");
        }
    }

    public void idpList(String port) {
        try {
            logger.info("Attempting to select option in 'IdP List (https://HOST:PORT (, https://HOST:PORT,...))'");
            input(ProfilesLocators.IDP_LIST_INPUT.getBy(), port);
            logger.info("Inputted '{}' in 'IdP List (https://HOST:PORT (, https://HOST:PORT,...))' successfully", port);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'IdP List'");
        }
    }

    public void idpCertificateValidation(String option){
        try {
            logger.info("Attempting to select option in 'IDP Certificate Validation'");
            selectOptionProfilesPackages(ProfilesLocators.IDP_CERTIFICATE_VALIDATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'IDP Certificate Validation' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'IDP Certificate Validation'");
        }
    }

    public void hostVerificationRule(String option){
        try {
            logger.info("Attempting to select option in 'Host Verification Rule'");
            selectOptionProfilesPackages(ProfilesLocators.HOST_VERIFICATION_RULE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Host Verification Rule' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Host Verification Rule'");
        }
    }

    public void twoFactorAuthentication(String option){
        try {
            logger.info("Attempting to select option in 'Two-Factor Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.TWO_FA_LOGIN_WINDOWS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Two-Factor Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Two-Factor Authentication'");
        }
    }

    public void twoFactorAuthenticationRDP(String option){
        try {
            logger.info("Attempting to select option in '2FA Remote Desktop Connections'");
            selectOptionProfilesPackages(ProfilesLocators.TWO_FA_RDP.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in '2FA Remote Desktop Connections' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring '2FA Remote Desktop Connections'");
        }
    }

    public void numberOfUserKeyFilesToBeStoredOnDevice(String number){
        try {
            logger.info("Attempting to input number in 'Number of User Key Files to be stored on Device (16-200)'");
            replaceTextInField(ProfilesLocators.NUMBER_OF_KEY_FILES_STORED_ON_DEVICE.getBy(), number);
            logger.info("Inputted '{}' in 'Number of User Key Files to be stored on Device (16-200)' successfully", number);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Number of User Key Files to be stored on Device (16-200)'");
        }
    }

    public void localUsersDetectedOnDevice(String option){
        try {
            logger.info("Attempting to select option in 'Local Users detected on device'");
            selectOptionProfilesPackages(ProfilesLocators.LOCAL_USERS_DETECTED_ON_DEVICE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Local Users detected on device' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Local Users detected on device'");
        }
    }

    public void adUsersDetectedOnDevice(String option){
        try {
            logger.info("Attempting to select option in 'AD Users detected on Device'");
            selectOptionProfilesPackages(ProfilesLocators.AD_USERS_DETECTED_ON_DEVICE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'AD Users detected on Device' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'AD Users detected on Device'");
        }
    }

    public void windowsUsersDetectedOnDevice(String option){
        try {
            logger.info("Attempting to select option in 'Windows users detected on Device'");
            selectOptionProfilesPackages(ProfilesLocators.WINDOWS_USERS_DETECTED_ON_DEVICE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Windows users detected on Device' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Windows users detected on Device'");
        }
    }

    public void adUserAccounts(String option){
        try {
            logger.info("Attempting to select option in 'AD User Accounts'");
            selectOptionProfilesPackages(ProfilesLocators.AD_USER_ACCOUNTS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'AD User Accounts' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'AD User Accounts'");
        }
    }

    public void excludeAccountsFromHavingKeyFileOnDevice(String name){
        try {
            logger.info("Attempting to select option in 'Exclude the following accounts: from having any Key Files stored on-device'");
            input(ProfilesLocators.EXCLUDE_ACCOUNT_FROM_HAVING_ANY_KEYFILE_FROM_DEVICE.getBy(), name);
            logger.info("Selected '{}' in 'Exclude the following accounts: from having any Key Files stored on-device' successfully", name);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Exclude the following accounts: from having any Key Files stored on-device'");
        }
    }

    public void userPwdResponse(String option){
        try {
            logger.info("Attempting to select option in 'User Password/Responses'");
            selectOptionProfilesPackages(ProfilesLocators.USER_PWD_RESPONSE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User Password/Responses' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User Password/Responses'");
        }
    }

    public void browsersAccessFromPreBootAuth(String option){
        try {
            logger.info("Attempting to select option in 'Browser access from Pre-Boot Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.BROWSER_ACCESS_FROM_PREBOOT_AUTH.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Browser access from Pre-Boot Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Browser access from Pre-Boot Authentication'");
        }
    }

    public void pbConnexAutoBootAuth(String option){
        try {
            logger.info("Attempting to select option in 'PBConnex Autoboot Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.PBCONNEX_AUTOBOOT_AUTH.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'PBConnex Autoboot Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'PBConnex Autoboot Authentication'");
        }
    }

    public void deviceDetectOnNetworkAtPreBoot(String option){
        try {
            logger.info("Attempting to select option in 'Device detectable on Network when at Pre-Boot'");
            selectOptionProfilesPackages(ProfilesLocators.DEVICE_DETECTABLE_NETWORK_AT_PREBOOT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device detectable on Network when at Pre-Boot' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device detectable on Network when at Pre-Boot'");
        }
    }

    public void resumptionFromSleep(String option){
        try {
            logger.info("Attempting to select option in 'Resumption from Sleep'");
            selectOptionProfilesPackages(ProfilesLocators.RESUMPTION_FROM_SLEEP.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Resumption from Sleep' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Resumption from Sleep'");
        }
    }

    public void signOnDLLIntegration(String option){
        try {
            logger.info("Attempting to select option in 'Sign-on DLL integration'");
            selectOptionProfilesPackages(ProfilesLocators.SIGN_ON_DLL_INTEGRATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Sign-on DLL integration' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Sign-on DLL integration'");
        }
    }

    public void phoneProtectedKeyFile(String option){
        try {
            logger.info("Attempting to select option in 'Phone-protected Key Files'");
            selectOptionProfilesPackages(ProfilesLocators.PHONE_PROTECTED_KEY_FILE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Phone-protected Key Files' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Phone-protected Key Files'");
        }
    }

    public void secureDocRDPAuth(String option){
        try {
            logger.info("Attempting to select option in 'SecureDoc Remote Desktop Protocol Authentication'");
            selectOptionProfilesPackages(ProfilesLocators.SECUREDOC_RDP_AUTH.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SecureDoc Remote Desktop Protocol Authentication' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SecureDoc Remote Desktop Protocol Authentication'");
        }
    }

    public void remoteDeviceAuthenticationAssistance(String option){
        try {
            logger.info("Attempting to select option in 'Remote Device Authentication assistance'");
            selectOptionProfilesPackages(ProfilesLocators.REMOTE_DEVICE_AUTH.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Remote Device Authentication assistance' successfully", option);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Remote Device Authentication assistance'");
        }
    }

    public void autoFillWindowsPwd(String option){
        try {
            logger.info("Attempting to select option in 'Auto-Fill Windows Password'");
            selectOptionProfilesPackages(ProfilesLocators.AUTO_FILL_WINDOWS_PWD.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Auto-Fill Windows Password' successfully", option);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Auto-Fill Windows Password'");
        }
    }

    public void rotateWindowsPwd(String option){
        try {
            logger.info("Attempting to select option in 'Rotate Windows Password'");
            selectOptionProfilesPackages(ProfilesLocators.ROTATE_WINDOWS_PWD.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Rotate Windows Password' successfully", option);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Rotate Windows Password'");
        }
    }

    public void autoFillRotateWindowsPwd(String option){
        try {
            logger.info("Attempting to select option in 'Auto-Fill Rotate Windows Password'");
            selectOptionProfilesPackages(ProfilesLocators.AUTO_FILL_ROTATE_WINDOWS_PWD.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Auto-Fill Rotate Windows Password' successfully", option);

        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Auto-Fill Rotate Windows Password'");
        }
    }

}
