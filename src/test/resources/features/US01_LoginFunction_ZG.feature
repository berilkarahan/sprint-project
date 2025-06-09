@login
Feature: Users should be able to login


  #@wip
  Scenario: POS manager logs in with valid credentials
    When user logs in with username as "posmanager6@info.com" and password as "posmanager"
    #And clicks the login button
    Then user should see the dashboard page


  @wip
  Scenario: POS manager logs in with valid credentials
    When user logs in with username as "posmanager6@info.com" and password as "posmanager"
    #And clicks the login button
    #Then user should see the dashboard page



