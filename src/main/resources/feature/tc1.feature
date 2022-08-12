Feature:
  As a user
  I want to be able to sign in into Komi
  So that i can access my profile
#  Background:
#  Given the user is on landing page
#  When user chooses to sign in

  @SignIn-Simple
  Scenario: Sign in
    Given the user is on landing page
    When user chooses to sign in
    And user enters the credentials
    And user clicks sign in button
    Then user should be logged in to the website

  @SignIn-DataDriven
  Scenario Outline: Sign in with DataDriven
    Given the user is on landing page
    When user chooses to sign in
    And user enters the credentials as email "<email>" and password "<password>"
    And user clicks sign in button
    Then user should be logged in to the website
    Examples:
      | email             | password        |
      | d3@mailinator.com | Komi123Komi123! |
      | k1@mailinator.com | Komi123!        |

