Feature: Add a new pet to the PetStore with POST API
  @positive
  Scenario: Add a pet to the PetStore with all valid data
    Given I have added Valid URL and valid payload
    When I send the POST request with valid header
    Then I validate the success response

#  @positive
#  Scenario: Add a pet to the PetStore with only mandatory valid data
#    Given I have added Valid URL and mandatory valid data
#    When I send the POST request with valid header for mandatory data
#    Then I validate the success response for mandatory data

#  Scenario: Add a pet to the PetStore with all valid data  but wrong format
#    Given I have added Valid URL and wrong format data
#    When I send the POST request with valid headers
#    Then I validate the success response for wrong format data
#
#  @negative
#  Scenario: Add a pet to the PetStore with invalid header
#    Given I have added Valid URL and mandatory valid data
#    When I send the POST request with wrong headers
#    Then I validate the success response for mandatory data with wrong header
