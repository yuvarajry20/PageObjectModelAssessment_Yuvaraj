package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPurchasePage {
	@FindBy(xpath="//span[text()='My Account']")
	public WebElement MyAccount;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	public WebElement LoginLink;
	
	@FindBy(id="input-email")
	public WebElement Email;
	
	@FindBy(id="input-password")
	public WebElement Password;
	
	@FindBy(xpath="//input[@class=\"btn btn-primary\"]")
	public WebElement Login;
	
	@FindBy(name="search")
	public WebElement search;
	
	@FindBy(xpath="//button[@class=\"btn btn-default btn-lg\"]")
	public WebElement searchButton;
	
	@FindBy(xpath="//span[text()=\"Add to Cart\"]")
	public WebElement AddtoCart;
	
	@FindBy(id="button-cart")
	public WebElement buttonCart;
	
	@FindBy(id="cart-total")
	public WebElement cardTotal;
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]")
	public WebElement checkout;
	
	@FindBy(id="button-payment-address")
	public WebElement continuee;
	
	@FindBy(id="button-shipping-address")
	public WebElement shippingcontinue;
	
	@FindBy(id="button-shipping-method")
	public WebElement shippingmethodcontinue;
	
	@FindBy(name="agree")
	public WebElement terms;
	
	@FindBy(id="button-payment-method")
	public WebElement paymentcontinue;
	
	@FindBy(id="button-confirm")
	public WebElement confirmorder;
	
	
}
