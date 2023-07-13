@unit
Feature: verifying homepage news feature readble and commentable

  @unit1
  Scenario: Verifying News New online store is open!
    Given I am on Homepage
    And I click on View News Archive
    When I Verify all the news header are prasent
    And I click New online store is open!
    And I leave comment "title" and "comment"
    Then I validate "News comment is successfully added."

  @unit2
  Scenario: Verifying nopCommerce new release!
    Given I am on Homepage
    And I click on View News Archive
    When I Verify all the news header are prasent
    And I click nopCommerce new release
    And I leave comment "title" and "comment"
    Then I validate "News comment is successfully added."

  @unit3
  Scenario: Verifying About nopCommerce
    Given I am on Homepage
    And I click on View News Archive
    When I Verify all the news header are prasent
    And I click About nopCommerce
    And I leave comment "title" and "comment"
    Then I validate "News comment is successfully added."
