Feature: Automate home page features such as initiate search etc

  Background: 
    Given User is on home page

  @Smoke @Regression
  Scenario: Initiate Search for ONEWAY
    Then Select OneWay
    Then Enter fromCity
    |LAX|
    And Enter to city "NYC"
    Then Select depart date
    And Click on search button
    Then Listing page should load

  @Smoke @Sanity
  Scenario: Initiate Search for ROUNDTRIP
    Then Select RoundTrip
    Then Enter from city
    And Enter to city
    Then Select depart date
    And Click on search button
    Then Listing page should load
