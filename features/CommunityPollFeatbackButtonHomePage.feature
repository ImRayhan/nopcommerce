@regression
Feature: Commubity poll featback

  @regression
  Scenario: Community poll radioButton check
    Given I am on homepage
    And I iterate all four buttons
    When I Click vote
    And I verify the outcome
