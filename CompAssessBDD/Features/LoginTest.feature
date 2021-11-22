Feature: LoginTest

Scenario Outline:  Logging into the user dashboard
Given Initialize the WebDriver
When Navigate to Landing Page
And click on SignIn
Then Enter <username> and <password> then click on Submit
And Close the driver

Examples:
|username	|password	|
|username@risg|password123|
|username2@email.com|pass1234|