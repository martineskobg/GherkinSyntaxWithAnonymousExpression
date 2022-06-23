#Martin Bachev
Feature: Login form test
  Description: The purpose of this file is to test web Login form.

  Rule: Successful login
    Scenario Outline: Successful login of all type of users
      Given Correct username and password
      And User is an "<type_of_User>"
      When I Click on login button
      Then I should see "Successful login!" message

      Examples:
        | type_of_User |
        | Admin        |
        | Ordinary     |

  Rule: Unsuccessful login if one of the required fields is incorrect

    Scenario Outline: Unsuccessful login of all type of users
      Given Incorrect "<incorrect_input>" field
      When I Click on login button
      Then I should see "Wrong username or password!" message

      Examples:
        | incorrect_input |
        | wrong_password  |
        | wrong_username  |
        | wrong_email     |
