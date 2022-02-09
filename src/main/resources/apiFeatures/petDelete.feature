Feature: Delete pet information from the PetStore with DELETE API

  @positive
  Scenario: Delete a pet from the petStore
    Given I have added Valid URL and parameter id for Delete request
    When I send the Delete request with valid headers
    Then I validate the success response for Delete request

  @negative
  Scenario: Delete a pet from the petStore using wrong pet id
    Given I have added Valid URL and wrong id for Delete request
    When I send the Delete request with valid headers
    Then I validate the success response with wrong id for Delete request