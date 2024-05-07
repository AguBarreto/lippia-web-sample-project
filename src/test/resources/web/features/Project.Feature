Feature: Projects

  Scenario: create project successfully
    Given the user is logged in with valid email and password
    And hace click en el icono mas
    And hace click create new project
    When introduce name new project
    And hace click en el button crear
    Then se valida el proyecto creado con el mensaje