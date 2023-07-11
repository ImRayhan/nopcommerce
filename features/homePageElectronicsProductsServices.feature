@tag
Feature: Verifying homePage Electronics products & services category

  @Regression1
  Scenario: Checking Camera&Photo Products & Placing order
    Given I am on homepage
    And I click Electronics category
    When I see three diffrent compartment Electronics
    And I Click Camera & Photo department and checking the item is visible
    And I adding to the card
    And I Checking total ammount of Camera&Photo item
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I validate the outcomes that order has been placed

  @Regression2
  Scenario: Checking Cell Phones Products & Placing order
    Given I am on homepage
    And I click Electronics category
    When I see three diffrent compartment Electronics
    And I Click cellphone drpartment and have three phones & able to adding to the cart
    And I Checking the ammount of Cell Phones
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I validate the outcomes that order has been placed

  @Regression3
  Scenario: Checking Others accessory Products & Placing order
    Given I am on homepage
    And I click Electronics category
    When I see three diffrent compartment Electronics
    And I Click Others accessory drpartment have three items aswell & addable to the cart
    And I Checking the ammount of Others accessory
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I validate the outcomes that order has been placed
