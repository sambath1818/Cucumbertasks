@tag
Feature: Add Customer Details
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User Should Launch The Browser
    And Click Add Customer Link
    When User Provide Vaild Details
      | fname   | sambath       |
      | lname   | kumar         |
      | email   | sam@gmail.com |
      | address | cbe           |
      | phoneno |     890123456 |
    Then To Verify Customer ID Displayed OR Not
