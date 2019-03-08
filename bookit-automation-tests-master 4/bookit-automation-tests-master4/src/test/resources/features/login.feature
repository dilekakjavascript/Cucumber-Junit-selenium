Feature: Login 
	As a user, when I go to the login page,
	I should be able to login

@login 
Scenario: login as teacher 
	Given the user is on the login page 
	When the user logs in as a teacher 
	Then the user should be logged in 
	
Scenario: login as a team lead 
	Given the user is on the login page 
	When the user logs in as a team lead 
	Then the user should be logged in 
	
Scenario: login as anyone 
	Given the user is on the login page 
	When the user logs using "kliversageu@cbslocal.com" and "kerrieliversage" 
	Then the user should be logged in 
	
Scenario: Login as another person 
	Given  the user is on the login page 
	When  the user logs using "rbarstowk@cyberchimps.com" and "reneebarstow" 
	Then  the user should be logged in
	And there should be 1 rooms
	
	
	