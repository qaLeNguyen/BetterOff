package object.profiles_object;

import object.z_type.LocatorsType;
import org.openqa.selenium.By;

public enum ProfilesLocators {

    DROPDOWN_OPTION(LocatorsType.XPATH, "//div[@class='k-animation-container']//li[text()='{{text}}']"),

    /**
     * Buttons
     */
    BUTTON_SUBMIT(LocatorsType.ID,"submit"),
    BUTTON_OK(LocatorsType.CSS,".btn-default"),
    BUTTON_YES(LocatorsType.XPATH,"//button[.='Yes']"),

    /**
     * Profile page
     */
    DROPDOWN_PROFILE(LocatorsType.ID, "Actions_Type_Profile_Basic"),
    DROPDOWN_ADVANCED_PROFILE(LocatorsType.ID, "Actions_Type_Profile_Advanced"),
    EXPORT_PROFILE_BUTTON(LocatorsType.ID, "Actions_Profile_ExportProfile"),
    ITEM_ADD_PROFILE(LocatorsType.ID, "Actions_Profile_AddProfiles"),
    ITEM_DELETE_PROFILE(LocatorsType.ID, "Actions_Profile_DeleteProfile"),
    ITEM_COPY_PROFILE(LocatorsType.ID, "Actions_Profile_CopyProfile"),
    ITEM_MODIFY_PROFILE(LocatorsType.ID, "Actions_Type_Profile_Basic"),
    LABEL_COPY_PROFILE(LocatorsType.XPATH, "//label[.='Copy Profile']"),
    LABEL_ADD_PROFILE(LocatorsType.XPATH, "//label[.='Add Profile']"),
    IMPORT_PROFILE_BUTTON(LocatorsType.ID, "Actions_Profile_ImportProfile"),
    PROFILE_NAME_LINK(LocatorsType.XPATH, "//td[@class='gridTableData' and @role='gridcell']/a[contains(@href, '/Profile/ModifyProfile') and contains(text(), '{text}')]"),
    SEARCHED_PROFILE_NAME(LocatorsType.XPATH, "//a[.='{{text}}']"),

    /**
     * Confirmation Dialog
     */
    CONFIRM_DIALOG_DELETE_PROFILE(LocatorsType.ID, "//div[@class='jconfirm-content']/div[.='Delete the selected profile(s)?']"),
    CONFIRM_DIALOG_CREATE_SUCCESSFULLY(LocatorsType.XPATH, "//div[@class='jconfirm-content']/div[.='Profile was created successfully']"),
    CONFIRM_DIALOG_CREATE_BLE_SUCCESSFULLY(LocatorsType.XPATH, "//div[@class='jconfirm-content']/div[contains(.,'Switching to Phone Token (Bluetooth) will also allow users to authenticate with')]"),
    CONFIRM_DIALOG_PROFILE_ALREADY_EXISTS(LocatorsType.XPATH, "//div[@class='jconfirm-content']/div[.='Profile with the same name already exists']"),
    CONFIRM_DIALOG_PROFILE_MISSING_VALUE(LocatorsType.XPATH, "//div[@class='ui-dialog-content ui-widget-content']/div[.='Some required fields are either missing values or are incorrect']"),

    /**
     * Wizard Steps display in the top right corner.
     */
    WIZARD_STEP_1(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'1')]"),
    WIZARD_STEP_2(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'2')]"),
    WIZARD_STEP_3(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'3')]"),
    WIZARD_STEP_4(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'4')]"),
    WIZARD_STEP_5(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'5')]"),
    WIZARD_STEP_6(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'6')]"),
    WIZARD_STEP_7(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'7')]"),
    WIZARD_STEP_8(LocatorsType.XPATH, "//div[@id='formArea']//span[@class='formSteps']/span[contains(.,'8')]"),

    /**
     * Sidebar Steps, use it to navigate through the profile pages
     */
    BASIC_DETAILS_STEP(LocatorsType.CSS, "[targetform='General']"),
    BOOT_TEXT_COLOR_SETTINGS(LocatorsType.CSS, "[targetform='BootTextColorSettings']"),
    CLIENT_AGENT_SETTINGS(LocatorsType.CSS, "[targetform='ClientAgentSettings']"),
    DEVICE_BOOT_SETTINGS(LocatorsType.CSS, "[targetform='Boot']"),
    DISK_ACCESS_CONTROL(LocatorsType.CSS, "[targetform='DiskAccessControl']"),
    ENCRYPTION_DISK_STEP(LocatorsType.CSS, "[targetform='Encryption']"),
    ENCRYPTION_ADVANCED_DISK(LocatorsType.CSS, "[targetform='EncryptionAdvanced']"),
    KEY_FILE_DUAL_AUTH(LocatorsType.CSS, "[guid='AuthenticationRecovery']"),

    /**
     * Basic Details page
     */
    CLIENT_USER_INTERFACE_LANGUAGE(LocatorsType.XPATH, "//div[@name='formRowLanguage']//span[@class='k-input']"),
    PROFILE_NAME(LocatorsType.XPATH, "//div[@name='formRowProfileName']//input[@name='ProfileName']"),
    PROFILE_COMMENTS(LocatorsType.XPATH, "//div[@name='formRowComments']//input[@name='Comments']"),
    PROFILE_TYPE(LocatorsType.XPATH, "//div[@name='formRowDeviceType']//span[@class='k-input']"),
    TARGET_PLATFORM(LocatorsType.XPATH, "//div[@name='formRowTargetPlatform']//span[@class='k-input']"),

    /**
     * Encryption Disk
     */
    AFTER_INSTALLING_BOOT_LOGON(LocatorsType.XPATH, "//div[@name='formRowNoRebootOnBL']//span[@class='k-input']"),
    BLOCK_SID_OPTION(LocatorsType.XPATH, "//div[@name='formRowCompCoSID']//span[@class='k-input']"),
    BITLOCKER_CIPHER_TYPE(LocatorsType.XPATH,"//div[@name='formRowBitLockerConfigEnt']//span[@class='k-input']"),
    DISK_ENCRYPTION_AGENT(LocatorsType.XPATH, "//div[@name='formRowEncryptionAgent']//span[@class='k-input']"),
    DRIVE_TO_ENC(LocatorsType.XPATH,"//div[@name='formRowDrivesToEncryptEnt']//span[@class='k-input']"),
    DISK_DATA_RECOVERY_INFO(LocatorsType.XPATH, "//div[@name='formRowConversionNoRecovery']//span[@class='k-input']"),
    ENFORCE_BITLOCKER_CIPHER_TYPE(LocatorsType.XPATH, "//div[@name='formRowDummyEncType']//span[@class='k-input']"),
    ENFORCE_DRIVE_ENC_TYPE(LocatorsType.XPATH,"//div[@name='formRowEnforceDriveEncryptionEnt']//span[@class='k-input']"),
    ENCRYPTION_TYPE(LocatorsType.XPATH, "//div[@name='formRowEncryptHardDiskType']//span[@class='k-input']"),
    INITIAL_DISK_CONVERSION(LocatorsType.XPATH, "//div[@name='formRowFastInitialConversion']//span[@class='k-input']"),
    IF_INITIAL_ENCRYPTION_IS_INTERRUPTED(LocatorsType.XPATH, "//div[@name='formRowAutoRecoveryConversion']//span[@class='k-input']"),
    IF_SELF_ENC_DRIVE_DETECTED(LocatorsType.XPATH, "//div[@name='formRowHardwareEncryption']//span[@class='k-input']"),
    PARTITION_ENCRYPTION(LocatorsType.XPATH, "//div[@name='formRowAllowNotEncEntireDisk']//span[@class='k-input']"),
    WHAT_TO_ENC(LocatorsType.XPATH,"//div[@name='formRowEncryptHardDiskType']//span[@class='k-input']"),
    RMO_BOOT_KEY_FILE_ACCESS(LocatorsType.XPATH,"//div[@name='formRowAllowAutoLoginFstKF']//span[@class='k-input']"),
    UNMANAGED_DECRYPTION(LocatorsType.XPATH,"//div[@name='formRowPreventUnmanagedDecryptionEnt']//span[@class='k-input']"),
    VOLUME_PROTECTION(LocatorsType.XPATH,"//div[@name='formRowPreventVolumeProtectionSuspensionEnt']//span[@class='k-input']"),
    ACCESS_TO_BITLOCKER_MANAGEMENT(LocatorsType.XPATH,"//div[@name='formRowDisableBitlockerManagementApplicationEnt']//span[@class='k-input']"),
    IF_DEVICE_DOES_NOT_SUPPORT_BITLOCKER(LocatorsType.XPATH,"//div[@name='formRowInstallSecureDocwithNoBitLocker']//span[@class='k-input']"),

    /**
     * Encryption Advanced
     */
    RMO(LocatorsType.XPATH,"//div[@name='name=formRowFileVaultEnableDisableModeDesired']//span[@class='k-input']"),
    DEFINE_HOW_MEDIA_CAN_BE_ACCESSED(LocatorsType.XPATH,"//div[@name='name=formRowRMPassword']//span[@class='k-input']"),
    LOGGING(LocatorsType.XPATH,"//div[@name='formRowATT_ENABLE_RME_AUDITLOG']//span[@class='k-input']"),
    DEFAULT_MEDIA_ENCRYPTION_SETTINGS(LocatorsType.XPATH,"//div[@name='formRowRMDefaultMediaEncSettings']//span[@class='k-input']"),
    DEVICE_KEY_FOR_MEDIA_ENCRYPTION(LocatorsType.XPATH,"//div[@name='formRowRMPreventDeviceKey']//span[@class='k-input']"),
    CD_DVD_CONTAINER_ENCRYPTION(LocatorsType.XPATH,"//div[@name='formRowRmceCDDVD']//span[@class='k-input']"),
    FILE_AND_FOLDER_ENCRYPTION(LocatorsType.XPATH,"//div[@name='formRowFFESetup']//span[@class='k-input']"),
    INDIVIDUAL_FILE_ENCRYPTION(LocatorsType.XPATH,"//div[@name='formRowFileEncrypt']//span[@class='k-input']"),
    SELF_EXTRACTOR_ENCRYPTION(LocatorsType.XPATH,"//div[@name='formRowSDSFX']//span[@class='k-input']"),
    SECURE_FILE_WIPE(LocatorsType.XPATH,"//div[@name='formRowEnableWipeFile']//span[@class='k-input']"),

    /**
     * Key File Dual Authentication
     */
    AUTO_LOGIN_MAGICENDPOINT(LocatorsType.XPATH, "//div[.='Auto-login MagicEndpoint']//span[@class='k-input']"),
    AUTO_LOGOUT_MAGICENDPOINT_KEY_AFTER(LocatorsType.XPATH, "//div[@name='formRowGracePeriod']//span[@class='k-input']"),
    BLE_OPTION(LocatorsType.XPATH, "//div[@name='formRowPTBToken']//span[@class='k-input']"),
    BLE_OPTION_WARNING_MESSAGE(LocatorsType.ID, "info_PTBToken"),
    CRYPTO_ERASE(LocatorsType.XPATH, "//div[@name='formRow_EnableZeroizationSequence']//span[@class='k-input']"),
    CLIENT_FORCE_ENCRYPTION_SELECT(LocatorsType.XPATH, "//div[@name='formRowEncryptAllClientData']//span[@class='k-input']"),
    DEVICE_TO_SDCONNEX(LocatorsType.XPATH, "//div[@name='formRowPreBoot_TCPIP_Authentication']//span[@class='k-input']"),
    IDP_LIST_INPUT(LocatorsType.XPATH, "//div[@name='formRowIdP_Address_List']//input[@name='IdP_Address_List']"),
    KEYFILE_DUAL_AUTHENTICATION(LocatorsType.XPATH, "//div[@name='formRowKFAllowApw']//span[@class='k-input']"),
    MAGICENDPOINT_AUTHENTICATION(LocatorsType.XPATH, "//div[@name='formRowUseMagicEndpoint']//span[@class='k-input']"),
    MAGICENDPOINT_AUTO_LOGOUT(LocatorsType.XPATH, "//div[.='MagicEndpoint auto-logout']//span[@class='k-input']"),
    OTP_OPTION(LocatorsType.XPATH, "//div[@name='formRowEnableOTPLogin']//span[@class='k-input']"),
    OTP_WARNING_MESSAGE(LocatorsType.ID, "info_EnableOTPLogin"),
    OOB_OPTION(LocatorsType.XPATH, "//div[@name='formRowEnableOOBAuthentication']//span[@class='k-input']"),
    PASSWORD_SYNC(LocatorsType.XPATH,"//div[.='Password Synchronization']//span[@class='k-input']"),
    PROTECTING_AUTOBOOT(LocatorsType.XPATH, "//div[@name='formRowUseTpmForAutoboot']//span[@class='k-input']"),
    TPM_OPTION_MESSAGE(LocatorsType.ID, "TextUseTPM"),
    TPM_PROTECTION_OPTION(LocatorsType.XPATH, "//div[@name='formRowUseTPM']//span[@class='k-input']"),
    TWO_FA_LOGIN_WINDOWS(LocatorsType.XPATH, "//div[@name='formRowSDCPForce2F']//span[@class='k-input']"),
    TWO_FA_RDP(LocatorsType.XPATH, "//div[@name='formRowRDPForce2F']//span[@class='k-input']"),
    USER_ID_REQUIRED(LocatorsType.XPATH, "//div[@name='formRow_UserIDForceInput']//span[@class='k-input']"),
    USER_ID_INPUT(LocatorsType.XPATH, "//div[@name='formRow_GlobalShowKeyPress']//span[@class='k-input']"),
    CONVERT_TO_TOKEN_PROTECTION(LocatorsType.XPATH, "//div[@name='formRowSwitchToTokenProtectionEndpoint']//span[@class='k-input']"),
    HOW_IS_USERID_DERIVED_WHEN_SMART_CARD_ARE_USED(LocatorsType.XPATH, "//div[@name='formRowEnable_SmartCard_Authentication']//span[@class='k-input']"),
    DEVICE_BOOT_SETTINGS_IN_KF_DUAL_AUTH(LocatorsType.XPATH, "//div[@name='formRowEnable_SmartCard_Authentication']//span[@class='k-input']"),
    SILENT_AUTOBOOT(LocatorsType.XPATH, "//div[@name='formRowSILENT_AUTO_LOGIN_ENABLE']//span[@class='k-input']"),
    DEFINE_WHAT_DEVICE_EXPECTS_OF_USER_AT_PREBOOT(LocatorsType.XPATH, "//div[@name='formRowAUTO_LOGIN_FORCE_PERMANENT']//span[@class='k-input']"),
    MAXIMUM_FAILED_LOGINS_TOLERATED_AT_BOOT_LOGON(LocatorsType.XPATH, "//div[@name='formRowMAXLOGINCOUNT']//span[@class='k-input']"),
    UNATTENDED_DEVICES_LEFT_AT_PREBOOT_WILL_AUTO_POWER_DOWN(LocatorsType.XPATH, "//div[@name='formRowMAXLOGINCOUNT']//span[@class='k-input']"),
    DEVICE_WILL_ATTEMPT_TO_SDCONNEX_AT_PREBOOT_BEFORE_ASSUMING_UNREACHABLE(LocatorsType.XPATH, "//div[@name='formRowPrebootNetworkConnectionAttempts']//span[@class='k-input']"),
    SYNC_ME_CREDENTIAL_KEY_TO_SES(LocatorsType.XPATH, "//div[@name='formRowDuplicableTpmKeys']//span[@class='k-input']"),
    FACE_ID_BASED_AUTH(LocatorsType.XPATH, "//div[@name='formRowSilentFaceIDAuth']//span[@class='k-input']"),
    AUTO_LOGIN_ME(LocatorsType.XPATH, "//div[@name='formRowAutoLogin']//span[@class='k-input']"),
    ME_AUTO_LOGOUT(LocatorsType.XPATH, "//div[@name='formRowUnlimitedSession']//span[@class='k-input']"),
    ME_NOTIFICATION(LocatorsType.XPATH, "//div[@name='formRowServiceLoginNotifications']//span[@class='k-input']"),
    IDP_CERTIFICATE_VALIDATION(LocatorsType.XPATH, "//div[@name='formRowIdP_Cert_Checks']//span[@class='k-input']"),
    HOST_VERIFICATION_RULE(LocatorsType.XPATH, "//div[@name='formRowIdP_Cert_ChecksTemp']//span[@class='k-input']"),
    NUMBER_OF_KEY_FILES_STORED_ON_DEVICE(LocatorsType.XPATH, "//div[@name='formRowDBKFileNumber']//span[@class='k-input']"),
    LOCAL_USERS_DETECTED_ON_DEVICE(LocatorsType.XPATH, "//div[@name='formRowCreateBootKefileForWindowsAccount']//span[@class='k-input']"),
    AD_USERS_DETECTED_ON_DEVICE(LocatorsType.XPATH, "//div[@name='formRowCreateBootKefileForADUser']//span[@class='k-input']"),
    WINDOWS_USERS_DETECTED_ON_DEVICE(LocatorsType.XPATH, "//div[@name='formRowCreatePersonalKefileForWindowsAccount']//span[@class='k-input']"),
    AD_USER_ACCOUNTS(LocatorsType.XPATH, "//div[@name='formRowCreatePersonalKefileForWindowsAccount']//span[@class='k-input']"),
    EXCLUDE_ACCOUNT_FROM_HAVING_ANY_KEYFILE_FROM_DEVICE(LocatorsType.XPATH, "//div[@name='formRowListOfWinUsersExcludedFromSDCC']//span[@class='k-input']"),
    USER_PWD_RESPONSE(LocatorsType.XPATH, "//div[@name='formRowSendPWDtoSES']//span[@class='k-input']"),
    BROWSER_ACCESS_FROM_PREBOOT_AUTH(LocatorsType.XPATH, "//div[@name='formRowPrebootFeaturesDisable']//span[@class='k-input']"),
    PBCONNEX_AUTOBOOT_AUTH(LocatorsType.XPATH, "//div[@name='formRowHIDE_GUI_CREDENTIAL_FOR_AUTOBOOT']//span[@class='k-input']"),
    DEVICE_DETECTABLE_NETWORK_AT_PREBOOT(LocatorsType.XPATH, "//div[@name='formRowPREVENT_PINGS_BEFORE_WINDOWS']//span[@class='k-input']"),
    RESUMPTION_FROM_SLEEP(LocatorsType.XPATH, "//div[@name='formRowEnableOpalS3']//span[@class='k-input']"),
    SIGN_ON_DLL_INTEGRATION(LocatorsType.XPATH, "//div[@name='formRow_GlobalTransferPassword']//span[@class='k-input']"),
    PHONE_PROTECTED_KEY_FILE(LocatorsType.XPATH, "//div[@name='formRowUseSDCPPhone']//span[@class='k-input']"),
    SECUREDOC_RDP_AUTH(LocatorsType.XPATH, "//div[@name='formRowUseSDCPPhone']//span[@class='k-input']"),
    REMOTE_DEVICE_AUTH(LocatorsType.XPATH, "//div[@name='formRowSDCPNoUserActionRDP']//span[@class='k-input']"),
    AUTO_FILL_WINDOWS_PWD(LocatorsType.XPATH, "//div[@name='formRowProvisionWinPwd']//span[@class='k-input']"),
    ROTATE_WINDOWS_PWD(LocatorsType.XPATH, "//div[@name='formRowManageWinPwd']//span[@class='k-input']"),
    AUTO_FILL_ROTATE_WINDOWS_PWD(LocatorsType.XPATH, "//div[@name='formRowAutoRotateWinPwd']//span[@class='k-input']"),

    /**
     * Client Agent Settings
     */
    BUTTON_ADD_SDCONNEX(LocatorsType.ID,"ServerList_Addbtn"),
    BUTTON_DELETE_SDCONNEX(LocatorsType.CSS,".listItemClose"),
    BUTTON_MOVE_UP_SDCONNEX(LocatorsType.CSS,".listItemMoveUp"),
    BUTTON_MOVE_DOWN_SDCONNEX(LocatorsType.CSS,".listItemMoveDown"),
    ENDPOINT_DEVICE_TO_SES_SERVER(LocatorsType.XPATH, "//div[@name='formRowCommMode']//span[@class='k-input']"),
    DISABLE_ACCESS_UPON_NO_COMM_WITH_SERVER(LocatorsType.XPATH, "//div[@name='formRowNO_COMM_DAYS']//span[@class='k-input']"),
    BLOCK_PBCONNEX_AUTH_IF_DEVICE_FAIL_TO_COMM(LocatorsType.XPATH, "//div[@name='formRowNO_COMM_DAYS']//span[@class='k-input']"),
    TLS_ENCRYPTION(LocatorsType.XPATH, "//div[@name='formRowTls_Options']//span[@class='k-input']"),
    VALIDATE_CERTIFICATE(LocatorsType.XPATH, "//div[@name='formRowTls_Options']//span[@class='k-input']"),
    VALIDATE_CERTIFICATE_HOSTNAME(LocatorsType.XPATH, "//div[@name='formRowTls_Options']//span[@class='k-input']"),
    SDCONNEX_SERVER_POOLS(LocatorsType.XPATH, "//div[@name='formRowTls_Options']//span[@class='k-input']"),
    SECUREDOC_CLIENT_ACCESS(LocatorsType.XPATH, "//div[@name='formRowTls_Options']//span[@class='k-input']"),
    CLIENT_LEVEL_NOTIFICATIONS(LocatorsType.XPATH, "//div[@name='formRowSuppressNotifications']//span[@class='k-input']"),
    KEYFILE_MESSAGE(LocatorsType.XPATH, "//div[@name='formRowDisplayWindowsAccountMessage']//span[@class='k-input']"),
    USER_RECOVERY_RESPONSES(LocatorsType.XPATH, "//div[@name='formRowShowAuthAnswers']//span[@class='k-input']"),
    DEVICE_CONFIGURATION_MODIFICATION(LocatorsType.XPATH, "//div[@name='formRowAdminProtectConfig']//span[@class='k-input']"),
    TOKEN_CERTIFICATE_INFO(LocatorsType.XPATH, "//div[@name='formRowExtendedCertNames']//span[@class='k-input']"),
    WIRED_OR_WIRELESS_CONNECTIONS_SETTINGS(LocatorsType.XPATH, "//div[@name='formRowNetwork Connection Type']//span[@class='k-input']"),
    SECURITY_PROTOCOL_WIRELESS_WIRED(LocatorsType.XPATH, "//div[@name='formRowProtocol']//span[@class='k-input']"),
    ENCRYPTION_PROTOCOL_WIRELESS(LocatorsType.XPATH, "//div[@name='formRowEncryptionProtocolWireless']//span[@class='k-input']"),
    ACCESS_POINT(LocatorsType.XPATH, "//div[@name='formRowAccessPointWireless']//span[@class='k-input']"),
    USER_ACCESS_TO_WIRELESS_CONFIGURATION_SETTINGS(LocatorsType.XPATH, "//div[@name='formRowPBN Flags1']//span[@class='k-input']"),
    NETWORK_PROXY_SERVER(LocatorsType.XPATH, "//div[@name='formRowSDConnexProxyEnabled']//span[@class='k-input']"),
    PROTECT_DEVICE_AGAINST_REPEATED_FAILED_LOGIN_WINDOWS(LocatorsType.XPATH, "//div[@name='formRowAUTO_BOOT_MONITOR']//span[@class='k-input']"),
    USER_RESTRICTION(LocatorsType.XPATH, "//div[@name='formRowCP_onlySDUserLogonWindows']//span[@class='k-input']"),
    WINDOWS_LOGON_HANDLER(LocatorsType.XPATH, "//div[@name='formRowCP_onlySDUserLogonWindowsOfflineDS']//span[@class='k-input']"),
    PORT_CONTROL_FEATURE(LocatorsType.XPATH, "//div[@name='formRowPORT_CONTROL_INSTALLED']//span[@class='k-input']"),
    CLIENT_SEND_MACHINE_INFO_TO_THIS_EMAIL(LocatorsType.XPATH, "//div[@name='formRowE-mail']//span[@class='k-input']"),

    PORT_NUMBER(LocatorsType.XPATH,"//div[@name='formRowWinsocket_Port']//span[@class='k-input']"),
    COMMUNICATE_WITH_SERVER(LocatorsType.XPATH,"//input[@name='CmdInterval']"),
    SERVER_LIST_INPUT_FIELD(LocatorsType.ID,"ServerList_Addinput"),
    SSO_OPTION(LocatorsType.XPATH,"//div[@name='formRowSingleSignOn']//span[@class='k-input']"),
    SDCP_OPTION(LocatorsType.XPATH,"//div[@name='formRowUseSDCP']//span[@class='k-input']"),

    /**
     * Device Boot Settings
     */
    ADAPTING_TO_DEVICE_HARDWARE(LocatorsType.XPATH, "//div[@name='formRowCompatibilityTest']//span[@class='k-input']"),
    COMPATIBILITY_TEST(LocatorsType.XPATH, "//div[@name='formRowBootSelfLearning']//span[@class='k-input']"),
    PREBOOT_HANDLER_FAIL_OVER_OPTION(LocatorsType.XPATH, "//div[@name='formRowSelfLearningFallback']//span[@class='k-input']"),
    IF_NO_COMPATIBLE_PREBOOT_AVAILABLE(LocatorsType.XPATH, "//div[@name='formRowSelfLearningFallbackTemp']//span[@class='k-input']"),
    UEFI_BOOT_ORDER(LocatorsType.XPATH, "//div[@name='formRowUEFI_USE_BOOTORDER']//span[@class='k-input']"),
    UEFI_DRIVER_HOOK(LocatorsType.XPATH, "//div[@name='formRow_BootOptBitUseDriverHook']//span[@class='k-input']"),
    FORCE_DIRECT_BOOT_TO_WINDOWS(LocatorsType.XPATH, "//div[@name='formRow_BootOptBitRunStandardBootPathDirectly']//span[@class='k-input']"),
    MBR_ACCESS_MODE_OPTIONS(LocatorsType.XPATH, "//div[@name='formRow_GlobalMBRWriteTable']//span[@class='k-input']"),
    VIRTUAL_MASTER_BOOT_RECORD(LocatorsType.XPATH, "//div[@name='formRow_GlobalMBRWriteTable']//span[@class='k-input']"),
    BIOS_MODE(LocatorsType.XPATH, "//div[@name='formRow_XBDA_CopyMode']//span[@class='k-input']"),
    SPECIAL_Y_MODE(LocatorsType.XPATH, "//div[@name='formRow_gYMode']//span[@class='k-input']"),
    LEGACY_BOOT_LOADER(LocatorsType.XPATH, "//div[@name='formRowBOOTLOADER_VERSION']//span[@class='k-input']"),
    X_START(LocatorsType.XPATH, "//div[@name='formRow_XBDA_ToReserve']//span[@class='k-input']"),
    X_AFTER(LocatorsType.XPATH, "//div[@name='formRow_XBDA_ToReserve']//span[@class='k-input']"),
    X_SIZE(LocatorsType.XPATH, "//div[@name='formRow_GlobalOurXBDASize']//span[@class='k-input']"),
    X_MODE(LocatorsType.XPATH, "//div[@name='formRow_GlobalSpecialBIOS_II']//span[@class='k-input']"),
    DVD_MODE(LocatorsType.XPATH, "//div[@name='formRow_GlobalDVDMode']//span[@class='k-input']"),
    BOOT_PARAMETERS(LocatorsType.XPATH, "//div[@name='formRow_GlobalDVDMode']//span[@class='k-input']"),
    SUSAM_FOR_LEGACY_BIOS_DEVICES(LocatorsType.XPATH, "//div[@name='formRow_GlobalDVDMode']//span[@class='k-input']"),
    SUSAM_FOR_UEFI_DEVICES(LocatorsType.XPATH, "//div[@name='formRow_SusamUEFI']//span[@class='k-input']"),
    PCMCIA_IO_ADDRESS(LocatorsType.XPATH, "//div[@name='formRow_SusamUEFI']//span[@class='k-input']"),
    ADVANCED_ATR_MODE(LocatorsType.XPATH, "//div[@name='formRow_AdvancedATRmode']//span[@class='k-input']"),
    KEY_TRANSFER_TO_WINDOWS(LocatorsType.XPATH, "//div[@name='formRow_AdvancedATRmode']//span[@class='k-input']"),
    DEFAULT_KEYBOARD_LAYOUT(LocatorsType.XPATH, "//div[@name='formRow_KeyLayout']//span[@class='k-input']"),
    KEYBOARD_LAYOUT_DETECTION(LocatorsType.XPATH, "//div[@name='formRow_AutoGetKeyLayout']//span[@class='k-input']"),
    FOREIGN_KEYBOARD_SUPPORT(LocatorsType.XPATH, "//div[@name='formRow_Int9Enable']//span[@class='k-input']"),
    ON_SCREEN_KEYBOARD_VISIBILITY(LocatorsType.XPATH, "//div[@name='formRowKeepOnScreenKeyboardMinimized']//span[@class='k-input']"),
    TOUCH_CAPABLE_ON_SCREEN_KEYBOARDS(LocatorsType.XPATH, "//div[@name='formRow_OnScreenKB']//span[@class='k-input']"),
    UEFI_BOOT_LOADER(LocatorsType.XPATH, "//div[@name='formRowBOOTLOADER_VERSION_UEFI']//span[@class='k-input']"),

    /**
     * Boot Text and Color Settings
     */
    BOOT_HEADER_TEXT(LocatorsType.XPATH, "//div[@name='formRowBT_HEADER']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    KEYFILE_PROMPT(LocatorsType.XPATH, "//div[@name='formRowBT_KF_PROMPT']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    PWD_PROMPT(LocatorsType.XPATH, "//div[@name='formRowBT_PWD_PROMPT']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    LOCK_PROMPT(LocatorsType.XPATH, "//div[@name='formRowBT_LOCK_PROMPT']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    CHALLENGE_RESPONSE_PROMPT(LocatorsType.XPATH, "//div[@name='formRowBT_LOCK_PROMPT']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    BACKGROUND_THEME(LocatorsType.XPATH, "//div[@name='formRowBT_LOCK_PROMPT']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    TEXT_COLOR(LocatorsType.XPATH, "//div[@name='formRowBT_LOCK_PROMPT']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),
    WHEN_TO_UPDATE_BACKGROUND(LocatorsType.XPATH, "//div[@name='formRowUpdateExistingBootScreen']/div[@class='formLabel defaultControlLabel']//input[@name='BootTextColor']"),

    /**
     * Disk Access Control
     */
    ENCRYPTED_DISK_ACCESS_CONTROL_SELECT(LocatorsType.XPATH, "//div[@name='formRowEnforceAccessControl']//span[@class='k-input']"),
    RESTRICTED_ACCESS_DISK_SELECT(LocatorsType.XPATH, "//div[@name='formRowRestrictedDisk']/div[@class='formLabel defaultControlLabel']//span[@class='k-input']");

    private final LocatorsType locatorType;
    private final String valueString;

    ProfilesLocators(LocatorsType locatorType, String locatorValue) {
        this.locatorType = locatorType;
        this.valueString = locatorValue;
    }

    public By getBy(String value) {
        return locatorType.buildBy(this.valueString.replace("{{text}}", value));
    }

    public By getBy() {
        return locatorType.buildBy(this.valueString);
    }

}