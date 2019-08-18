package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class LoginPage extends BasePage {

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.name("password");
    private By logInButtonLocator = By.tagName("button");
    private By errorMessageLocator = By.id("flash");

    public LoginPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public SecureAreaPage logIn(String username, String password) {
        log.info(String.format("Logging with username %s and password %s", username, password));
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
        return new SecureAreaPage(driver, log);
    }

    public void negativelogIn(String username, String password) {
        log.info(String.format("Trying to log in with incorrect username %s and password %s", username, password));
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
    }

    public void waitForErrorMessage() {
        waitForVisibilityOf(errorMessageLocator, 5);
    }

    public String getErrorMessageText() {
        return find(errorMessageLocator).getText();
    }
}
