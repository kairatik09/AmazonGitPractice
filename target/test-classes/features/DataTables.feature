
@Smoke
Feature: Data Table practice


  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When user clicks on Foods
    Then user should see "250 best cafe"
    And user should find Sushi category
    When user click on Sushi
    Then user should see list of cafes
    And user should croll down the page to Arigato of Cafe
    When user click on Arigato
    Then user should see Arigato menu
    And user should find Kimchi
    When user increase the Kimchi amount to 3
    And user should click on Order button
    Then on the card user should see 450 S


    Scenario: Verify folloowing tabs are displayed in Amazon
      Given user is on "https://www.amazon.com/"
      Then following menu bar should be displayed on Home page
        | All | Today's Deal | Customer Service | Registry | Gift Cards | Sell |


    Scenario: Cars model
        Given is on Cars.kg
        Then following cars should be displayed
          | Bmw | Toyota | Lexus | Mers | Audi | Lada  | Tesla    |
          | 525 | camry  | ES    | e500 | 100  | Sedan | Model  S |


  Scenario: Test Dry rum
    Given dry run is bla bla
    Then  I get bla bla bla



