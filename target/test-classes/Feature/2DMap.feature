@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User Launch Browser
    And Click Add Traiff Plan
    When User Provide Traffic Plan Details
      | rent | lmin | intermin | sms | min | intermin_char | sms_char |
      |  399 |  300 |       30 | 100 |  20 |            50 |      100 |
      |  198 |  150 |       60 | 100 |  30 |           100 |      120 |
    Then Verify Plan Sholuld be Added
