package com.herokuapp.theinternet.alerttests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JavaScriptAlertPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class AlertTests extends TestUtilities {

    @Test
    public void jsAlertTest() {
        log.info("Starting jsAlertTest");

        // open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // Click on JavaScript Alerts link
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.clickJSAlertLink();

        // Click JS Alert button
        javaScriptAlertPage.openJSAlert();
        sleep(1000);

        // Get alert text
        String alertMessage = javaScriptAlertPage.getAlertText();

        // Click OK button
        javaScriptAlertPage.acceptAlert();

        // Get Results text
        String result = javaScriptAlertPage.getResultText();
        sleep(1000);
        // Verifications
        // 1 - Alert text is expected
        Assert.assertTrue(alertMessage.equals("I am a JS Alert"),
                "Alert message is not expected. \nShould be 'I am a JS Alert', but it is '" + alertMessage + "'");

        // 2 - Result text is expected
        Assert.assertTrue(result.equals("You successfuly clicked an alert"),
                "result is not expected. \nShould be 'You successfuly clicked an alert', but it is '" + result + "'");
    }

    @Test
    public void jsDismissTest() {
        log.info("Starting jsDismissTest");

        // open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // Click on JavaScript Alerts link
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.clickJSAlertLink();

        // Click JS Confirm button
        javaScriptAlertPage.openJSConfirm();
        sleep(1000);
        // Get alert text
        String alertMessage = javaScriptAlertPage.getAlertText();

        // Click Cancel button
        javaScriptAlertPage.dismissAlert();

        // Get Results text
        String result = javaScriptAlertPage.getResultText();
        sleep(1000);
        // Verifications
        // 1 - Alert text is expected
        Assert.assertTrue(alertMessage.equals("I am a JS Confirm"),
                "Alert message is not expected. \nShould be 'I am a JS Confirm', but it is '" + alertMessage + "'");

        // 2 - Result text is expected
        Assert.assertTrue(result.equals("You clicked: Cancel"),
                "result is not expected. \nShould be 'You clicked: Cancel', but it is '" + result + "'");
    }

    @Test
    public void jsPromptTest() {
        log.info("Starting jsDismissTest");

        // open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // Click on JavaScript Alerts link
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.clickJSAlertLink();

        // Click JS Prompt button
        javaScriptAlertPage.openJSPrompt();
        sleep(1000);
        // Get alert text
        String alertMessage = javaScriptAlertPage.getAlertText();

        // Type text into alert
        javaScriptAlertPage.typeTextIntoAlert("Hello Alert, it's Dmitry here");
        sleep(1000);
        // Get Results text
        String result = javaScriptAlertPage.getResultText();
        sleep(1000);
        // Verifications
        // 1 - Alert text is expected
        Assert.assertTrue(alertMessage.equals("I am a JS prompt"),
                "Alert message is not expected. \nShould be 'I am a JS prompt', but it is '" + alertMessage + "'");

        // 2 - Result text is expected
        Assert.assertTrue(result.equals("You entered: Hello Alert, it's Dmitry here"),
                "result is not expected. \nShould be 'You entered: Hello Alert, its Dmitry here', but it is '" + result
                        + "'");
    }
}
