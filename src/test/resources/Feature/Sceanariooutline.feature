@tag
Feature: Add Customers Details
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Generate an Customer Id
    Given User Should Launch The Browser
    And Click Add Customer Link
    When User Provide Vaild Details "<fname>","<lname>","<email>","<address>","<phoneno>"
    Then To Verify Customer ID Displayed OR Not

    Examples: 
      | fname   | lname | email         | address | phoneno  |
      | sambath | kumar | sam@gmail.com | cbe     | 96123456 |
      | kavin   | raj   | raj@gmail.com | pondy   | 98123456 |
      | venkat  | guru  | sam@gmail.com | chennai | 73123456 |
