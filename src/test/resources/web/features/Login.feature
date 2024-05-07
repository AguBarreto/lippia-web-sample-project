@Login
Feature: As a potential client i need to Login in Clockify web site

  Scenario: login successfully
    Given the client is on the login page
    When click on Log in manually
    And enter email and password
    Then the user view the main dashboard

  Scenario: logout successfully
    Given the client is on the login page
    When click on Log in manually
    And enter email and password
    And the user view the main dashboard
    And click on the logout button
    Then the user close session successfully
