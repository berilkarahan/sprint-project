Feature: Inventory Management
  As a PosManager
  I want to add new products to the inventory
  So that they are available for sale

  @sami
  Scenario Outline: Add a new product to the inventory
    Given The user logs in using "<username>" and "<password>"
    And The user navigate to the Inventory page
    Then The user navigate to the product page


    Examples:
      | username               | password   |
      | posmanager5@info.com   | posmanager |
      | posmanager60@info.com  | posmanager |
      | posmanager125@info.com | posmanager |