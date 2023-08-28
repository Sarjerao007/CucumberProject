@PhaseTwo
Feature: Contacts Management
Background: Valid login
Given User Is on Login Page
When User Enters Credential
Then User is on CRM Home Page

@SmokeTest
Scenario: Create a Contacts
When User Create New Contact

@RegressionTest
Scenario: Update a Contacts
When User Update Contact

Scenario: Delete a Contacts
When User Delete Contact