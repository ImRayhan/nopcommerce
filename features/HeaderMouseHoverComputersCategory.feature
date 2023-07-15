@smoke
Feature: Mouse hover on computers and checking all the computer categories

  @smoke11
  Scenario: Hover mouse and checking Desktops computer categories
    Given I am on homepage
    And I hover mouse on computer
    When I Click desKtop cetegory
    And I verify all the desktop product are visible
    And I add all the desktop product on the cart
    When i check total price of desktop if match
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I check the order has been complete

  @smoke22
  Scenario: Hover mouse and checking Notebooks computer categories
    Given I am on homepage
    And I hover mouse on computer
    When I Click Noteooks cetegory
    And I verify all the Notebooks product are visible
    And I add all the Notebooks product on the cart
    When i check total price of notebooks if match
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I check the order has been complete

  @smoke33
  Scenario: Hover mouse and checking Notebooks computer categories
    Given I am on homepage
    And I hover mouse on computer
    When I Click Software cetegory
    And I verify all the Software product are visible
    And I add all the Software product on the cart
    When i check total price of Software if match
    Then I placing the order
      | FirstName | LastName  | Email             | Company | Country       | State    | City    | Adress       | Zipcode | PhoneNum   | FaxNum    |
      | rayhan    | chowdhury | rayhanc@yahoo.com | toto    | United States | New York | Buffalo | 42 Alice ave |   14215 | 9294529947 | 123456789 |
    And I check the order has been complete
