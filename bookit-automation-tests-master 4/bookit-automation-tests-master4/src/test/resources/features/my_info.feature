Feature: Information about me

 @db
Scenario: my self
	Given user logs in using "efewtrell8c@craigslist.org" "jamesmay"
	When user is on the my self page
	Then user info should match with the database records for "efewtrell8c@craigslist.org"
	
@db
Scenario:
	Given user logs in using "efewtrell8c@craigslist.org" "jamesmay"
	When user is on the my team page
	Then team info should match with the database records "efewtrell8c@craigslist.org"

@temp @db
Scenario Outline: my self DDF
	Given user logs in using "<email>" "<password>"
	When user is on the my self page
	Then user info should match with the database records for "<email>"
Examples:
	|email					   |password				|
	|efewtrell8c@craigslist.org|jamesmay				|
	|jrowesby8h@google.co.uk   |aldridgegrimsdith	|
    |bmurkus8q@psu.edu         |alicasanbroke     	|
     
    
    
    