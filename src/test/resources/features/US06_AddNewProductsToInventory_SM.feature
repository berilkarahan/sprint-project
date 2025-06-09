Feature: Inventory Management
  As a PosManager
  I want to add new products to the inventory
  So that they are available for sale

  @wip
  Scenario: Add a new product to the inventory
    Given The user is on the login page
    And The user navigate to the Inventory page
    Then The user navigate to the product page