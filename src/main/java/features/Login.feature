@LoginFeatureTest
Feature: payever.com

  @loginSuccessfull
  @regression
  Scenario: Log In Log Out flow with a valid account
    Given As a user i navigate to https://commerceos.payever.org/entry/login Login Page
    When On SignIn Page I enter email as jondoe@mail.com and password as JonDoe12* and login
    Then User Profile is displayed for selection
    When Click on User Profile Icon
    Then User Profile page is opened
    And Click on Logout