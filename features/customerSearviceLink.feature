@integ
Feature: Customer service Link clikable and has valid information

  @tag2
  Scenario Outline: Customer service Link credential
    Given I am on Homepage
    When I Click all CustomerService "<Link>"
    Then I verify the "<Url>" and "<Title>"

    Examples: 
      | Link                     | Url                                                 | Title                                            |
      | Search                   | https://demo.nopcommerce.com/search                 | nopCommerce demo store. Search                   |
      | News                     | https://demo.nopcommerce.com/news                   | nopCommerce demo store. News Archive             |
      | Blog                     | https://demo.nopcommerce.com/blog                   | nopCommerce demo store. Blog                     |
      | Recently viewed products | https://demo.nopcommerce.com/recentlyviewedproducts | nopCommerce demo store. Recently Viewed Products |
      | Compare products list    | https://demo.nopcommerce.com/compareproducts        | nopCommerce demo store. Compare Products         |
      | New products             | https://demo.nopcommerce.com/newproducts            | nopCommerce demo store. New Products             |
