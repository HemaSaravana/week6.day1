Feature: DuplicateLead for LeafTaps application
Scenario Outline: TC001_DuplicateLead
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click crmsfa link
Given Click on Lead
Given Click on Find Lead 
Given Enter phone number in findLead as '98'
Given Click on Find Lead button
Given Click on DuplicateLead
Given Click on submit after DuplicateLead

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|
