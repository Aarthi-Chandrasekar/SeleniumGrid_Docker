Feature: Login page test

  Background:
    Given the homepage is open

  Scenario Outline: As a Registered user,I can log in
    Given the Username is filled with '<users>'
    And the Password is filled with '<password>'
    When the login button is clicked

    Examples:
      | users  | password |
      |  standard_user | secret_sauce |