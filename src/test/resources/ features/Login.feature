@login
Feature: Login Feature

  # this is how you comment out in feature file


  @librarian
  Scenario: Librarian login scenario
    Given User is on the login page
    When logs in as librarian
    Then User should see dashboard

  @student
  Scenario: Student login scenario
    Given User is on the login page
    When User logs in as student
    Then User should see dashboard
  @admin
  Scenario: Admin login scenario
    Given User is on the login page
    When User logs in as admin
    Then User should see dashboard
