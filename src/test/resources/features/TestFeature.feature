Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://amazon.co.uk
    When I enter "book" into search box area
    And I click on search button
    Then I should see the result on page
