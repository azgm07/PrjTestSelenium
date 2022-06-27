Feature: Fill form and send email
 
Scenario: As a user, I want to fill all required form fields and send the email

Given Start browser with Selenium Chrome
When Fill all required form fields and submit
Then Wait and check the alert for success