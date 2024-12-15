Feature: AEMET API Validation

#  Background:
#    Given i navigate to the AEMET API Portal.

  Scenario Outline: Scenario: User signs up for AEMET API
    Given user navigates to the AEMET API descargas
#    When user clicks Entrar button under the Acceso General
    And user clicks KeyAPI input box
    And user enters valid API key
    And user selects "temp"
    And user clicks Obtener button
    And user should received a toast notification error saying "API key invalido"

#    And user clicks "Selecione tipo de parte" input field
#
#
#    And user should received a toast notification error saying "API key invalido"

#    Then user enters invalid API key
#    And user enters valid API key
#    And user inputs the fields in Datos de observation. Ultimo elaborado "<Province>" and "<Station>"
#    And user clicks Obtener

  Examples:
    | Province   | Station            |
    | Albacete   | 8198Y - Almansa    |
    | Cantabria  | 8177A - Chinchilla |
    | Las Palmas | 7067Y - Nerpio     |



#    Then I should get a successful response
#    Then I should get the weather forecast data


