
@Smoke
Feature: Login functionality
 # here we would write the feature to be tested
 # We create one feature file per feature(functionality)


  #Gherkin --->
  Background: User is on Facebook
    Given User is logged in to https://www.facebook.com/

@Regression
  Scenario: Verify user can login with valid credentials
    # Given steps are used for precondition
    Given User is logged in to https://www.facebook.com/
    # When Action
    When User enter test@test.com to email field
    # And
    And User should enter Hello12345 in password input field
    And User should click on Log In button
    # Then Validation
    Then User should successfully logged in to the Facebook

@E2E
    Scenario: Verify user can login with invalid login and valid password
      Given User is logged in to https://www.facebook.com/
      When User enter test@test.com to email field
      And User should enter Hello312 in password input field
      And User should click on Log In button
      Then User should be not able to login to Facebook.com

    Scenario: Verify user is not able to login with invalid email and valid password
      Given User is logged in to https://www.facebook.com/
      When User enter test123@test.com to email field
      And User should enter Hello1234 in password input field
      And User should click on Log In button
      Then User should be not able to login to Facebook.com





