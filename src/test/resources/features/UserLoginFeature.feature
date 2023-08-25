Feature: Login Function

#Scenario: Valid Login
#Given User is on Login
#When User Enters credentials
#Then User Should Be Navigated to Homepage

#Scenario: Parameterization Valid Login
#Given User is on Login
#When User Enters "tomsmith" and "SuperSecretPassword!"
#Then User Should Be Navigated to Homepage

Scenario Outline: Scenario Outline with Parameterization Valid Login
Given User is on Login
When User Enters "<Username>" and "<Password>"
Then User Should Be Navigated to Homepage

Examples: 
	| Username | Password |
	| tomsmith | SuperSecretPassword!|
	| TestUser1 | Password1 |