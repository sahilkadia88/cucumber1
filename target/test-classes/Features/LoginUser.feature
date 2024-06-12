Feature: Login Functionality

  Scenario Outline: Login with valid credentials
    Given User navigate to login page
    When User enters valid email address "dgujarati26@gmail.com" into email field
    And User enters valid password "Dhara123" into password field
    And User click on Login button
    And User click on logout button
    Then User should get successfully logged in

  Scenario Outline: Login with invalid credentials
    Given User navigate to login page
    When User enters valid email address "dgujarati26@gmailtt.com" into email field
    And User enters valid password "Dhara12345" into password field
    And User click on Login button
    And User click on logout button
    Then User should get proper warning massage about credentials

  Scenario Outline: Login with without credentials
    Given User navigate to login page
    When User enters valid email address "" into email field
    And User enters valid password "" into password field
    And User click on Login button
    And User click on logout button
    Then User should get proper warning massage about credentials
