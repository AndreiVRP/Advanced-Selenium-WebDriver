package com.herokuapp.theinternet.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class JavaScriptAlertPage extends BasePage {

    private By clickForJSAlertButtonLocator = By.xpath("//button[text()='Click for JS Alert']");
    private By clickForJSConfirmButtonLocator = By.xpath("//button[text()='Click for JS Confirm']");
    private By clickForJSPromptButtonLocator = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultTextLocator = By.id("result");

    public JavaScriptAlertPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openJSAlert() {
        click(clickForJSAlertButtonLocator);
    }

    public void openJSConfirm() {
        click(clickForJSConfirmButtonLocator);
    }

    public void openJSPrompt() {
        click(clickForJSPromptButtonLocator);
    }

    public String getAlertText() {
        Alert alert = switchToAlert();
        String alertText = alert.getText();
        log.info("Alert says: " + alertText);
        return alertText;
    }

    public void acceptAlert() {
        log.info("Switching to alert and pressing OK");
        Alert alert = switchToAlert();
        alert.accept();
    }

    public void dismissAlert() {
        log.info("Switching to alert and pressing Cancel");
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public void typeTextIntoAlert(String text) {
        log.info("Typing text into alert and pressing OK");
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    public String getResultText() {
        String result = find(resultTextLocator).getText();
        log.info("Result text: " + result);
        return result;
    }
}
