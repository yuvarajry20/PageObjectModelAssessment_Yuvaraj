package com.Definitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Actions.LoginAction;
import com.Actions.ProductPurchaseAction;
import com.Actions.RegisterAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	RegisterAction registerAction=new RegisterAction();
	LoginAction loginAction=new LoginAction();
	ProductPurchaseAction productPurchaseAction=new ProductPurchaseAction();
	WebDriver driver=HelperClass.getDriver();
	@Given("I am in the TutorialsNinja Website")
	public void i_am_in_the_tutorials_ninja_website() {
	    // Write code here that turns the phrase above into concrete actions
	    HelperClass.openPage("https://tutorialsninja.com/demo/");
	}

	@Given("click the My Account section and click the Register button")
	public void click_the_my_account_section_and_click_the_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		registerAction.navigateToRegisterPage();
	}

	@When("i provide the firstname, lastname, email, telephone, password, passwordConfirm")
	public void i_provide_the_firstname_lastname_email_telephone_password_password_confirm(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> rows = dataTable.asMaps();
		String firstName = rows.get(0).get("firstname");
        String lastName = rows.get(0).get("lastname");
        String email = rows.get(0).get("email");
        String telephone = rows.get(0).get("telephone");
        String password = rows.get(0).get("password");
        String passwordConfirm = rows.get(0).get("passwordConfirm");

        registerAction.fillRegistrationForm(firstName, lastName, email, telephone, password, passwordConfirm);
	}

	@When("i click the privacy policy and click the continue")
	public void i_click_the_privacy_policy_and_click_the_continue() {
	    // Write code here that turns the phrase above into concrete actions
		registerAction.submitRegistration();
	}

	@Then("I should see the Registered successfully result")
	public void i_should_see_the_registered_successfully_result() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Your Account Has Been Created!']")));
	    String expected="Your Account Has Been Created!";
	    String actual=text.getText();
	    Assert.assertEquals(actual, expected);
	    
	}
	
	@Given("click the My Account section and click the Login button")
	public void click_the_my_account_section_and_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    loginAction.navigateToLoginPage();
	}

	@When("i provide the {string}, {string}")
	public void i_provide_the(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		loginAction.provideEmailAndPassword(email, password);
	}

	@When("i click the login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginAction.clickLoginButton();
	}

	@Then("I validate the {string}")
	public void i_validate_the(String result) {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    if(result.equals("Logout")) {
	    	WebElement logout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"list-group-item\"][text()=\"Logout\"]")));
	    	String expected=result;
	    	String actual=logout.getText();
	    	assertEquals(actual, expected);
	    }else {
	    	WebElement error=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")));
	    	String expected=result;
	    	String actual=error.getText();
	    	assertEquals(actual, expected);
	    }
	}
	
	@Then("i search the product HP LP3065 in the search bar")
	public void i_search_the_product_hp_lp3065_in_the_search_bar() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.searchProduct("HP LP3065");
	}

	@Then("i click search button")
	public void i_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.clickSearchButton();
	}

	@Then("i click the product to add to cart and again a add to cart button")
	public void i_click_the_product_to_add_to_cart_and_again_a_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.addToCart();
	}

	@Then("i click the shopping cart button and i click checkout")
	public void i_click_the_shopping_cart_button_and_i_click_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.checkout();
	}
	@Then("i click the continue for delivery details")
	public void i_click_the_continue_for_delivery_details() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.continueDeliveryDetails();
	}

	@Then("i click continue in delivery method")
	public void i_click_continue_in_delivery_method() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.continueDeliveryMethod();
	}

	@Then("i click Terms and click Continue")
	public void i_click_terms_and_click_continue() {
	    // Write code here that turns the phrase above into concrete actions
		productPurchaseAction.agreeTermsAndContinue();
	}

	@Then("i click Confirm order")
	public void i_click_confirm_order() {
	    // Write code here that turns the phrase above into concrete actions
		 productPurchaseAction.confirmOrder();
	}

	@Then("i validate the result")
	public void i_validate_the_result() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=\"Your order has been placed!\"]")));
	    String expected=result.getText();
	    String actual="Your order has been placed!";
	    assertEquals(actual, expected);
	}
}
