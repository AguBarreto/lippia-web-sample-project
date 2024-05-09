Feature: As a potential client, I need to create a project


  Scenario: create project successfully
    Given the user is logged in with valid email and password
    And click on the plus icon
    And click on Create New Project
    When entering the name of the new project
    And click on the Create button
    Then the created project is validated with a message