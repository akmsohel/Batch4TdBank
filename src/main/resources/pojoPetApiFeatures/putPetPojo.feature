#Feature:Modify pet information from the PetStore with PUT API
#  @positive
#  Scenario: Edit pet information to the petStore
#    Given I have added Valid URL and valid payload
#    When I send the POST request with valid header
#    Then I validate the success response
#
#    When I send the Get request with valid headers
#    Then I validate the success response
#
#    When I send the Put request with valid headers
#    Then I validate the success response
#
#  @negative
#  Scenario: Edit pet information to the petStore
#    Given I have added Valid URL and existing payload
#    When I send the Put request with valid headers
#    Then I validate the success response for Put request edited existing payload
#
