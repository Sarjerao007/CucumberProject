Feature: Login Function

#Scenario: Valid Login
#Given User is on Login
#When User Enters credentials
#Then User Should Be Navigated to Homepage

Scenario: Parameterization Valid Login
Given User is on Login
When User Enters "tomsmith" and "SuperSecretPassword!"
Then User Should Be Navigated to Homepage