Feature: OpenFGA Client API Authentication
  Scenario: No Auth Request against No Auth Server
    Given I have a client with Authentication Disabled
    When The server has Authentication Disabled
    Then I get a valid response from the server

  Scenario: No Auth Request against Auth Server
    Given I have a client with Authentication Disabled
    When The server has Authentication Enabled
    Then I get an invalid response from the server

  Scenario: API Token against API Token Enabled Server
    Given I have a client with Api Token Credentials with a valid token
    When The server has Authentication Enabled
    Then I get a valid response from the server
    And I can see the bearer token in the auth header

  Scenario: Invalid API Token
    Given I have a client with Api Token Credentials with a invalid token
    Then An API Value Exception is raised

  Scenario: Client Credentials against Client Credential Server
    Given I have a client with Valid Client Credentials with valid configuration
    When The server has Authentication Enabled
    Then I get a valid response from the server
    And I can see the bearer token in the auth header

  Scenario: Empty API Token
    Given I am using API Token Credentials with an Empty API Token
    Then An API Value Exception is raised



  Scenario: Client Credentials with Empty API Client ID
    Given I have a client with Api Token Credentials Configured with an empty field
    Then An API Value Exception is raised

  Scenario: Client Credentials with Empty API Client Secret
    Given I have a client with Api Token Credentials Configured with an empty field
    Then An API Value Exception is raised

  Scenario: Client Credentials with Empty API Issuer
    Given I have a client with Api Token Credentials Configured with an empty field
    Then An API Value Exception is raised

  Scenario: Client Credentials with Empty API Audience
    Given I have a client with Api Token Credentials Configured with an empty field
    Then An API Value Exception is raised