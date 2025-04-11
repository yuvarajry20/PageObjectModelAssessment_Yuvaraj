package com.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pages.RegisterPage;
import com.Utilities.HelperClass;

public class RegisterAction {

    RegisterPage registerPage;

    public RegisterAction() {
        this.registerPage = new RegisterPage();
        PageFactory.initElements(HelperClass.getDriver(), registerPage);
    }

    public void navigateToRegisterPage() {
        registerPage.MyAccount.click();
        registerPage.Register.click();
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String telephone, String password,String ConfirmPassword ) {
        registerPage.FirstName.sendKeys(firstName);
        registerPage.LastName.sendKeys(lastName);
        registerPage.Email.sendKeys(email);
        registerPage.Telephone.sendKeys(telephone);
        registerPage.Password.sendKeys(password);
        registerPage.PasswordConfirm.sendKeys(ConfirmPassword);
        registerPage.Terms.click();
    }

    public void submitRegistration() {
        registerPage.continues.click();
    }
}
