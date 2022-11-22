@sanity
Feature: Ensure user Log in to the saucedemo web account and select select the product

  As a customer
  I want to login to saucedemo web page with my credentials
  So I can select the products add the items to cart and buy them
  @Sanity
  Scenario: To Login the saucedemo web account
    Given Launch the saucedemo web site
    When Enter email and password
    And  Verify user has successfully login to product page
    And  Log out from the account
  @Sanity
  Scenario: To verify adding three items to basket and purchasing only two items
    Given Launch the saucedemo web site
    When Enter email and password
    Then  Verify user has successfully login to product page
    And  Add three items to the basket
    And Buy only 2 items
    And  Log out from the account
  @Sanity
  Scenario: To verify by making an order between $30-$60
    Given Launch the saucedemo web site
    When Enter email and password
    Then  Verify user has successfully login to product page
    And  make an order between $30-$60  and print the order
    And  Log out from the account







