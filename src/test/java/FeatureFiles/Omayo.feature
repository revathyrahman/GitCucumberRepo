Feature: Login to the Omayo Application

@Valid
Scenario Outline: User Should only be able to login with valid credentials

This scenario is to validate the login

Given I navigate to the application URL
When I enter Username as "<someusername>" and Password as "<somepassword>" into the username and password fields
And I click on the Login button now
Then I the user should be successfully logged in

Examples:
|someusername		| somepassword|
|SeleniumByArun | Test143$    |


@Smoke 
Scenario Outline: User Should only be able to login with Invalid credentials

Given I navigate to the application URL
When I enter Username as "<someusername>" and Password as "<somepassword>" into the username and password fields
And I click on the Login button now
Then I the user should be successfully logged in

Examples:
|someusername		| somepassword|
|Arun           | abc123      |
|revathy           | abc123      |
