package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemoSteps {



    @Given("User is logged in to https:\\/\\/www.facebook.com\\/")
    public void user_is_logged_in_to_https_www_facebook_com() {

    }

    @When("User enter test@test.com to email field")
    public void user_enter_test_test_com_to_email_field() {
        System.out.println("User entered test@test.com to email input field");
        
        
    }

    @When("User should enter Hello12345 in password input field")
    public void user_should_enter_hello12345_in_password_input_field() {
        System.out.println("User entered Hello123 to password input field");
        
    }

    @When("User should click on Log In button")
    public void user_should_click_on_log_in_button() {
        System.out.println("Clicked Log in button");

    }

    @Then("User should successfully logged in to the Facebook")
    public void user_should_successfully_logged_in_to_the_facebook() {
        System.out.println("User successfully Logged in to FB");

    }

    @When("User should enter Hello312 in password input field")
    public void user_should_enter_hello312_in_password_input_field() {
        System.out.println("");
    }

    @Then("User should be not able to login to Facebook.com")
    public void user_should_be_not_able_to_login_to_facebook_com() {
        System.out.println();
    }


    @When("User enter test123@test.com to email field")
    public void user_enter_test123_test_com_to_email_field() {



    }
    @When("User should enter Hello1234 in password input field")
    public void user_should_enter_hello1234_in_password_input_field() {

    }

}
