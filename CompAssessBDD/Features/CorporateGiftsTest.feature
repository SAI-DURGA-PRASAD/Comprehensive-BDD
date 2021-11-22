Feature: CorporateGiftsTest

Scenario Outline: Click on CorporateGifts and enter the details
Given Initialize the WebDriver
When Navigate to Landing Page
And Click on CorporateGifts
And Enter <fullname>, <email> , <phoneNumber> , <enquiry> and click on Submit
Then Check for robotCheckNote
And Close the driver

Examples:
|fullname	|	email	|	phoneNumber	|	enquiry|
|fullname1	|email@email.com|12345678	|Sample enquiry message|