
Feature: Shopping Test
  As user I want to test shopping functionality into shein website

  Scenario: user should navigate to cart page
    Given I am on home page
    When I click on clothing
    And I click on men section
    And I click on sale
    And I click on product
    And I select size
    And I click on add to bag
    And I click on view bag
    Then I should verify product added to bag or not