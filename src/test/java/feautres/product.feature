Feature: Adding and removing items in the cart

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the login button is clicked

  Scenario Outline: As a Logged in user,i can add and remove items in the shopping cart
    Given the First item '<label1>' is added to the cart
    
  Examples:
        | label1  | label2 |
        |  Sauce Labs Backpack | Sauce Labs Bolt T-Shirt |