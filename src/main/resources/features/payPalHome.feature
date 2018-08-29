Feature: Verify the Pay Pal application

  @automated @Feature @sanity
  Scenario: Verify the Pay Pal application web page title
    Given I enter valid email stuti.chourasia@gmail.com and valid password hello@123
    When I find the Pay Pal application web title
    Then I match the web title successfully

  @automated @Feature @sanity
  Scenario: Verify the Pay Pal login credentials
    Given I enter valid email stuti.chourasia@gmail.com and valid password hello@123
    Then I find the Pay Pal account holder