package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginError() {
        mainPage.setUsername("student");
        mainPage.setPassword("Password124");
        mainPage.clickSubmit();
        String realErrorMessage = mainPage.getErrorMessage();
        System.out.println("Actual error message: " + realErrorMessage);
        Assert.assertTrue(realErrorMessage.contains("Your password is invalid!"));
    }
}