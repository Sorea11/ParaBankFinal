@UI @Run
Feature: Add new user

  Scenario Outline: Add new user to our website
    Given User navigate to the website homepage
    And User give <userName>
    And User insert <pass>

    Examples:
      | userName |pass|
      | sorinus  |123 |
      | darius   |123 |