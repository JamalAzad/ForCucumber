Feature: Feature to test login functionality
  @STest
  Scenario: Check login is successful with valid credentials
    Given user is in login page
    When user enters username and password
    And click on login button
    Then user is navigated to Home Page

