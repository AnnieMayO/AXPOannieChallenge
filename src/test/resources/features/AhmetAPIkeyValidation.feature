Feature: Validate AEMET API Key
  Scenario: Validate the API key for AEMET
    Given I have a valid AEMET API key
    When I send a request to the AEMET API
    Then the response status code should be 200
    And the response should contain valid data