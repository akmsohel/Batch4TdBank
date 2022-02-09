Feature: As a user, I should be able to create facebook account

  @smoke
  Scenario: Create facebook account successfully with valid credentials
    Given I am in facebook home page
    When I click on create account button
    Then I able to see the sign up form
    When I fill up all the information with valid data
    Then I click on submit button
    And I am able to create facebook account successfully
    And I am able to see the facebook login page


  Scenario: Login successfully with valid data
    Given I am in facebook home page
    When I enter valid email abkmhjjhgg@gmail.com and password hgff58779999
    And I click on Sign in button
    Then I am able to log in successfully

  Scenario Outline: Login successfully with invalid data
    Given I am in facebook home page
    When I enter invalid email <mail> and password <pass>
    And I click on Sign in button
    Examples:
      | mail                | pass      |
      | Hgfjgjlg@yahoo.com  | 8987hjj   |
      | Ifufgkjkh@gmail.com | 00000JHGH |

  Scenario: Login successfully with invalid table data
    Given I am in facebook home page
    When I enter email and password to login
      | Mjgjlg@yahoo.com  | 987hjjjglh  |
      | Nfgkjkh@gmail.com | 0JHGHiuyioy |

    And I click on Sign in button

  Scenario: Login successfully with invalid table data
    Given I am in facebook home page
    When I enter email and password for login
      | email             | password    |
      | Xjgjlg@yahoo.com  | 987hjjjglh  |
      | Yfgkjkh@gmail.com | 0JHGHiuyioy |

    And I click on Sign in button






