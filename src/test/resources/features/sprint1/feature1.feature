Feature: feature1
@regression
Scenario: scenario1
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on Selenium Example Page
Then system should open "Selenium Test Example Page"

@smoketest@module1
Scenario: scenario2
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on Selenium Example Page
Then system should open "Selenium Test Example Page"



@smoketest
Scenario: scenario3
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on Selenium Example Page
Then system should open "Selenium Test Example Page"