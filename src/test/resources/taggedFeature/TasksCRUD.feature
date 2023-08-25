@PhaseOne
Feature: Tasks Management

@SmokeTest
Scenario: Create a Tasks
Given User is on CRM Home Page
When User Create New Tasks

@RegressionTest
Scenario: Update a Tasks
Given User is on CRM Home Page
When User Update Tasks

Scenario: Delete a Tasks
Given User is on CRM Home Page
When User Delete Tasks