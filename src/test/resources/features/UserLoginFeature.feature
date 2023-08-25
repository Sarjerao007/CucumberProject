Feature: Login Function

#Scenario: Valid Login
#Given User is on Login
#When User Enters credentials
#Then User Should Be Navigated to Homepage

#Scenario: Parameterization Valid Login
#Given User is on Login
#When User Enters "tomsmith" and "SuperSecretPassword!"
#Then User Should Be Navigated to Homepage

#Scenario Outline: Scenario Outline with Parameterization Valid Login
#Given User is on Login
#When User Enters "<Username>" and "<Password>"
#Then User Should Be Navigated to Homepage

#Examples: 
#	| Username | Password |
#	| tomsmith | SuperSecretPassword!|
#	| TestUser1 | Password1 |
#	| TestUser2 | Password2 |


#Scenario: DataTable as list Valid Login
#Given User is on Login
#When User Enters credentialss
#	| tomsmith | SuperSecretPassword! |
#Then User Should Be Navigated to Homepage

#Scenario: DataTable as a Map Valid Login
#Given User is on Login
#When User Enters credentialsss
#	| Username | Password |
#	| tomsmith | SuperSecretPassword! |
#Then User Should Be Navigated to Homepage

#Incomplet Need to Implement
Scenario: DataTable as a Map Valid Login more than one set of data
Given User is on Login
When User Enters credentialssss
	| Username | Password |
	| tomsmith | SuperSecretPassword! |
	| User1 | Pass |
Then User Should Be Navigated to Homepage