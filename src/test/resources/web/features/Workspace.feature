Feature: As a potential client, I need to create a workspace

  Scenario: create workspace successfully
    Given the user is logged in with valid email and password
    And clicks on Manage
    And clicks on Create New Workspace
    And enters a name for the workspace
    When clicks on the Create button
    Then the new workspace is displayed in the workspace area