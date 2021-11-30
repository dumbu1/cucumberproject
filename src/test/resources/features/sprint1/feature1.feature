Feature: feature1
@regression
Scenario: scenario1
Given user is in "Web Examples for Selenium Tests" page
When user clicks on Selenium Example Page
Then system should open "Selenium Test Example Page1"

@smoketest@module1
Scenario: scenario2
Given user is in "Web Examples for Selenium Tests" page
When user clicks on Selenium Example Page
Then system should open "Selenium Test Example Page"



@smoketest
Scenario: scenario3
Given user is in "Web Examples for Selenium Tests" page
When user clicks on Selenium Example Page
Then system should open "Selenium Test Example Page2"