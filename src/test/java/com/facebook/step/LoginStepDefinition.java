package com.facebook.step;

import com.facebook.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinition extends LoginPage{
	
	LoginPage loginPage=new LoginPage();
	
	@Given("^User should be able to open facebook Application$")
	public void user_should_be_able_to_open_facebook_Application() throws Throwable {
		loginPage.openUrl();
	}

//	@When("^User enter Username$")                 //for simple feature file
//	public void user_enter_Username() throws Throwable {
//		loginPage.userName();
//	}
	
	//for parameterized file
	@When("^User enter Username (.*)$")
	public void user_enter_Username(String userName) throws Throwable {
		loginPage.username(userName);
	}

	@When("^User enter Password (.*)$")
	public void user_enter_Password(String password) throws Throwable {
		loginPage.password(password);
	}

	@When("^User click on Login  Button$")
	public void user_click_on_Login_Button() throws Throwable {
		loginPage.loginButon();
	}
	
	@When("^User click on confirm button$")
	public void user_click_on_confirm_button() throws Throwable {
		loginPage.ConfirmButon();
	}
	
	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		loginPage.verifyLogin();
	}

	@When("User click on create new account")
	public void user_click_on_create_new_account() throws Throwable {
		loginPage.createAccount();
	}

	@Then("User should be able to signup Successfully")
	public void user_should_be_able_to_signup_successfully() throws Throwable {
		loginPage.verifySignup();
	}
}
