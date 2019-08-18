package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject {
    private WebDriver driver;
    private Logger log;

    private String pageURL = "http://the-internet.herokuapp.com/";
    private By formAuthenticatorLinkLocator = By.linkText("Form Authenticaton");
    public WelcomePageObject(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }

    public void openPage() {
        log.info("Opening page: " + pageURL);
        driver.get(pageURL);
        log.info("Page opened! ");
    }

    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking form auth link on welcome page");
        driver.findElement(formAuthenticatorLinkLocator).click();
        return new LoginPage(driver, log);
    }
}
