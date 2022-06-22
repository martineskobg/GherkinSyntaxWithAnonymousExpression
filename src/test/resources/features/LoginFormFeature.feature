#Martin Bachev
Feature: Login form test
  Description: The purpose of this file is to test web Login form.

  Rule: Successful login
    Background:
      Given Correct username and password
# The first example starts with Scenario:
    Scenario: Successful login of ordinary user
      And Ordinary user
      When I Click on login button
      Then I should see "Successful login!" message
      But I should not see the admin section

# The second example starts with Example
    Example: Successful login of admin user
      Given Admin user
      When I Click on login button
      Then I should see "Successful login!" message
      Then I can see the admin section

  Rule: Unsuccessful login

    Scenario Outline: Unsuccessful login of all type of users
      Given Incorrect <username> Or <password>
      And <type> user
      When I Click on login button
      Then I should see "Wrong username or password!" message

      Examples:
        | type     | username     | password           |
        | Admin    | correctAdmin | wrong_admin_pass   |
        | Admin    | wrongAdmin   | correct_admin_pass |
        | Ordinary | wrongUser    | correct_pass       |
        | Ordinary | correctUser  | wrong_pass         |
