Feature: Navigating to BirthdayGifts page

Scenario: Navigating to BirthdayGifts page
Given Initialize the WebDriver
When Navigate to Landing Page
And moveto Gifts section and click on BirthdayGifts Page
Then Validates BirthdayGiftsPage title
And Close the driver