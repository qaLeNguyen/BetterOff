package common;

import object.common_object.CommonLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class BuiltInAction {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebDriverWait waitVisible;
    protected WebDriverWait waitClickable;
    protected JavascriptExecutor jsExecutor;
    protected Actions actions;
    protected Wait<WebDriver> fluentWait;

    private static final Logger logger = LogManager.getLogger(BuiltInAction.class);

    public BuiltInAction() {
        this.driver = WebDriverUtil.getDriver();
        this.wait = WebDriverUtil.getWait();
        this.waitVisible = WebDriverUtil.getWaitVisible();
        this.waitClickable = WebDriverUtil.getWaitClickable();
        this.fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);
        this.actions = new Actions(driver);
    }

    /**
     * Waits for an element to be visible and enabled using FluentWait.
     *
     * This method uses a FluentWait instance to repeatedly check if an element located by
     * the specified locator is both visible and enabled. It will wait up to the maximum
     * timeout specified in the FluentWait configuration, polling at intervals until the
     * conditions are met or the timeout expires.
     *
     * @param locator The By locator used to find the element on the web page. This can be
     *                an ID, CSS selector, XPath, or other locator strategies provided by
     *                Selenium.
     * @return The WebElement if it is found, visible, and enabled; null otherwise. If the
     *         element does not become visible and enabled within the timeout period, this
     *         method returns null.
     * @throws TimeoutException If the element is not found or does not become visible and
     *         enabled within the timeout period, a TimeoutException is thrown.
     * @throws Exception If any unexpected exception occurs during the wait process,
     *         it is logged and rethrown.
     */
    public WebElement fluentWait(By locator) {
        try {
            wait.until(webDriver -> {
                WebElement element = webDriver.findElement(locator);
                if (element != null && element.isDisplayed() && element.isEnabled()) {
                    return element;
                }
                return null;
            });
        } catch (Exception e) {
            logger.error("Exception occurred while using FluentWait for element located by {}: {}", locator, e.getMessage());
        }
        return null;
    }

    /**
     * Gets an Element and ensures it is visible. Usage: interact with WebElement by seeing it.
     *
     * @param locator Located by CSS|XPath
     */
    public WebElement getElementVisible(By locator) {
        try {
            logger.debug("Attempting to wait for element are visible");
            return waitVisible.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            logger.error("Error occurred when waiting for WebElement '{}' is visible", locator);
            throw e;
        }
    }

    /**
     * Gets an Element and ensures it are visible and clickable. Usage: interact with WebElement by clicking it.
     *
     * @param locator Located by CSS|XPath
     */
    public WebElement getElementClickable(By locator) {
        try {
            logger.debug("Attempting to wait for element are visible and clickable");
            return waitClickable.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            logger.error("Error occurred when waiting for WebElement '{}' are visible and clickable", locator);
            throw e;
        }
    }

    /**
     * Checks if an element exists on the page.
     *
     * @param locator The locator used to find the element
     * @return true if the element exists, false otherwise
     */
    public boolean isElementPresent(By locator) {
        try {
            logger.debug("Attempting to wait for element {} is displayed", locator);
            WebElement element = getElementVisible(locator);
            boolean isDisplayed = element.isDisplayed();
            if (isDisplayed) {
                logger.debug("Element found and is displayed: {}", locator);
            }
            return isDisplayed;
        } catch (NoSuchElementException e) {
            logger.debug("Element not found: {}", locator);
            return false;
        } catch (Exception e) {
            logger.error("An unexpected error occurred while checking for element: {}", locator, e);
            return false;
        }
    }

    /**
     * Checks if an element does not exist on the page.
     *
     * @param locator The locator used to find the element
     * @return true if the element does not exist, false otherwise
     */
    public boolean isElementNotPresent(By locator) {
        return !isElementPresent(locator);
    }

    /**
     * Click on an element that is expected to be visible and clickable.
     *
     * @param locator Locator for the element, typically identified by CSS or XPath
     */
    public void click(By locator) {
        try {
            logger.debug("Attempting to click element located by '{}'", locator);
            getElementClickable(locator).click();
            logger.debug("Clicked element: {}", locator);
        } catch (NoSuchElementException e) {
            logger.error("Element not found for locator: {}", locator, e);
        } catch (Exception e) {
            logger.error("An unexpected error occurred while clicking the element located by: {}", locator, e);
        }
    }

    /**
     * Attempt to click on an element with retries if the first attempt fails.
     *
     * @param locator    Locator for the element, identified by CSS or XPath
     * @param maxRetries Maximum number of retry attempts
     */
    public void clickWithRetry(By locator, int maxRetries) {
        int attempt = 0;
        while (attempt < maxRetries) {
            try {
                logger.debug("First-attempting to click element located by '{}'", locator);
                getElementClickable(locator).click();
                logger.debug("Clicked on element located by: {}", locator);
                return;
            } catch (NoSuchElementException e) {
                logger.debug("Element not found for locator: {}", locator, e);
            } catch (StaleElementReferenceException e) {
                logger.error("Stale element reference for locator: {}", locator, e);

            } catch (Exception e) {
                logger.error("An unexpected error occurred while clicking the element located by: {}", locator, e);
                break;
            }
            attempt++;
        }
        logger.error("Failed to click on element located by {} after {} attempts", locator, maxRetries);
    }

    /**
     * Inputs value into a specified field after clearing it.
     *
     * @param locator The locator used to find the input field
     * @param value   The text to input into the field
     */
    public void input(By locator, String value) {
        try {
            logger.debug("Attempting to input text '{}' into element located by '{}'", value, locator);
            WebElement element = getElementClickable(locator);
            element.clear();
            element.sendKeys(value);
            logger.debug("Input text '{}' into element located by '{}'", value, locator);
        } catch (NoSuchElementException e) {
            logger.error("Element located by '{}' not found", locator, e);
        } catch (StaleElementReferenceException e) {
            logger.error("Element located by '{}' is stale", locator, e);
        } catch (Exception e) {
            logger.error("Exception occurred while inputting text into element located by '{}'", locator, e);
        }
    }

    /**
     * Copies the value from the specified input field to the clipboard using JavaScript.
     *
     * @param locator The locator used to find the input field
     */
    public void copy(By locator) {
        executeJsCommand(locator, "arguments[0].select(); document.execCommand('copy');", "copy");
    }

    /**
     * Pastes the specified value into the input field using JavaScript.
     *
     * @param locator The locator used to find the input field
     * @param value   The text to paste into the field
     */
    public void paste(By locator, String value) {
        executeJsCommand(locator, "arguments[0].value = arguments[1];", "paste", value);
    }

    /**
     * Executes a JavaScript command on an input field and logs the result.
     *
     * @param locator The locator used to find the input field
     * @param script  The JavaScript code to execute
     * @param action  The action performed (e.g., "copy", "paste")
     * @param args    Additional arguments for the JavaScript code (optional)
     */
    private void executeJsCommand(By locator, String script, String action, Object... args) {
        try {
            WebElement element = driver.findElement(locator);

            if (element.getTagName().equals("input") || element.getTagName().equals("textarea")) {
                jsExecutor.executeScript(script, element, args);
                logger.debug("Successfully {} value in element located by '{}'", action, locator);
            } else {
                logger.warn("Element located by '{}' is not an input field or textarea", locator);
            }
        } catch (NoSuchElementException e) {
            logger.error("Element located by '{}' not found", locator, e);
        } catch (Exception e) {
            logger.error("Exception occurred while performing '{}' action on element located by '{}'", action, locator, e);
        }
    }

    /**
     * Replaces the value in a specified input field using JavaScript.
     *
     * @param locator The locator used to find the input field
     * @param value   The new value to be set in the field
     */
    public void modify(By locator, String value) {
        try {
            WebElement element = getElementClickable(locator);
            jsExecutor.executeScript("arguments[0].value = arguments[1];", element, value);
            logger.debug("Successfully replaced value with '{}' in element located by '{}'", value, locator);
        } catch (Exception e) {
            logger.error("Exception occurred while replacing value using JavaScript in element located by '{}'", locator, e);
        }
    }

    /**
     * Method to replace text in an input field.
     * @param locator The locator of the input field.
     * @param newValue The new value to enter into the input field.
     */
    public void replaceTextInField(By locator, String newValue) {
        WebElement inputField = driver.findElement(locator);
        inputField.click();
        inputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputField.sendKeys(newValue);
    }

    /**
     * Hovers over a specified element to display a dropdown or menu.
     *
     * @param locator The locator used to find the element to hover over
     */
    public void hoverOver(By locator) {
        try {
            logger.debug("Attempting to hover over element located by '{}'", locator);
            WebElement element = getElementClickable(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            logger.debug("Hovered over element located by '{}'", locator);
        } catch (NoSuchElementException e) {
            logger.error("Element located by '{}' not found", locator, e);
        } catch (Exception e) {
            logger.error("Exception occurred while hovering over element located by '{}'", locator, e);
        }
    }

    /**
     * Selects an item from the dropdown list.
     *
     * @param itemLocator The locator used to find the dropdown item to select
     */
    public void selectDropdownItem(By itemLocator) {
        try {
            logger.debug("Attempting to select item '{}' from the dropdown", itemLocator);
            WebElement item = getElementClickable(itemLocator);
            item.click();
            logger.debug("Selected item located by '{}'", itemLocator);
        } catch (NoSuchElementException e) {
            logger.error("Element located by '{}' not found", itemLocator, e);
        } catch (Exception e) {
            logger.error("Exception occurred while selecting item located by '{}'", itemLocator, e);
        }
    }

    /**
     * Selects an item from the dropdown list after hovering over the dropdown.
     *
     * @param dropdownLocator Locator for the dropdown element to hover over
     * @param itemLocator     Locator for the item to select from the dropdown list
     */
    public void hoverOverAndSelect(By dropdownLocator, By itemLocator) {
        hoverOver(dropdownLocator);
        try {
            WebElement item = getElementClickable(itemLocator);
            item.click();
            logger.debug("Selected item from dropdown located by '{}'", itemLocator);
        } catch (Exception e) {
            logger.error("Exception occurred while selecting item from dropdown", e);
        }
    }

    public void selectOptionProfilesPackages(By dropdownLocator, By itemLocator) {
        try {
            logger.debug("Attempt to find and select option '{}'", dropdownLocator);
            scrollToView(dropdownLocator);
            click(dropdownLocator);
            getElementVisible(itemLocator);
            getElementClickable(itemLocator);
            click(itemLocator);
            logger.info("Selected option {{}}",dropdownLocator);
        } catch (Exception e) {
            logger.error("Error occurred when selecting option in dropdown");
            throw e;
        }
    }



    /**
     * Scrolls to the specified element and brings it into view.
     *
     * @param locator The locator used to find the element to scroll to.
     */
    public void scrollToView(By locator) {
        try {
            WebElement element = getElementVisible(locator);
            if (element != null) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                logger.debug("Scrolled to element located by: {}", locator);
            } else {
                logger.error("Element not found for locator: {}", locator);
            }
        } catch (Exception e) {
            logger.error("Exception occurred while scrolling to the element: {}", e.getMessage());
        }
    }

    public boolean isSucceed() {
        boolean messageSucceed = isElementPresent(CommonLocators.OPERATION_SUCCEEDED_ALERT.getBy());
        if (messageSucceed) {
            logger.info("Operation succeeded and the success alert is displayed.");
        } else {
            logger.warn("Operation succeeded but the success alert is not displayed.");
        }
        return messageSucceed;
    }

    /**
     * Checks if a field is empty.
     *
     * This method waits for the field located by the given locator to be visible and retrieves
     * its value to check if it is empty.
     *
     * @param locator The By locator used to find the field on the web page
     * @param value   The attribute of WebElement
     * @return true if the field is empty; false otherwise
     */
    public boolean isFieldEmpty(By locator, String value) {
        try {
            String fieldValue = getElementVisible(locator).getAttribute(value);
            return fieldValue == null;
        } catch (Exception e) {
            logger.error("An error occurred while checking if the field is empty: {}", locator, e);
        }
        return true;
    }

    /**
     * Checks if a field is blank.
     *
     * This method waits for the field located by the given locator to be visible and retrieves
     * its value to check if it is blank (consists only of whitespace characters).
     *
     * @param locator The By locator used to find the field on the web page.
     * @param value   The attribute of WebElement to retrieve the value from (e.g., "value" for input fields).
     * @return true if the field is blank; false otherwise.
     */
    public boolean isFieldBlank(By locator, String value) {
        try {
            String fieldValue = getElementVisible(locator).getAttribute(value);
            return fieldValue == null || fieldValue.trim().isEmpty();
        } catch (Exception e) {
            logger.error("An error occurred while checking if the field is blank: {}", locator, e);
            return true;
        }
    }

    public void navigateToUsersPage() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Users";
            click(CommonLocators.SECUREDOC_LOGO.getBy());
            Assert.assertEquals(actualTitle, expectedTitle, "Page title 'Users' page does not match!");
            logger.info("Navigated to 'Users' page successfully");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Users' page");
        }
    }

    public void navigateToDevicesPage() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Devices";
            click(CommonLocators.SIDEBAR_DEVICES_PAGE.getBy());
            Assert.assertEquals(actualTitle, expectedTitle, "Page title of 'Devices' page does not match!");
            logger.info("Navigated to 'Devices page' successfully");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Devices page'");
        }
    }

    public void navigateToProfilesPage() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Profiles";
            click(CommonLocators.SIDEBAR_DEVICES_PAGE.getBy());
            Assert.assertEquals(actualTitle, expectedTitle, "Page title of 'Profiles' page does not match!");
            logger.info("Navigated to 'Profiles' page successfully");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Profiles' page");
        }
    }

    public void navigateToInstallationPackagesPage() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Installation packages";
            click(CommonLocators.SIDEBAR_PACKAGES_PAGE.getBy());
            Assert.assertEquals(actualTitle, expectedTitle, "Page title of 'Installation package' page does not match!");
            logger.info("Navigated to 'Installation packages' page successfully");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Installation packages' page");
        }
    }

    public void navigateToConfigurationPage() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Service Settings";
            click(CommonLocators.SIDEBAR_CONFIGURATION_PAGE.getBy());
            Assert.assertEquals(actualTitle, expectedTitle, "Page title of 'Configuration' page does not match!");
            logger.info("Navigated to 'Configuration' page successfully");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Configuration' page");
        }
    }

    public void navigateToAdminMgmtPage() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Administrator Management";
            click(CommonLocators.SIDEBAR_ADMIN_MANAGEMENT.getBy());
            Assert.assertEquals(actualTitle, expectedTitle, "Page title of 'Administrator Management' page does not match!");
            logger.info("Navigated to 'Administrator Management page' successfully");
        } catch (Exception e) {
            logger.error("Error occurred when navigating to 'Administrator Management page'");
        }
    }

}



































