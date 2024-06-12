Feature: Search Functionality

Scenario Outline: User search valid product

	Given User open the application
	When  User enter valid product "HP" into search box field
	And 	User click on search button
	And 	User get the search result
	Then  User should get valid product in search result
	
Scenario Outline: User search for invalid product	
	
	Given User open the application
	When  User enter valid product "Honda" into search box field
	And 	User click on search button
 And 	User get the search result
	Then  User should get valid product in search result
	
Scenario Outline: User search without any product	

	Given User open the application
	When  User enter valid product into search box field
	And 	User click on search button
  And 	User get the search result
	Then  User should get valid product in search result