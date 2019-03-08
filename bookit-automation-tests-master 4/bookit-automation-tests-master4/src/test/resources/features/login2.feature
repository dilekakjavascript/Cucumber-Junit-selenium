@login2 
Feature: Login 
	As a user, when I go to the login page,
	I should be able to login

Background:
	Given the user is on the login page 
	
Scenario: login as teacher 
	When the user logs in as a teacher 
	Then the user should be logged in 
	
Scenario: login as a team lead 
	When the user logs in as a team lead 
	Then the user should be logged in 