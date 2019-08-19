package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class WelcomePage extends BasePage {

    private String pageURL = "http://the-internet.herokuapp.com/";
    private By formAuthenticatorLinkLocator = By.linkText("Form Authentication");
    private By checkboxLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By jsAlertLinkLocator = By.linkText("JavaScript Alerts");
    private By multipleWindowsLinkLocator = By.linkText("Multiple Windows");
    private By editorLinkLocator = By.linkText("WYSIWYG Editor");

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageURL);
        openUrl(pageURL);
        log.info("Page opened! ");
    }

    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking form auth link on welcome page");
        click(formAuthenticatorLinkLocator);
        return new LoginPage(driver, log);
    }

    public CheckboxPage clickCheckboxLink() {
        log.info("Clicking checkbox link on welcome page");
        click(checkboxLinkLocator);
        return new CheckboxPage(driver, log);
    }

    public DropdownPage clickDropdownLink() {
        log.info("Clicking dropdown link on welcome page");
        click(dropdownLinkLocator);
        return new DropdownPage(driver, log);
    }

    public JavaScriptAlertPage clickJSAlertLink() {
        log.info("Clicking js alert link on welcome page");
        click(jsAlertLinkLocator);
        return new JavaScriptAlertPage(driver, log);
    }

    public WindowsPage clickMultipleWindowsLink() {
        log.info("Clicking Multiple Windows link on Welcome Page");
        click(multipleWindowsLinkLocator);
        return new WindowsPage(driver, log);
    }

    public EditorPage clickWYSIWYGEditorLink() {
        log.info("Clicking WYSIWYG Editor link on Welcome Page");
        click(editorLinkLocator);
        return new EditorPage(driver, log);
    }

}
