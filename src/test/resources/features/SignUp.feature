
@RunAll
Feature: AEMET API Signup

  Background:
    Given i navigate to the AEMET API Portal.

  Scenario Outline: User signs up for AEMET API

    When i click request button to obtain api key

    And i enter my valid email address "<emailAddress>"
    And i manually complete captcha
    And verify that a message "Su petición ha sido enviada, recibirá un correo de confirmación." appears

    Then i should receive an API key in my email
    And i enter again my valid email address emailAddress
    And i click next


    Examples:
      | emailAddress            |
      | omerannie2023@gmail.com |
