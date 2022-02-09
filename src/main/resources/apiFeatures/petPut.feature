Feature:Modify pet information from the PetStore with PUT API
@positive
  Scenario: Edit pet information to the petStore
    Given I have added Valid URL and valid edited payload
    When I send the Put request with valid headers
    Then I validate the success response for Put request

  @negative
  Scenario: Edit pet information to the petStore
    Given I have added Valid URL and existing payload
    When I send the Put request with valid headers
    Then I validate the success response for Put request edited existing payload

