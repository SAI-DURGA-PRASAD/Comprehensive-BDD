Feature: WhatsNew

Scenario: Checking for element existance in WhatsNew page 
Given Initialize the WebDriver
When Navigate to Landing Page
And click on WhatsNew
Then Check for existance of "Handmade Buddha Diary"
And Close the driver
And Generate Report