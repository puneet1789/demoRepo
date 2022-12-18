@MyFirstFeature
Feature: User cretion
  this feature in my application helps users to create a new user

#Background: Launch browser
	

	@myFirstCucumberTest_1 @regression
  Scenario: My First Cucumber scenaio 
  	
  	Then I click on "OR_Login_Signin_Button" button
  	
 
	@myFirstCucumberTest_2 @myFirstCucumberTest_3 @sanity
  Scenario: My Second Cucumber scenaio  
  	
  	Then I click on "OR_Login_Signin_Button" button
  	
	@myFirstCucumberTest_3 @sanity @regression
  Scenario: My Third Cucumber scenaio
  
  	#Given I launch URL "https://ca.yahoo.com/?p=us"
  	Then I click on "OR_Login_Signin_Button" button
  	
  	@myFirstCucumberTest_4
  	Scenario Outline: My Forth Cucumber scenaio
  	Then I do something with 1000
  	Given I launch URL "<url>"
  	Then I click on "OR_Login_Signin_Button" button
  	Then I validate Below Data
  	|OR_Home_UserID| AB123|
  	|OR_Home_Name|Nae123|
  	|OR_Home_Age|40|
  
  	Examples:
  	|url|
  	|https://ca.yahoo.com/?p=us|
  
  	
  	


  	