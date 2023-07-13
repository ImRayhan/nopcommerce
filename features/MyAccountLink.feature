@integ
Feature: My Account Link clikable and has valid information

  @tag2
  Scenario Outline: My Account Link credential
    Given I am on Homepage
    When I Click all My Account "<Link>"
    Then I verify the "<Url>" and "<Title>"

    Examples: 
      | Link                     | Url                                                                  | Title                                            |
      | My account               | https://demo.nopcommerce.com/login?ReturnUrl=%2Fcustomer%2Finfo      | nopCommerce demo store. Login                    |
      | Orders                   | https://demo.nopcommerce.com/login?ReturnUrl=%2Forder%2Fhistory      | nopCommerce demo store. Login                    |
      | Addresses                | https://demo.nopcommerce.com/login?ReturnUrl=%2Fcustomer%2Faddresses | nopCommerce demo store. Login                    |
      | Shopping cart            | https://demo.nopcommerce.com/cart                                    | nopCommerce demo store. Recently Viewed Products |
      | Wishlist                 | https://demo.nopcommerce.com/wishlist                                | nopCommerce demo store. Wishlist                 |
      | Apply for vendor account | https://demo.nopcommerce.com/login?ReturnUrl=%2Fvendor%2Fapply       | nopCommerce demo store. Login                    |
