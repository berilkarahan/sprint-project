Feature: Inventory Management
  As a PosManager
  I want to add new products to the inventory
  So that they are available for sale

  @sami
  Scenario Outline: Add a new product to the inventory
    Given The user logs in using "<username>" and "<password>"
    And The user navigate to the Inventory page
    And The user navigate to the product page
    And The user click on the Create button
    And User enter valid product information
    And User click on the save button
    #Then User should see the new product in the inventory list


    Examples:
      | username               | password   |
      | posmanager5@info.com   | posmanager |
      | posmanager60@info.com  | posmanager |
      | posmanager125@info.com | posmanager |

