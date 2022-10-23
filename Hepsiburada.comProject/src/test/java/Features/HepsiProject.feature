Feature: Hepsiburada.com
  Scenario: Adding products to the cart in Hepsiburada
    Given : User is on homepage
    When : Click accept cookies
    When : Click the search box
    When : Type "Iphone 13" in the search box
    When : Click the search button
    When : Filter the seller as Hepsiburada
    When : Click the Sort by button
    When : Apply the Sort by ascending price filter
    When : Click on the first product
    When : Click Black from the color options
    When : Click Other Sellers
    When : Click on the seller of Hepsiburada
    When : Click the add to cart button
    When : Close the popUp that opens
    When : Click the My Bag button
    Then : Check the product in the cart