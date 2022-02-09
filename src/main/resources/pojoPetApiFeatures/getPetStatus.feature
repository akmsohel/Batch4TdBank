Feature: Get pet by status using GET API request
@positive
Scenario Outline: Get pet information from petStore using  status <value>

    When I send the Get request with status <value>
    Then I validate the success response for get pet by status
Examples:
    | value     |
    | available |
    | pending   |
    | sold      |


#@negative
#    Scenario Outline: Get pet information from petStore using status
#
#        When I send the Get request with invalid status <value>
#        Then I validate the success response for get pet by status
#Examples:
#    | value     |
#    | available |
#    | invalid   |