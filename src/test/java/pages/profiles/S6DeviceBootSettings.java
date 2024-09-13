package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S6DeviceBootSettings extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S6DeviceBootSettings.class);

    public S6DeviceBootSettings() {
        super();
    }

    public void adaptingToDeviceHardware(String option) {
        try {
            logger.info("Attempting to select option in 'Adapting to Device Hardware'");
            selectOptionProfilesPackages(ProfilesLocators.ADAPTING_TO_DEVICE_HARDWARE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Adapting to Device Hardware' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Adapting to Device Hardware'");
        }
    }

    public void compatibilityTest(String option) {
        try {
            logger.info("Attempting to select option in 'Compatibility Test'");
            selectOptionProfilesPackages(ProfilesLocators.COMPATIBILITY_TEST.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Compatibility Test' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Compatibility Test'");
        }
    }

    public void prebootHandlerFailOverOption(String option) {
        try {
            logger.info("Attempting to select option in 'Pre-Boot handler Fail-over option'");
            selectOptionProfilesPackages(ProfilesLocators.PREBOOT_HANDLER_FAIL_OVER_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Pre-Boot handler Fail-over option' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Pre-Boot handler Fail-over option'");
        }
    }

    public void ifNoCompatiblePreBootOption(String option) {
        try {
            logger.info("Attempting to select option in 'If no compatible Pre-Boot available'");
            selectOptionProfilesPackages(ProfilesLocators.IF_NO_COMPATIBLE_PREBOOT_AVAILABLE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'If no compatible Pre-Boot available' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'If no compatible Pre-Boot available'");
        }
    }

    public void uefiBootOrder(String option) {
        try {
            logger.info("Attempting to select option in 'UEFI Boot Order'");
            selectOptionProfilesPackages(ProfilesLocators.UEFI_BOOT_ORDER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'UEFI Boot Order' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'UEFI Boot Order'");
        }
    }

    public void uefiDriverHook(String option) {
        try {
            logger.info("Attempting to select option in 'UEFI Driver Hook'");
            selectOptionProfilesPackages(ProfilesLocators.UEFI_DRIVER_HOOK.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'UEFI Driver Hook' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'UEFI Driver Hook'");
        }
    }

    public void forceDirectBootToWindows(String option) {
        try {
            logger.info("Attempting to select option in 'Force direct boot to Windows'");
            selectOptionProfilesPackages(ProfilesLocators.FORCE_DIRECT_BOOT_TO_WINDOWS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Force direct boot to Windows' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Force direct boot to Windows'");
        }
    }

    public void mbrAccessModeOptions(String option) {
        try {
            logger.info("Attempting to select option in 'MBR Access Mode options'");
            selectOptionProfilesPackages(ProfilesLocators.MBR_ACCESS_MODE_OPTIONS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'MBR Access Mode options' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'MBR Access Mode options'");
        }
    }

    public void virtualMasterBootRecord(String option) {
        try {
            logger.info("Attempting to select option in 'Virtual Master Boot Record (MBR)'");
            selectOptionProfilesPackages(ProfilesLocators.VIRTUAL_MASTER_BOOT_RECORD.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Virtual Master Boot Record (MBR)' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Virtual Master Boot Record (MBR)'");
        }
    }

    public void BIOSMode(String option) {
        try {
            logger.info("Attempting to select option in 'BIOS Mode'");
            selectOptionProfilesPackages(ProfilesLocators.BIOS_MODE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'BIOS Mode' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'BIOS Mode'");
        }
    }

    public void specialYMode(String option) {
        try {
            logger.info("Attempting to select option in 'Special Y Mode: (Use 00 unless WM Support advises)'");
            selectOptionProfilesPackages(ProfilesLocators.SPECIAL_Y_MODE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Special Y Mode: (Use 00 unless WM Support advises)' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Special Y Mode: (Use 00 unless WM Support advises)'");
        }
    }

    public void legacyBootLoader(String option) {
        try {
            logger.info("Attempting to select option in 'Legacy BootLoader'");
            selectOptionProfilesPackages(ProfilesLocators.LEGACY_BOOT_LOADER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Legacy BootLoader' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Legacy BootLoader'");
        }
    }

    public void UEFIBootLoader(String option) {
        try {
            logger.info("Attempting to select option in 'UEFI BootLoader'");
            selectOptionProfilesPackages(ProfilesLocators.UEFI_BOOT_LOADER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'UEFI BootLoader' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'UEFI BootLoader'");
        }
    }

    public void xStart(String modeNumber) {
        try {
            logger.info("Attempting to select option in 'X Start'");
            input(ProfilesLocators.X_START.getBy(), modeNumber);
            logger.info("Selected '{}' in 'X Start' successfully", modeNumber);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'X Start'");
        }
    }

    public void xAfter(String modeNumber) {
        try {
            logger.info("Attempting to select option in 'X After'");
            input(ProfilesLocators.X_AFTER.getBy(), modeNumber);
            logger.info("Selected '{}' in 'X After' successfully", modeNumber);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'X After'");
        }
    }

    public void xSize(String modeNumber) {
        try {
            logger.info("Attempting to select option in 'X Size'");
            input(ProfilesLocators.X_SIZE.getBy(), modeNumber);
            logger.info("Selected '{}' in 'X Size' successfully", modeNumber);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'X Size'");
        }
    }

    public void xMode(String modeNumber) {
        try {
            logger.info("Attempting to select option in 'X Mode'");
            input(ProfilesLocators.X_MODE.getBy(), modeNumber);
            logger.info("Selected '{}' in 'X Mode' successfully", modeNumber);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'X Mode'");
        }
    }

    public void dvdMode(String modeNumber) {
        try {
            logger.info("Attempting to select option in 'DVD Mode'");
            input(ProfilesLocators.DVD_MODE.getBy(), modeNumber);
            logger.info("Selected '{}' in 'DVD Mode' successfully", modeNumber);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'DVD Mode'");
        }
    }

    public void bootParameters(String parameterNumber) {
        try {
            logger.info("Attempting to select option in 'Boot parameters'");
            input(ProfilesLocators.BOOT_PARAMETERS.getBy(), parameterNumber);
            logger.info("Selected '{}' in 'Boot parameters' successfully", parameterNumber);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Boot parameters'");
        }
    }

    public void SUSAMForLegacyBiosDevices(String option) {
        try {
            logger.info("Attempting to select option in 'SUSAM for Legacy (BIOS) Devices'");
            selectOptionProfilesPackages(ProfilesLocators.SUSAM_FOR_LEGACY_BIOS_DEVICES.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SUSAM for Legacy (BIOS) Devices' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SUSAM for Legacy (BIOS) Devices'");
        }
    }

    public void SUSAMForUEFIDevices(String option) {
        try {
            logger.info("Attempting to select option in 'SUSAM for UEFI Devices'");
            selectOptionProfilesPackages(ProfilesLocators.SUSAM_FOR_UEFI_DEVICES.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SUSAM for UEFI Devices' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SUSAM for UEFI Devices'");
        }
    }

    public void PCMCIAIOAddress(String option) {
        try {
            logger.info("Attempting to select option in 'PCMCIA I/O Address'");
            selectOptionProfilesPackages(ProfilesLocators.PCMCIA_IO_ADDRESS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'PCMCIA I/O Address' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'PCMCIA I/O Address'");
        }
    }

    public void AdvancedATRMode(String option) {
        try {
            logger.info("Attempting to select option in 'Advanced ATR mode'");
            selectOptionProfilesPackages(ProfilesLocators.ADVANCED_ATR_MODE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Advanced ATR mode' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Advanced ATR mode'");
        }
    }

    public void keyTransferToWindows(String option) {
        try {
            logger.info("Attempting to select option in 'Key Transfer to Windows'");
            selectOptionProfilesPackages(ProfilesLocators.KEY_TRANSFER_TO_WINDOWS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Key Transfer to Windows' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key Transfer to Windows'");
        }
    }

    public void defaultKeyboardLayout(String option) {
        try {
            logger.info("Attempting to select option in 'Default Keyboard Layout'");
            selectOptionProfilesPackages(ProfilesLocators.DEFAULT_KEYBOARD_LAYOUT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Default Keyboard Layout' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Default Keyboard Layout'");
        }
    }

    public void keyboardLayoutDetection(String option) {
        try {
            logger.info("Attempting to select option in 'Keyboard Layout Detection'");
            selectOptionProfilesPackages(ProfilesLocators.KEYBOARD_LAYOUT_DETECTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Keyboard Layout Detection' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Keyboard Layout Detection'");
        }
    }

    public void foreignKeyboardSupport(String option) {
        try {
            logger.info("Attempting to select option in 'Foreign Keyboard Support'");
            selectOptionProfilesPackages(ProfilesLocators.FOREIGN_KEYBOARD_SUPPORT.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Foreign Keyboard Support' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Foreign Keyboard Support'");
        }
    }

    public void onScreenKeyboardVisibility(String option) {
        try {
            logger.info("Attempting to select option in 'On-Screen Keyboard Visibility'");
            selectOptionProfilesPackages(ProfilesLocators.ON_SCREEN_KEYBOARD_VISIBILITY.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'On-Screen Keyboard Visibility' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'On-Screen Keyboard Visibility'");
        }
    }

    public void touchCapableOnScreenKeyboards(String option) {
        try {
            logger.info("Attempting to select option in 'Touch-capable On-screen Keyboards'");
            selectOptionProfilesPackages(ProfilesLocators.TOUCH_CAPABLE_ON_SCREEN_KEYBOARDS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Touch-capable On-screen Keyboards' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Touch-capable On-screen Keyboards'");
        }
    }

}
