#Martin Bachev
Feature: Signup form test
  Description: The purpose of this file is to test web Signup form.
  The Signup form has 5 mandatory fields and one optional field.

  Rule: Use correct User data only
    Background:
      Given Correct user data

    Scenario: Signup with correct user data
      When I fill in all required fields
      And I Click on submit button
      Then I have to receive confirmation email

    Scenario: Signup with correct user data and optional text field
      And Optional dummy text field with
      """
      It is a long established fact that a reader will
      be distracted by the readable content of a page when
      looking at its layout. The point of using Lorem Ipsum is
      that it has a more-or-less normal distribution of letters,
      as opposed to using 'Content here, content here',
      """
      When I fill in all required fields
      And I fill in the optional field
      And I Click on submit button
      Then I have to receive confirmation email

  Rule: One of the required fields should be incorrect
    Scenario: If username is incorrect
      Given Incorrect username
      And Correct password and email
      When I Click on submit button
      Then I can see "Incorrect username" message

