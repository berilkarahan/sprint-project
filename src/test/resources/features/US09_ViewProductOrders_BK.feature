Feature: As a Point of Sale manager (POS), I should be able to view product orders

  @wip-bk
  Scenario Outline:
    Given user login "<username>" and "<password>"
    When user click Point of Sale option
    And on the Dashboard user clicks orders
    Then all the orders should be checked
    Then action dropdown and it's three options should be displayed "Import" "Export" "Delete"
    Examples:
      | username               | password   |
      | posmanager8@info.com   | posmanager |
      | posmanager100@info.com | posmanager |
      | posmanager145@info.com | posmanager |







