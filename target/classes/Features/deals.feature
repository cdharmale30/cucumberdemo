Feature: Deals Data Creation

Scenario: Free CRM Create a new Deals scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| kailas | Kailas@6994 |
Then user clicks on login button
Then user is on home page
Then user moves to new deals page
Then user enters Deals details scenario
| chetan | 5000|
Then Close the browser