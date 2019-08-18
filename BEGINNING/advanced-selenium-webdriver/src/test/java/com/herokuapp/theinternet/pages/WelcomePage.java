package com.herokuapp.theinternet.pages;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

    private String pageURL = "http://the-internet.herokuapp.com/";
    private By formAuthenticatorLinkLocator = By.linkText("Form Authentication");
    private By checkboxLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");

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
}
