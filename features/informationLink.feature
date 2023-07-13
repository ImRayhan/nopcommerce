@integretion
Feature: information link clikable and has valid information

  @integretion1
  Scenario Outline: information Link credential
    Given I am on Homepage
    When I Click all information "<Link>"
    Then I verify the "<Url>" and "<Title>"

    Examples: 
      | Link               | Url                                            | Title                                      |
      | Sitemap            | https://demo.nopcommerce.com/sitemap           | nopCommerce demo store. Sitemap            |
      | Shipping & returns | https://demo.nopcommerce.com/shipping-returns  | nopCommerce demo store. Shipping & returns |
      | Privacy notice     | https://demo.nopcommerce.com/privacy-notice    | nopCommerce demo store. Privacy notice     |
      | Conditions of Use  | https://demo.nopcommerce.com/conditions-of-use | nopCommerce demo store. Conditions of Use  |
      | About us           | https://demo.nopcommerce.com/about-us          | nopCommerce demo store. About us           |
      | Contact us         | https://demo.nopcommerce.com/contactus         | nopCommerce demo store. Contact Us         |
