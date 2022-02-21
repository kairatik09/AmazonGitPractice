Feature: BankApp

  Scenario: Account for User
    Given user should register to bank with following data
      | Account Number | Routing Number |
      | 123412341234   | 123432123      |
    Then user should be successfully register the  bank with following data
      | Account Number | Routing Number |
      | 123412341234   | 123432123      |