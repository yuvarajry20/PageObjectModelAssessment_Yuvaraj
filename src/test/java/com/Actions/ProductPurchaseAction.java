package com.Actions;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.ProductPurchasePage;
import com.Utilities.HelperClass;

public class ProductPurchaseAction {

    ProductPurchasePage productPurchasePage;
    WebDriver driver=HelperClass.getDriver();
    public ProductPurchaseAction() {
        this.productPurchasePage = new ProductPurchasePage();
        PageFactory.initElements(HelperClass.getDriver(), productPurchasePage);
    }

    public void navigateToLoginPage() {
        productPurchasePage.MyAccount.click();
        productPurchasePage.LoginLink.click();
    }


    public void clickLoginButton() {
        productPurchasePage.Login.click();
    }

    public void searchProduct(String productName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchElement = wait.until(ExpectedConditions.visibilityOf(productPurchasePage.search));
        searchElement.clear();
        searchElement.sendKeys(productName);
    }

    public void clickSearchButton() {
        productPurchasePage.searchButton.click();
    }

    public void addToCart() {
        productPurchasePage.AddtoCart.click();
        productPurchasePage.buttonCart.click();
    }

    public void checkout() {
        productPurchasePage.cardTotal.click();
        productPurchasePage.checkout.click();
    }

    public void continueDeliveryDetails() {
        productPurchasePage.continuee.click();
    }

    public void continueDeliveryMethod() {
        productPurchasePage.shippingcontinue.click();
    }

    public void agreeTermsAndContinue() {
        productPurchasePage.terms.click();
        productPurchasePage.paymentcontinue.click();
    }

    public void confirmOrder() {
        productPurchasePage.confirmorder.click();
    }
}