Feature: AddingItemtoCart

Scenario: Selecting an item and adding into cart
Given Initialize the WebDriver
When Navigate to Landing Page
And Click on AllofIt and add firstItem to cart
Then Validates the price of item and Click on checkout
And Close the driver