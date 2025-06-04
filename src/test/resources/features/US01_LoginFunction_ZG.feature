@login
Feature: Users should be able to login

  Background: User is already in the login page
    Given The user is on the login page

  #@wip
  Scenario: POS manager logs in with valid credentials
    When user logs in with username as "posmanager6@info.com" and password as "posmanager"
    #And clicks the login button
    Then user should see the dashboard page


  @wip
  Scenario Outline: POS manager logs in with valid credentials
    When user logs in with username as "<username>" and password as "<password>"
    #And clicks the login button
    #Then user should see the dashboard page


    Examples:
    |username|password|
    |posmanager6@info.com|posmanager|
    |posmanager16@info.com|posmanager|
    |posmanager61@info.com|posmanager|
    |posmanager43@info.com|posmanager|
    |posmanager123@info.com|posmanager|
    |salesmanager6@info.com|salesmanager|
    |salesmanager15@info.com|salesmanager|
    |salesmanager55@info.com|salesmanager|

