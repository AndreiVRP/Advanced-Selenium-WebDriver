package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

    private String pageURL = "http://the-internet.herokuapp.com/";
    private By formAuthenticatorLinkLocator = By.linkText("Form Authenticaton");
    public WelcomePageObject(WebDriver driver, Logger log) {
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
}
