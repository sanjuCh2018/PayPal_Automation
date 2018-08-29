Feature: Verify the Pay Pal getway with invalid credentials

  @automated @Feature @sanity
  Scenario: Verify the Pay Pal login credentials
    Given I enter valid email stuti.chourasia@gmail.com and valid password hello@1234
    Then I find the Pay Pal account holder