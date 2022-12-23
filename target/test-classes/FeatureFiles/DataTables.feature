Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn fields
	And User enters Credentials to LogIn
    | username | password|
       | testuser_2 | Test@153 |
     | SeleniumByArun | Test143$ |
    
	Then Message displayed Login Successfully

