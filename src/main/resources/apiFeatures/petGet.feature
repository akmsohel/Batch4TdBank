Feature: Getting pet information from the PetStore with GET API

  @positive
  Scenario: Get pet information from petStore using pending status
    Given I have added Valid URL and parameter
    When I send the Get request with valid headers
    Then I validate the success response for get request

 @positive
  Scenario: Get pet information from petStore using sold status
    Given I have added Valid URL and parameter with sold status
    When I send the Get request with valid headers
    Then I validate the success response for get request

  @positive
  Scenario: Get pet information from petStore using available status
    Given I have added Valid URL and parameter with available status
    When I send the Get request with valid headers
    Then I validate the success response for get request

  @Negative
  Scenario: Get pet information from petStore using wrong status
    Given I have added Valid URL and parameter with wrong status
    When I send the Get request with valid headers
    Then I validate the success response for wrong status get request

  @negative
  Scenario: Get pet information from petStore without status
    Given I have added Valid URL but without status
    When I send the Get request with valid headers
    Then I validate the success response for get request without status




