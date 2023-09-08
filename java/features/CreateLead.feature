Feature: Functionality of create lead Module

Scenario: Create Lead

Given Enter the Username
Given Enter the Password
When Click on the login button
When Click on the crmsfa link
When Click on leads
Then WelcomePage is displayed
When Click on CreateLead link
When Enter the companyName
When Enter the firstName
When Enter the lastName
When Enter firstname local
When Enter department name
When Enter description
When Enter Enter phonenumber
When Enter e-mail
When Click on Create button
Then ViewLead page is displayed