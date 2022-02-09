Feature: Add a new user to the PetStore with POST API
  @positive
  Scenario: Add a user to the PetStore with all valid data
    Given I have added Valid URL and valid UserPayload
    When I send the POST request with valid header for user
    Then I validate the success response for user