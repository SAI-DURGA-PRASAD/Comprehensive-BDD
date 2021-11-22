Feature: GiftCardTest

Scenario: Adding giftCard to cart
Given Initialize the WebDriver
When Navigate to Landing Page
And click on GiftCard and add thousand giftCard to cart
Then Validate the giftCard value in cart
And Close the driver