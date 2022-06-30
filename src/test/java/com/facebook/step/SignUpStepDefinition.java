package com.facebook.step;

import com.facebook.pages.SignUpPage;

import io.cucumber.java.en.When;

public class SignUpStepDefinition {
	
	SignUpPage signUp=new SignUpPage();
	
	@When("user enter firstname (.*)$")
	public void user_enter_firstname_ravi(String firstName) {
		signUp.firstName(firstName);
	}

	@When("user enter lastname (.*)$")
	public void user_enter_lastname_kumar(String lastName) {
		signUp.lastName(lastName);

	}
}

