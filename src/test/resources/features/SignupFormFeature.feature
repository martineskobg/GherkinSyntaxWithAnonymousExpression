#Martin Bachev
@signup
Feature: Signup form test
  Description: The purpose of this file is to test web Signup form.
  The Signup form has 5 mandatory fields and one optional field.

  Rule: Use correct User data only
    Background:
      Given Correct user data

    @SuccessfulSignup
    Scenario: Signup with correct user data
      When I fill in only the required fields
      And I Click on submit button
      Then I have to receive confirmation email

    @SuccessfulSignup
    Scenario: Signup with correct user data and optional text field
      And Optional dummy text field with
      """
      It is a long established fact that a reader will
      be distracted by the readable content of a page when
      looking at its layout. The point of using Lorem Ipsum is
      that it has a more-or-less normal distribution of letters,
      as opposed to using 'Content here, content here',
      """
      When I fill in all fields
      And I Click on submit button
      Then I have to receive confirmation email

  Rule: One of the required fields should be incorrect
    @UnsuccessfulSignup
    Scenario Outline: When one of required fields is incorrect
      Given Incorrect "<incorrect_input_field>"
      When I Click on submit button
      Then I can see "Incorrect username" message
      But I should not receive confirmation email
      Examples:
        | incorrect_input_field |
        | username              |
        | password              |
        | email                 |