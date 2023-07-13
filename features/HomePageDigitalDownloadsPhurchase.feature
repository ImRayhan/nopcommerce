@tag
Feature: Hompage Digital Downloads section

  @tag1
  Scenario: Digital Downloads Purchases
    Given I am on hompage
    When I click on Digital downloads
    And I verify that digital download have all the products its expected
    Then I add all the product on the cart
    And I checked the item prices is coorect
    Then I placing order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And i verify thta order has been placed
