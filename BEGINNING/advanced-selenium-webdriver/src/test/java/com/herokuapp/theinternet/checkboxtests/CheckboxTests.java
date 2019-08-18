package com.herokuapp.theinternet.checkboxtests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTests extends TestUtilities {

    @Test
    public void selectTwoCheckboxes() {
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        CheckboxPage checkboxPage = welcomePage.clickCheckboxLink();
        checkboxPage.selectAllCheckboxes();
        Assert.assertTrue(checkboxPage.areAllCheckboxesSelected(), "Not all of the checkboxes are checked");
        sleep(2000);

    }
}
