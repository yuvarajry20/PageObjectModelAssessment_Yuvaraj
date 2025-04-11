package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	@FindBy(xpath="//span[text()='My Account']")
	public WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	public WebElement Register;
	
	@FindBy(id="input-firstname")
	public WebElement FirstName;
	
	@FindBy(id="input-lastname")
	public WebElement LastName;
	
	@FindBy(id="input-email")
	public WebElement Email;
	
	@FindBy(id="input-telephone")
	public WebElement Telephone;
	
	@FindBy(id="input-password")
	public WebElement Password;
	
	@FindBy(id="input-confirm")
	public  WebElement PasswordConfirm;
	
	@FindBy(name="agree")
	public WebElement Terms;
	
	@FindBy(xpath="//input[@class=\"btn btn-primary\"]")
	public WebElement continues;
}
