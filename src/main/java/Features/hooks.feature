Feature: Free CRM Create new Contact

Scenario: free crm create Contact test 
Given tite  login page is Free CRM
When user enters "kailas" and "Kailas@6994"
Then user is clicks on login button
Then user on home page
Then user moves to new contact page
Then user enters contact details "Rahul" and "Patil" and "PHP developer"