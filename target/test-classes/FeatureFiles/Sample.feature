Feature: Login to the Omayo Application

Omayo is a kind of application which gives you facility to validate different webelements under one roof

@Valid
Scenario: User Should only be able to login with valid credentials

Given I navigate to the application URL
When I enter Username as "<someusername>" and Password as "<somepassword>" into the username and password fields
And I click on the Login button now
Then I the user should be successfully logged in

Examples:
|someusername		| somepassword|
|SeleniumByArun | Test143$    |
|xyz		        | Test123!	|

@Smoke 
Scenario Outline: User Should only be able to login with valid credentials

Given I navigate to the application URL
When I enter Username as "<someusername>" and Password as "<somepassword>" into the username and password fields
And I click on the Login button now
Then I the user should be successfully logged in

Examples:
|someusername		| somepassword|
|Arun           | abc123      | 

