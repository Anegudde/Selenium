Feature: Verify Search

  Scenario: Verify Wikipdia for indirect posts
  When I search Rediff.com
  Then I should get Rediff on page

  When I search Google.com
  Then I should get Gmail on page