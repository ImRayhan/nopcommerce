@tag
Feature: HomePage Featured products

  @smoke1
  Scenario: Placing order Build your own computer in Featured products
    Given I am on hompage
    When I click on Build your own computer
    And I chose Processor,ram,OS ,Software adding to the cart
    Then I checkout as guest fulfilled my adress shipping details
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And i verify thta order has been placed

  @smoke2
  Scenario: Placing order Apple MacBook Pro in Featured products
    Given I am on hompage
    When I click on Apple MacBook Pro
    And I add to cart a item
    Then I checkout as guest fulfilled my adress shipping details
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And i verify thta order has been placed

  @smoke3
  Scenario: Placing order HTC One M8 android  Lollipop in Featured products
    Given I am on hompage
    When I click on HTC One M8 android L Lollipop
    And I adding to cart a item
    Then I checkout as guest fulfilled my adress shipping details
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And i verify thta order has been placed

  @smoke4
  Scenario: Placing order Virtual Gift Card in Featured products
    Given I am on hompage
    When I click on Virtual Gift Card
    And I enter Recipients name "nusrat alam" email "imrayhanc@gmail.com" & my name "rayhan chowdhury" email "rayhanc@yahoo.com" massage "gift card"
    And I adding to the cart
    Then I checkout as guest fulfilled my adress shipping details
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And i verify thta order has been placed
