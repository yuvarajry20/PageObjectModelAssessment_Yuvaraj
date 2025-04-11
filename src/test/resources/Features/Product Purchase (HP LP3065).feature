Feature: Product Purchase
  I want to use this template for my Product feature file

  @ProductPurchase
  Scenario Outline: assert the product purchased successfully.
    Given I am in the TutorialsNinja Website
    And click the My Account section and click the Login button
    When i provide the "<email>", "<password>"
    And i click the login button
    Then i search the product HP LP3065 in the search bar
    And i click search button
    Then i click the product to add to cart and again a add to cart button
    Then i click the shopping cart button and i click checkout
    Then i click the continue for delivery details
    And i click continue in delivery method
    Then i click Terms and click Continue
    And i click Confirm order
    Then i validate the result 
    Examples: 
      |email             |password |
      |yuvaraj@gmail.com |789456   |
