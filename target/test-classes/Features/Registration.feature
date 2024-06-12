Feature: Registration Functionality

  Scenario Outline: Successful user registration 
    Given User navigate to Register page
    When User enters First Name  "Dhara" into First Name field
    And User enters Last Name  "Gujarati" into Last Name field
    And User enters Email  "dgujarati26@gmail.com" into Email field
    And User enters Telephone  "7600666677" into Telephone field
    And User enters Password  "Dhara123" into Password field
    And User enters Confirm Password "Dhara123" into Confirm Password field
    And User click on Subscribe radio button
    And User click on Policy checkbox
    And User click on Submit button
    And User click on Continue button
    Then User should get successfully Register

  Scenario Outline: Registration With same email
  
    Given User navigate to Register page
    When User enters First Name  "Dhara" into First Name field
    And User enters Last Name  "Gujarati" into Last Name field
    And User enters Email  "dgujarati26@gmail.com" into Email field
    And User enters Telephone  "7600666677" into Telephone field
    And User enters Password  "Dhara123" into Password field
    And User enters Confirm Password "Dhara123" into Confirm Password field
    And User click on Subscribe radio button
    And User click on Policy checkbox
    And User click on Submit button
    And User click on Continue button
    Then User should not Register with same email
    
  Scenario Outline: Registration With without data 
  
    Given User navigate to Register page
    When User enters First Name  "" into First Name field
    And User enters Last Name  "" into Last Name field
    And User enters Email  "" into Email field
    And User enters Telephone  "" into Telephone field
    And User enters Password  "" into Password field
    And User enters Confirm Password "" into Confirm Password field
    And User click on Subscribe radio button
    And User click on Policy checkbox
    And User click on Submit button
    And User click on Continue button
    Then User should not Register with same email