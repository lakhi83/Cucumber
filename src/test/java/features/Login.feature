@F_1234
Feature: This feature would be used to desgin the login page of the application

  Background: opened the application
    Given I have opened the application in browser

@Sanity
  Scenario: Validate the successful login
    When I click on the Login link
    And I enter the username
    And I enter the password
    And I click on the login Button
    Then I should be Landed on the home page
    
@Regression 
  Scenario: Validate the successful login using test data
    When I click on the Login link
    And I enter the username "abc@xyz.com"
    And I enter the password "pqr@1234"
    And I click on the login Button
    Then I should be Landed on the home page
@Regression @Rapid
  Scenario Outline: Validate the successful login using  multiple test data
    When I click on the Login link
    And I enter the username "<UserName>"
    And I enter the password "<Password>"
    And I click on the login Button
    Then I should be Landed on the home page

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | pqr@1234 |
      | nik@abc.com | pqr@1234 |
      
      Scenario: Validate the successful login using test data
    When I click on the Login link
    And I enter the username "ACc@xyz.com"
    And I enter the password "Pqr@1234"
    And I click on the login Button
    Then I should get error message as  "The email or password you have entered is invalid."
      
      
    