package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
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
}
