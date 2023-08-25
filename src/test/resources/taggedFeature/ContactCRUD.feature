@PhaseTwo
Feature: Contacts Management

@SmokeTest
Scenario: Create a Contacts
Given User is on CRM Home Page
When User Create New Contact

@RegressionTest
Scenario: Update a Contacts
Given User is on CRM Home Page
When User Update Contact

Scenario: Delete a Contacts
Given User is on CRM Home Page
When User Delete Contact