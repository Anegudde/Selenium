Feature: Check Login Details
	Check the Orders before Login	

Scenario Outline: Calculate Body Mass Index
	Given I have the following order
	When I enter "<vegetable>" as vegetable	
	Then I should see "<cost>"
	
Examples:
	| vegetable | amount | cost |
	| cucumber  |   4    |  10  |
	| carrot    |   5    |   6  |
	| potato    |   6    |   4  |