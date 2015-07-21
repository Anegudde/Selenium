Feature: Verify WikiPedia Search

  Scenario: Verify Wikipdia for indirect posts
  When I search "BDD"
  Then I should get "Behavior-driven development" on page

  When I search "TDD"
  Then I should get "Test-driven development" on page