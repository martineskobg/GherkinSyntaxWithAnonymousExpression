#Martin Bachev
Feature: List of credentials
  Description:

  Scenario: Print users credentials
    Given users credentials
      | username         | password  |
      | user_1@gmail.com | 12345     |
      | user_2@yahoo.com | SECRET123 |
      | user_3@abv.bg    | 0000000   |
    When I print user credentials
    Then I should see all user credentials on the console