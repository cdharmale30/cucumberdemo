Feature: cucumber project with table 

#Scenario: login to application 
#Given User should be on login page 
#When User enters "kailas" and "kailas@6994" 
#And verify title 
#And verify logo 
#Then user clicks login button 
#And close browser


Scenario Outline: login to application 
Given User should be on login page 
When User enters "<username>" and "<password>" 
And verify title 
And verify logo 
Then user clicks login button 
And close browser

Examples:
   |username| password |
   |kailas|Kailas@6994|
   |naveenk|test@123|