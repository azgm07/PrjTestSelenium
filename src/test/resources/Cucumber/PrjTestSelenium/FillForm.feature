Feature: Fill form page
 
Scenario: Fill form page and go next

Given Start Selenium Chrome Driver
When For each tab fill all required form fields and click next button
Then Wait and check for result message