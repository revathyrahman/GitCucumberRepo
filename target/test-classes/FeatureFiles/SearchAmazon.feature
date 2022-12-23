Feature: As a guest user I want to search for products based on the category and see relevant products

Scenario: Search for products from books category

Given I access the amazon online retail portal
When I go to the categories section
Then I should be able to select books category from the categories
And I click on search
Then I expect the Top picks of books should be displayed
But not any other products from any other category

Scenario: Search for products from Electronics



