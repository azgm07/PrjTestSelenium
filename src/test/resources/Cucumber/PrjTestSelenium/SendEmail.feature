Feature: Send email
 
Scenario: Fill all required email information and wait for success

Given Check opened email page
When Fill all required email fields
And Click next button
Then Wait for success message