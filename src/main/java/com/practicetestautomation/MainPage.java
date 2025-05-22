package com.practicetestautomation;

import base.BasePage;
import org.openqa.selenium.By;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.JavaScriptUtility.clickJS;

public class MainPage extends BasePage {

    private By usernameBox = By.id("username");
    private By passwordBox = By.id("password");
    private By submitButton = By.id("submit");
    private By errorMessage = By.id("error");

    public void setUsername(String username) {
        set(usernameBox, username);
    }

    public void setPassword(String password) {
        set(passwordBox, password);
    }

    public LoggedInPage clickSubmit() {
        scrollToElementJS(submitButton);
        clickJS(submitButton);
        return new LoggedInPage();
    }

    public LoggedInPage logInApp(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickSubmit();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
