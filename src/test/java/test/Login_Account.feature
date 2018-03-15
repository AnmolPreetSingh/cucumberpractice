Feature: login into Account

Scenario: Successful Login 
Given user is on home page
When user clicks on login yourself link
And user enters correct username and password
And clicks on Signin button
Then welcome to iBusiness page should display
Then User close the browser
