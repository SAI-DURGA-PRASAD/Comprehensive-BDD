Feature: AddingItemtoCartWithGiftcard

Scenario: Adding an item to cart and add GiftWrap,giftNote to it and Checkout
Given Initialize the WebDriver
When Navigate to Landing Page
And Click on AllofIt and add firstItem to cart
And select GiftWrap and add giftNote to it
Then Validates the price of item with giftWrap and Click on checkout
And Close the driver