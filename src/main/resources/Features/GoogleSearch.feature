Feature: Searching "Bangladesh" on www.google.com
  Scenario: Open google search engine and check with specific search
    Given Browser is open
    And user is on google search page
    When user enters text in the search field
    And Hit enter
    Then user will be navigated to search result page