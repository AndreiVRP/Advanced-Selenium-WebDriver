package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;

public class CheckboxPage extends BasePage {

    private By checkbox = By.xpath("//input[@type='checkbox']");

    public CheckboxPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectAllCheckboxes() {
        List<WebElement> checkboxes = findAll(checkbox);
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
               checkbox.click();
            }
        }
    }

    public boolean areAllCheckboxesSelected() {
        List<WebElement> checkboxes = findAll(checkbox);
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
               return false;
            }
        }
        return true;
    }
}
