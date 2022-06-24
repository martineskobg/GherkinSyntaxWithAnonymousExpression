#Martin Bachev
@students
Feature: Test List of Student names
  Description: Will demonstrate how can take data from Data Table
  and use it.

  Scenario: Print Student names
    Given Student names as Data Table
      | Student Name           |
      | Georgy Vlaykov         |
      | Anton Rusanov          |
      | Georgi Raychev         |
      | Hyulya Gyuler          |
      | Iliana Markova         |
      | Martin Bachev          |
      | Nikola Chuchukov       |
      | Petya Yaneva-Tsvetkova |
      | Viktor Andonov         |
      | Emil Bizkov            |
      | Velko Kapitanov        |
    When I print all names from the data table
    Then I should see all names
