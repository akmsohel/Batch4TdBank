Feature: Td Bank personal account creation
@signup
  Scenario: As a user,I should be able to create a new account with valid credentials

    Given I should open a Chrome Browser
    And I should landed on tdBank home page
    When I click on Sign Up button
    And I fill up all information with valid data
    Then I should be able to create my account
@login
  Scenario: As a user , I should be able to log in with valid data
    Given I should open a Chrome Browser
    And I should landed on tdBank home page
    When I click on login button
    And  I should log in successfully with valid data

      | akmKKK   | Akkjk9876  |
      | huyhjkgi | HJk8769897 |
#
#
#  Scenario: As a user , I should be able to log in by clicking Sign Up
#    Given I should open a Chrome Browser
#    And I should landed on tdBank home page
#    When I click on Sign Up button
#    And I clicl on cencell button
#    And I fill up <username> and <password>
#


