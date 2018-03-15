Feature: Create an Account

Scenario: Successfull creation of account
   Given user is on home page
   When User click on create an account
   And Eneters all the details correctly
   And User click on continue button
   Then user see's Your Account Has Been Created! page
  Then User close the browser
   
  Scenario: unsuccessful on creation of account
   Given user is on home page
   When User click on create an account
   And Enters other details correctly but forget email
   And User click on continue button
   Then user should get alert saying Errors have occured during the process of your form
   Then User close the browser
