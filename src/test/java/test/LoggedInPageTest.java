package test;

import base.BaseTest;
import com.practicetestautomation.LoggedInPage;
import com.practicetestautomation.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggedInPageTest extends BaseTest {

    @Test
    public void testLoggedInPageMessage() {
        LoggedInPage loggedInPage = mainPage.logInApp("student", "Password123");
        Assert.assertTrue(loggedInPage.isLoggedInMessageDisplayed(), "\n Logged In Message Is Not Displayed \n");
    }
}
