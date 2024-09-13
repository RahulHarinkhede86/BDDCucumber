
Feature: Login Page of OrangeHRM

  Scenario: Login is Successfull with valid credentials
    Given Launch the Chrome Browser and login Orange HRM 
    When Open the URL_Orange HRM
    And Enter the Username
    And Enter the Password
    And Clock on Login 
    Then Verify the PageTitle
    And Navigate to Home Page
    And Click on Logout 

 