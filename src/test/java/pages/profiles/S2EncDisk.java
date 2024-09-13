package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S2EncDisk extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S2EncDisk.class);

    public S2EncDisk() {
        super();
    }

    public void diskEncryptionAgent(String option) {
        try {
            logger.info("Attempting to select option in 'Disk Encryption Agent'");
            selectOptionProfilesPackages(ProfilesLocators.DISK_ENCRYPTION_AGENT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Disk Encryption Agent' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Disk Encryption Agent");
        }
    }

    public void ifSelfEncDriveDetected(String option) {
        try {
            logger.info("Attempting to select option in 'If Self-Encrypting Drive detected'");
            selectOptionProfilesPackages(ProfilesLocators.IF_SELF_ENC_DRIVE_DETECTED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If Self-Encrypting Drive detected' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If Self-Encrypting Drive detected'");
        }
    }

    public void whatToEncrypt(String option) {
        try {
            logger.info("Attempting to select option in 'What to Encrypt'");
            selectOptionProfilesPackages(ProfilesLocators.WHAT_TO_ENC.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'What to Encrypt' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'What to Encrypt'");
        }
    }

    public void partitionEncryption(String option) {
        try {
            logger.info("Attempting to select option in 'Partition Encryption'");
            selectOptionProfilesPackages(ProfilesLocators.PARTITION_ENCRYPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Partition Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Partition Encryption'");
        }
    }

    public void ifInitialEncryptionIsInterrupted(String option) {
        try {
            logger.info("Attempting to select option in 'If initial encryption is interrupted'");
            selectOptionProfilesPackages(ProfilesLocators.IF_INITIAL_ENCRYPTION_IS_INTERRUPTED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If initial encryption is interrupted' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If initial encryption is interrupted'");
        }
    }

    public void initialDiskConversion(String option) {
        try {
            logger.info("Attempting to select option in 'Initial Disk Conversion'");
            selectOptionProfilesPackages(ProfilesLocators.INITIAL_DISK_CONVERSION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Initial Disk Conversion' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Initial Disk Conversion'");
        }
    }

    public void enforceDriveEncryptionType(String option) {
        try {
            logger.info("Attempting to select option in 'Enforce Drive Encryption type'");
            selectOptionProfilesPackages(ProfilesLocators.ENFORCE_DRIVE_ENC_TYPE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Enforce Drive Encryption type' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Enforce Drive Encryption type'");
        }
    }

    public void driveToEncrypt(String option) {
        try {
            logger.info("Attempting to select option in 'Drives to Encrypt'");
            selectOptionProfilesPackages(ProfilesLocators.DRIVE_TO_ENC.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Drives to Encrypt' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Drives to Encrypt'");
        }
    }

    public void diskDataRecoveryInfo(String option) {
        try {
            logger.info("Attempting to select option in 'Disk Data Recovery Info'");
            selectOptionProfilesPackages(ProfilesLocators.DISK_DATA_RECOVERY_INFO.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Disk Data Recovery Info' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Disk Data Recovery Info'");
        }
    }

    public void afterInstallingBootLogOn(String option) {
        try {
            logger.info("Attempting to select option in 'After installing Boot Logon'");
            selectOptionProfilesPackages(ProfilesLocators.AFTER_INSTALLING_BOOT_LOGON.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'After installing Boot Logon' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'After installing Boot Logon'");
        }
    }

    public void blockSIDOption(String option) {
        try {
            logger.info("Attempting to select option in 'BlockSID option'");
            selectOptionProfilesPackages(ProfilesLocators.BLOCK_SID_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'BlockSID option' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'BlockSID option'");
        }
    }

    public void bitLockerCipher(String option) {
        try {
            logger.info("Attempting to select option in 'BitLocker cipher type'");
            selectOptionProfilesPackages(ProfilesLocators.BITLOCKER_CIPHER_TYPE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'BitLocker cipher type' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'BitLocker cipher'");
        }
    }

    public void enforceBitLockerCipher(String option) {
        try {
            logger.info("Attempting to select option in 'Enforce BitLocker cipher type'");
            selectOptionProfilesPackages(ProfilesLocators.ENFORCE_BITLOCKER_CIPHER_TYPE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Enforce BitLocker cipher type' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Enforce BitLocker cipher type'");
        }
    }

    public void rmoBootKeyFileAccess(String option) {
        try {
            logger.info("Attempting to select option in 'RMO Boot Key File Access'");
            selectOptionProfilesPackages(ProfilesLocators.RMO_BOOT_KEY_FILE_ACCESS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'RMO Boot Key File Access' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'RMO Boot Key File Access'");
        }
    }

    public void unmanagedDecryption(String option) {
        try {
            logger.info("Attempting to select option in 'Unmanaged Decryption'");
            selectOptionProfilesPackages(ProfilesLocators.UNMANAGED_DECRYPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Unmanaged Decryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Unmanaged Decryption'");
        }
    }

    public void volumeProtection(String option) {
        try {
            logger.info("Attempting to select option in 'Volume Protection'");
            selectOptionProfilesPackages(ProfilesLocators.VOLUME_PROTECTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Volume Protection' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Volume Protection'");
        }
    }

    public void accessToBitLockerManagement(String option) {
        try {
            logger.info("Attempting to select option in 'Access to BitLocker Management'");
            selectOptionProfilesPackages(ProfilesLocators.ACCESS_TO_BITLOCKER_MANAGEMENT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Access to BitLocker Management' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Access to BitLocker Management'");
        }
    }

    public void ifDeviceDoesNotSupportBitLocker(String option) {
        try {
            logger.info("Attempting to select option in 'If device does not support BitLocker'");
            selectOptionProfilesPackages(ProfilesLocators.IF_DEVICE_DOES_NOT_SUPPORT_BITLOCKER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If device does not support BitLocker' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If device does not support BitLocker'");
        }
    }

}
