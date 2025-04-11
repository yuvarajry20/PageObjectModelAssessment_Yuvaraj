package com.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pages.LoginPage;
import com.Utilities.HelperClass;

public class LoginAction {

    LoginPage loginPage;

    public LoginAction() {
        this.loginPage = new LoginPage();
        PageFactory.initElements(HelperClass.getDriver(), loginPage);
    }

    public void navigateToLoginPage() {
        loginPage.MyAccount.click();
        loginPage.LoginLink.click();
    }

    public void provideEmailAndPassword(String email, String password) {
        loginPage.Email.sendKeys(email);
        loginPage.Password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginPage.Login.click();
    }
}
