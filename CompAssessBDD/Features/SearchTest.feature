Feature: SearchTest

Scenario: Searching for item and validation
Given Initialize the WebDriver
When Navigate to Landing Page
And click on search and search for "harry potter gifts" keyword
Then validate first item in search Results
And Close the driver