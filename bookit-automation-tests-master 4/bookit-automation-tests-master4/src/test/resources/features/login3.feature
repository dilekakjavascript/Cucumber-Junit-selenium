Feature: Login 

## we cannot use a backgroud in this feature fiel
# bacause of the scenarios ahve a different first step
@login 
Scenario: login as teacher 
	Given the user is on the login page 
	When the user logs in as a teacher 
	Then the user should be logged in 
	
Scenario: login as a team lead 
	Given the user is on the login page 
	When the user logs in as a team lead 
	Then the user should be logged in 
	
Scenario: go to google first 
	Given open goodgle 
	Given the user is on the login page 
	When the user logs in as a team lead 
	Then the user should be logged in 
	
	