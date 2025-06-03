@login
Feature: Users should be able to login

  Background: User is already in the login page
    Given The user is on the login page

  @wip
  Scenario: POS manager logs in with valid credentials
    When user logs in with username as "POS_manager_username" and password as "POS_manager_password"
    #And clicks the login button
    Then user should see the dashboard page






