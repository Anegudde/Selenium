Feature: Checking User Details for Given Conditions
	As a User for a login	

Scenario: Calculate Body Mass Index
	Given I enter "<Login>" as Username "<X>"
	|User   |X|
	|Vikram |A|
	|Manish |B|
	|Kamal  |C|
	|Test   |D|
	And I enter my name as "<User>" for the login
	And I press the Calculate button
	Then I should see all "<User>" names
	