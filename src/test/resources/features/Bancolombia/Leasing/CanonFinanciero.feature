#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Pantalla de simulación de Canon Financiero
	El usuario puede ver el resultado de sus de los calculos
	al simular en la pantalla Canon Financieron

  @CasoExitoso
  Scenario: Ingreso a la pantalla Canon Financiero de grupo Bancolombia
    Given Seleciono la opción Productos y Servicios
    And Selecciono la opción Leasing
    And Selecciono la opción Leasing habitacional
    And Selecciono la opción Simular Canon Constante
    When Diligencio el formulario
    	| Ingresa el valor del activo (incluyendo IVA) ($) | Ingresa el plazo del contrato (meses) | Ingresa el porcentaje de la opción de compra (%) | Selecciona el tipo de tasa | Modalidad                 |
      | 10,000,000.00																		 |	12														 		   | 1																				    		|	DTF										     | Vencida									 |
    Then El sistema muestra los resultados de la simulación
  
  @CasoAlterno
  Scenario: Ingreso a la pantalla Canon Financiero con errores de grupo Bancolombia
    Given Seleciono la opción Productos y Servicios
    And Selecciono la opción Leasing
    And Selecciono la opción Leasing habitacional
    And Selecciono la opción Simular Canon Constante
    When Diligencio el formulario
    	| Ingresa el valor del activo (incluyendo IVA) ($) | Ingresa el plazo del contrato (meses) | Ingresa el porcentaje de la opción de compra (%) | Selecciona el tipo de tasa | Modalidad                 |
      | 																								 |	12														 		   | 1																				    		|	DTF										     | Vencida									 |
      | 10,000,000.00																		 |	12														 		   | 1																				    		|	DTF										     | Vencida									 |
    Then Verificar que se presente Etiqueta Informativa de validación
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |