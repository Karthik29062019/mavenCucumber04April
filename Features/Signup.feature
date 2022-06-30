@SignUpPage
Feature: SignupFeature
  I want to test signup functionality

  @SignupFunc
  Scenario Outline: SignUp Scenario
    Given User should be able to open facebook Application  
    When User click on create new account 
    And user enter firstname <firstname>
    And user enter lastname <lastname>
    Then User should be able to login successfully
   
   
    Examples:
   |firstname|lastname|
   |Bali     |Raj     |
   |Ravi     |Kumar   |
