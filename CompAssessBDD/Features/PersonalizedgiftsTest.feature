Feature: Personalized Gifts Test

Scenario: Clicking on PersonalisedGifts and sort by BestSelling
Given Initialize the WebDriver
When Navigate to Landing Page
And click on PersonalisedGifts and sort by BestSelling
Then validate for firstBook in bestselling
And Close the driver