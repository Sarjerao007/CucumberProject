@PhaseOne
Feature: Deals Management

@SmokeTest @RegressionTest
Scenario: Create a Deals
Given User is on CRM Home Page
When User Create New Deals

@RegressionTest
Scenario: Update a Deals
Given User is on CRM Home Page
When User Update Deals

Scenario: Delete a Deals
Given User is on CRM Home Page
When User Delete Deals