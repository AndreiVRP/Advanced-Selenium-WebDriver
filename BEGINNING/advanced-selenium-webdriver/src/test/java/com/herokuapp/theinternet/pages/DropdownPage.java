package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;

public class DropdownPage extends BasePage{

    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectOption(Integer index) {
        WebElement dropdownElement = find(dropdown);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
//        dropdown.selectByValue(index.toString());
//        dropdown.deselectByVisibleText("Option " + index);
    }

    public String getSelectedOption() {
        WebElement dropdownElement = find(dropdown);
        Select dropdown = new Select(dropdownElement);
        return dropdown.getFirstSelectedOption().getText();
    }
}
