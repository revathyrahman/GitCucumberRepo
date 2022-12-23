Feature: Login Check

Scenario: Need to login with valid username and password

Given I access OmayoBlogSpot Application
When I enter Username as "test@gmail.com" and Password as "test123" into the fields
And I click on the Login Button
Then I the user should be able to successfully login





