package com.janitri.tests;

import com.janitri.base.BaseTest;
import com.janitri.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldsAreEmpty() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.clearEmail();
        Thread.sleep(2000); // Wait to observe clearing
        login.clearPassword();
        Thread.sleep(2000); // Wait to observe clearing
        Assert.assertFalse(login.isLoginButtonEnabled(), "Login button should be disabled when fields are empty");
    }

    @Test
    public void testInvalidLoginShowsErrorMessage() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.enterEmail("rajshish333@gmail.com");
        Thread.sleep(1500); // Observe typing email
        login.enterPassword("IcandoAnything123");
        Thread.sleep(1500); // Observe typing password
        login.clickLogin();
        Thread.sleep(4000); // Wait to observe error message
        String error = login.getErrorMessage();
        Thread.sleep(2000); // Wait to observe error message
        Assert.assertTrue(error.contains("Invalid") || error.length() > 0, "Error message not shown");
    }

    @Test
    public void testPasswordMaskedToggle() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.enterPassword("IcandoAnything123");
        Thread.sleep(2000); // Observe password typing
        login.clickEyeIcon();
        Thread.sleep(2000); // Observe toggle action
        Assert.assertTrue(login.isPasswordVisible(), "Password is still masked");
    }

    
}
