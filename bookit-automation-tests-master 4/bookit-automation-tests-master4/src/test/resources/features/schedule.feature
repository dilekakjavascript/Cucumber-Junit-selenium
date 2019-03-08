Feature: View schedule 

@schedule @smoke 
Scenario: My team schedule 
	Given the user is on the login page 
	And the user logs in as a teacher 
	When go to my schedule 
	Then I should be able to see the reservations for my team
	