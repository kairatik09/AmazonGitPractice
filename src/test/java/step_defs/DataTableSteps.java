package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableSteps {



    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("User is on Namba food");
        
    }
    @When("user clicks on Foods")
    public void user_clicks_on_foods() {
        System.out.println("User clicked button");
        
    }
    @Then("user should find Sushi category")
    public void user_should_find_sushi_category() {
        System.out.println("User found Sushi");
        
    }
    @When("user click on Sushi")
    public void user_click_on_sushi() {
        System.out.println("User clicked on Sushi");
        
    }
    @Then("user should see list of cafes")
    public void user_should_see_list_of_cafes() {
        System.out.println("User see list of Cafes");

    }
    @Then("user should croll down the page to Arigato of Cafe")
    public void user_should_croll_down_the_page_to_arigato_of_cafe() {
        System.out.println("User scroll down to Arigato");
        
    }
    @When("user click on Arigato")
    public void user_click_on_arigato() {
        System.out.println("User clicked on Arigato");
        
    }
    @Then("user should see Arigato menu")
    public void user_should_see_arigato_menu() {
        System.out.println("User see Arigato menu");
        
    }
    @Then("user should find Kimchi")
    public void user_should_find_kimchi() {
        System.out.println("User found Kimchi");
        
    }
    @When("user increase the Kimchi amount to {int}")
    public void user_increase_the_kimchi_amount_to(Integer KimchiAmount) {
        System.out.println("User increased Kimchi amount to: " + KimchiAmount);
        
    }
    @When("user should click on Order button")
    public void user_should_click_on_order_button() {
        System.out.println("User clicked on Order button");
        
    }
    @Then("on the card user should see {int} S")
    public void on_the_card_user_should_see_s(Integer totalPriceAmount) {
        System.out.println("Total Price: " + totalPriceAmount);
        
    }

    /// Second Scenario
    @Given("user is on {string}")
    public void user_is_on(String URL) {
        System.out.println("User is on " + URL);
    }
    @Then("following menu bar should be displayed on Home page")
    public void following_menu_bar_should_be_displayed_on_home_page(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
        System.out.println(data.get(0).get(1));

    }



    @Given("is on Cars.kg")
    public void is_on_cars_kg() {

    }
    @Then("following cars should be displayed")
    public void following_cars_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        int bmw745 = Integer.parseInt(data.get(1).get(0));
        System.out.println(bmw745);

        int num = 5;
        String num1 = String.valueOf(num);
        System.out.println(num);
    }

}
