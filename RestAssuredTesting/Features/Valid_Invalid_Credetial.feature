
Feature: Validate valid and Invalid Credential
 Background: Common step for login page
  Given Launch the Chrome Browser and login Orange HRM 
    When Open the URL_Orange HRM
    
    
  Scenario: Login with valid credentials
    
    And Enter the Valid Username
    And Enter the Valid Password
    And Clock on Login 
    Then Verify the PageTitle
    And Navigate to Home Page
    And Click on Logout
    And Close Browser

 
   Scenario: Login with Invalid credentials
   
    And Enter the InValid Username
    And Enter the InvalidPassword
    And Clock on Login 
    Then Velidate the Invalid Credential message 
    And Close Browser


