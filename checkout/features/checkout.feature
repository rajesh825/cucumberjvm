Feature: Checkout
  Scenario Outline: Checout a banana
    Given the price of a "banana" is 40c
    When I checkout <count> "banana"
    And I checkout <count> "banana"
    Then the total price should be <total>c

  Examples:
  | count  |    total |
  | 1      |    40    |
  | 2      |    80    |


