Feature: Login functionality test of Mercury travel App
Scenario: Check Login functionality by giving valid credentials
Given User is in Login Page
When User entered valid Username and Password 
And Click on Login button 
Then User shoulb be navigated to Home page
And Close the browser



Scenario Outline: Check Login functionality by giving random credentials
Given User is in Login Page
When User entered "<Username>" and "<Password>" 
And Click on Login button 
Then User shoulb be navigated to Home page
And Close the browser

Examples:
| Username | Password |
| mercury  | mercury  |
| mercury1 | mercury1 |
