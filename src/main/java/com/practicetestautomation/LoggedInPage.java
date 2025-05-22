package com.practicetestautomation;

import base.BasePage;
import org.openqa.selenium.By;

public class LoggedInPage extends BasePage {
    private By successMessage = By.xpath("//p/strong[text()='Congratulations student. You successfully logged in!']");

    public boolean isLoggedInMessageDisplayed() {
        return find(successMessage).isDisplayed();
    }
}
