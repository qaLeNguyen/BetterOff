package pages.profiles;

import common.BuiltInAction;
import object.profiles_object.ProfilesLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S5ClientAgentSettings extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(S5ClientAgentSettings.class);

    public S5ClientAgentSettings() {
        super();
    }

    public void endpointDevicesToSESServer(String option){
        try {
            logger.info("Attempting to select option in 'Endpoint Devices to SES Server'");
            selectOptionProfilesPackages(ProfilesLocators.ENDPOINT_DEVICE_TO_SES_SERVER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Endpoint Devices to SES Server' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Endpoint Devices to SES Server'");
        }
    }

    public void portNumber(String number) {
        try {
            logger.info("Attempting to input port in 'Port Number'");
            scrollToView(ProfilesLocators.PORT_NUMBER.getBy());
            replaceTextInField(ProfilesLocators.PORT_NUMBER.getBy(), number);
            logger.info("Inputted '{}' in 'Port Number' successfully", number);
        } catch (Exception e) {
            logger.error("Error occurred when inputting Port Number: '{}'", number);
        }
    }

    public void communicateWithServer(String minutes) {
        try {
            logger.info("Attempting to input number in 'Communicate with Server every (minutes)'");
            scrollToView(ProfilesLocators.COMMUNICATE_WITH_SERVER.getBy());
            replaceTextInField(ProfilesLocators.COMMUNICATE_WITH_SERVER.getBy(), minutes);
            logger.info("Inputted '{}' in 'Communicate with Server every (minutes)' successfully", minutes);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Communicate with Server every (minutes)'");
        }
    }

    public void disableAccessUponNoCommWithServer(String days) {
        try {
            logger.info("Attempting to input number in 'Disable access upon no communication with Server (days)'");
            scrollToView(ProfilesLocators.DISABLE_ACCESS_UPON_NO_COMM_WITH_SERVER.getBy());
            replaceTextInField(ProfilesLocators.DISABLE_ACCESS_UPON_NO_COMM_WITH_SERVER.getBy(), days);
            logger.info("Inputted '{}' in 'Disable access upon no communication with Server (days)' successfully", days);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Disable access upon no communication with Server (days)'");
        }
    }

    public void blockPBConnexAuthIfDeviceFailsToComm(String minutes) { // don't know value in here is what
        try {
            logger.info("Attempting to input number in 'Block PBConnex Authentication if device fails to communicate for # comm. cycles'");
            scrollToView(ProfilesLocators.BLOCK_PBCONNEX_AUTH_IF_DEVICE_FAIL_TO_COMM.getBy());
            replaceTextInField(ProfilesLocators.BLOCK_PBCONNEX_AUTH_IF_DEVICE_FAIL_TO_COMM.getBy(), minutes);
            logger.info("Inputted '{}' in 'Block PBConnex Authentication if device fails to communicate for # comm. cycles' successfully", minutes);
        } catch (Exception e) {
            logger.error("Error occurred when inputting 'Block PBConnex Authentication if device fails to communicate for # comm. cycles'");
        }
    }

    public void tlsEncryption(String option) {
        try {
            logger.info("Attempting to select option in 'TLS Encryption'");
            selectOptionProfilesPackages(ProfilesLocators.TLS_ENCRYPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'TLS Encryption' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'TLS Encryption'");
        }
    }

    public void validateCertificate(String option) {
        try {
            logger.info("Attempting to select option in 'Validate Certificate'");
            selectOptionProfilesPackages(ProfilesLocators.VALIDATE_CERTIFICATE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Validate Certificate' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Validate Certificate'");
        }
    }

    public void validateCertificateHostname(String option) {
        try {
            logger.info("Attempting to select option in 'Validate Certificate Hostname'");
            selectOptionProfilesPackages(ProfilesLocators.VALIDATE_CERTIFICATE_HOSTNAME.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Validate Certificate Hostname' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Validate Certificate Hostname'");
        }
    }

    public void sdConnexServer(String nameDNS) {
        try {
            logger.info("Attempting to input DNS-Name or IP in 'SDConnex Servers in IPV4, IPV6 or DNS-Name Format'");
            scrollToView(ProfilesLocators.SERVER_LIST_INPUT_FIELD.getBy());
            input(ProfilesLocators.SERVER_LIST_INPUT_FIELD.getBy(), nameDNS);
            logger.info("Added '{}' in 'SDConnex Servers in IPV4, IPV6 or DNS-Name Format'", nameDNS);
            click(ProfilesLocators.BUTTON_ADD_SDCONNEX.getBy());
            logger.info("Clicked 'Add' button to add SDConnex successfully");
        } catch (Exception e) {
            logger.error("Error occurred when adding 'SDConnex Servers in IPV4, IPV6 or DNS-Name Format'");
        }
    }

    public void sdConnexServerPools(String option) {
        try {
            logger.info("Attempting to select option in 'SDConnex Server Pools'");
            selectOptionProfilesPackages(ProfilesLocators.SDCONNEX_SERVER_POOLS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SDConnex Server Pools' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SDConnex Server Pools'");
        }
    }

    public void secureDocAccessClient(String option) {
        try {
            logger.info("Attempting to select option in 'SecureDoc Client Access'");
            selectOptionProfilesPackages(ProfilesLocators.SECUREDOC_CLIENT_ACCESS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'SecureDoc Client Access' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'SecureDoc Client Access'");
        }
    }

    public void clientLevelNotifications(String option) {
        try {
            logger.info("Attempting to select option in 'Client-level Notifications'");
            selectOptionProfilesPackages(ProfilesLocators.CLIENT_LEVEL_NOTIFICATIONS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Client-level Notifications' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Client-level Notifications'");
        }
    }

    public void keyFileMessages(String option) {
        try {
            logger.info("Attempting to select option in 'Key File Messages'");
            selectOptionProfilesPackages(ProfilesLocators.KEYFILE_MESSAGE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Key File Messages' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Key File Messages'");
        }
    }

    public void userRecoveryResponses(String option) {
        try {
            logger.info("Attempting to select option in 'User Recovery Responses'");
            selectOptionProfilesPackages(ProfilesLocators.USER_RECOVERY_RESPONSES.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User Recovery Responses' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User Recovery Responses'");
        }
    }

    public void deviceConfigurationModification(String option) {
        try {
            logger.info("Attempting to select option in 'Device Configuration modification'");
            selectOptionProfilesPackages(ProfilesLocators.DEVICE_CONFIGURATION_MODIFICATION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Device Configuration modification' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Device Configuration modification'");
        }
    }

    public void tokenCertificateInfo(String option) {
        try {
            logger.info("Attempting to select option in 'Token/Certificate Info'");
            selectOptionProfilesPackages(ProfilesLocators.TOKEN_CERTIFICATE_INFO.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Token/Certificate Info' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Token/Certificate Info'");
        }
    }

    public void wiredOrWirelessConnectionSettings(String option) {
        try {
            logger.info("Attempting to select option in 'Wired or Wireless Connection Settings'");
            selectOptionProfilesPackages(ProfilesLocators.WIRED_OR_WIRELESS_CONNECTIONS_SETTINGS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Wired or Wireless Connection Settings' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Wired or Wireless Connection Settings'");
        }
    }

    public void securityProtocolWirelessWired(String option) {
        try {
            logger.info("Attempting to select option in 'Security Protocol Wireless/Wired'");
            selectOptionProfilesPackages(ProfilesLocators.SECURITY_PROTOCOL_WIRELESS_WIRED.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Security Protocol Wireless/Wired' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Security Protocol Wireless/Wired'");
        }
    }

    public void encryptionProtocolWireless(String option) {
        try {
            logger.info("Attempting to select option in 'Encryption Protocol Wireless'");
            selectOptionProfilesPackages(ProfilesLocators.ENCRYPTION_PROTOCOL_WIRELESS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Encryption Protocol Wireless' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Encryption Protocol Wireless'");
        }
    }

    public void accessPoint(String accessPoint) {
        try {
            logger.info("Attempting to select option in 'Access Point'");
            input(ProfilesLocators.ACCESS_POINT.getBy(), accessPoint);
            logger.info("Inputted '{}' in 'Access Point' successfully", accessPoint);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Access Point'");
        }
    }

    public void userAccessToWirelessSettingsAtPreBoot(String option) {
        try {
            logger.info("Attempting to select option in 'User access to Wireless Configuration settings at Pre-Boot'");
            selectOptionProfilesPackages(ProfilesLocators.USER_ACCESS_TO_WIRELESS_CONFIGURATION_SETTINGS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User access to Wireless Configuration settings at Pre-Boot' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User access to Wireless Configuration settings at Pre-Boot'");
        }
    }

    public void networkProxyServer(String option) {
        try {
            logger.info("Attempting to select option in 'Network Proxy Server'");
            selectOptionProfilesPackages(ProfilesLocators.NETWORK_PROXY_SERVER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Network Proxy Server' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Network Proxy Server'");
        }
    }

    public void protectDeviceAgainstRepeatedFailedPwdAttackWindows(String option) {
        try {
            logger.info("Attempting to select option in 'Protect device against repeated failed-password attack at Windows logon'");
            selectOptionProfilesPackages(ProfilesLocators.PROTECT_DEVICE_AGAINST_REPEATED_FAILED_LOGIN_WINDOWS.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Protect device against repeated failed-password attack at Windows logon' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Protect device against repeated failed-password attack at Windows logon'");
        }
    }

    public void SSOOption(String option) {
        try {
            logger.info("Attempting to select option in 'Automated Windows logon'");
            selectOptionProfilesPackages(ProfilesLocators.SSO_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Automated Windows logon' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Automated Windows logon'");
        }
    }

    public void SDCPOption(String option) {
        try {
            logger.info("Attempting to select option in 'Windows Login'");
            selectOptionProfilesPackages(ProfilesLocators.SDCP_OPTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Windows logon' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Windows Login'");
        }
    }

    public void userRestriction(String option) {
        try {
            logger.info("Attempting to select option in 'User Restriction'");
            selectOptionProfilesPackages(ProfilesLocators.USER_RESTRICTION.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'User Restriction' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'User Restriction'");
        }
    }

    public void windowsLogOnHandler(String option) {
        try {
            logger.info("Attempting to select option in 'Windows Logon handler'");
            selectOptionProfilesPackages(ProfilesLocators.WINDOWS_LOGON_HANDLER.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Windows Logon handler' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Windows Logon handler'");
        }
    }

    public void portControlFeature(String option) {
        try {
            logger.info("Attempting to select option in 'Port Control Feature'");
            selectOptionProfilesPackages(ProfilesLocators.PORT_CONTROL_FEATURE.getBy(),
                    ProfilesLocators.DROPDOWN_OPTION.getBy(option));
            logger.info("Selected '{}' in 'Port Control Feature' successfully", option);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Port Control Feature'");
        }
    }

    public void clientsSendMachineInfoToThisEmailIfNoCommToServer(String machineInfo) {
        try {
            logger.info("Attempting to select option in 'Clients send MachineInfo files to this Email Address if no communication to server'");
            input(ProfilesLocators.CLIENT_SEND_MACHINE_INFO_TO_THIS_EMAIL.getBy(), machineInfo);
            logger.info("Selected '{}' in 'Clients send MachineInfo files to this Email Address if no communication to server' successfully", machineInfo);
        } catch (Exception e) {
            logger.error("Error occurred when configuring 'Clients send MachineInfo files to this Email Address if no communication to server'");
        }
    }

}
