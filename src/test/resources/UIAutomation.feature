Feature: UI Feature
  Scenario: Demonstrating how Selenium works with UI
    Given Open Google Chrome and launch the application
    When Enter the website address "https://www.ebay.com.au/"
    When I choose the Electronics department
    Then 'HeadPhones' should be listed Top Selling Electronics
    Then  Close the browser