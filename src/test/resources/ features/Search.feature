Feature: Search
  Agile Story: As an user, I should be able to search when I am on Google search box
  Scenario: Google default title verification
    Given User is on the google search page
    Then User should see title is Google
