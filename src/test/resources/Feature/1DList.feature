@tag
Feature: Add Customer Details
  I want to use this template for my feature file

  @tag1
  Scenario: Generate Customer Id
    Given User Should Launch The Browser
    And Click Add Customer Link
    When User Provide Vaild Details
      | sambath | kumar | sam@gmail.com | cbe | 96123456 |
    Then To Verify Customer ID Displayed OR Not
