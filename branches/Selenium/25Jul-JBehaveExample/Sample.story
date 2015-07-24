Narrative: I should be able to search
#
# http://ivanz.com/2011/05/25/java-bdd-with-jbehave-and-watij-in-eclipse-with-junit/
#

Scenario: I should see an error if I try to search without filling in the search form fields.
Given I open 'http://mysite.com'
When I click on the 'Search' button
Then I should see an error