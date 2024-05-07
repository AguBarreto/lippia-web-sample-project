Feature: Workspace

  Scenario: create workspace successfully
    Given the user is logged in with valid email and password
    And hace click en workspace
    And hace click gestionar
    And hace click crear nuevo espacio de trabajo
    And ingresa un nombre al workpace
    When hace click en el button crear
    Then se visualiza el nuevo workspace en el espacio de trabajo