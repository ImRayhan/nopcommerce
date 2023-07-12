@tag
Feature: HomePage Apparel Products

  @UAT1
  Scenario: verifying Shoes Products & Placing Order
    Given I am on Homepage
    And I click on Apparel
    When I Click shoes products
    And I verify all shoe item is visible
    And I adding all the Item to the cart
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I check the order has been complete

  @UAT2
  Scenario: verifying Clothing Products & Placing Order
    Given I am on Homepage
    And I click on Apparel
    When I Click on clothing products
    And I verify all cloth item is present
    And I adding all clothing Item to the cart
    And I check Clothing total Ammount is matches
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I check the order has been complete

  @UAT3
  Scenario: verifying Accessories Products & Placing Order
    Given I am on Homepage
    And I click on Apparel
    When I Click on Accessories products
    And I verify all Accessories item is shoes as expected
    And I adding all Accessories product to the cart
    And I check Accessories total Ammount is correct
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I check the order has been complete
