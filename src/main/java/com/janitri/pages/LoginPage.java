package com.janitri.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "email")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    WebElement loginButton;

    @FindBy(css = ".passowrd-visible") 
    WebElement passwordEyeIcon;

    @FindBy(css = ".normal-text") 
    WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void clearEmail() {
        emailInput.clear();
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clearPassword() {
        passwordInput.clear();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isLoginButtonEnabled() {
        return loginButton.isEnabled();
    }

    public void clickEyeIcon() {
        passwordEyeIcon.click();
    }

    public boolean isPasswordVisible() {
        return passwordInput.getAttribute("type").equals("text");
    }

    

    public String getErrorMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(errorMessage));
            return errorMessage.getText();
        } catch (TimeoutException e) {
            return "";
        }
    }
}
