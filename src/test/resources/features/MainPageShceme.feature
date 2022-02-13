Feature: verify Main Page

  Background:
    Given the user on the main page

  Scenario: Verify Page Tabs
    Then verify page title "STORE"
    And verify page subtitle contains "PRODUCT STORE"
    And verify page tabs
    |Home |
    |Contact|
    |About us|
    |Cart|
    |Log in|
    |Sign up|


  Scenario: Verify categories
    And verify category titles
      |CATEGORIES|
      |Phones|
      |Laptops|
      |Monitors|

  @wip
  Scenario: Verify product names
    And verify product names
      |Samsung galaxy s6|
      |Nokia lumia 1520|
      |Nexus 6|
      |Samsung galaxy s7|
      |Iphone 6 32gb|
      |Sony xperia z5|
      |HTC One M9|
      |Sony vaio i5|
      |Sony vaio i7|