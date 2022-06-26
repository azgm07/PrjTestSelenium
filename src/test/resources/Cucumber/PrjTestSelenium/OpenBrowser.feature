Feature: Open Browser page
 
Scenario: Opening browser page

Given Start Selenium Chrome Driver
When Navigate to url
Then Verify the existence of a selector