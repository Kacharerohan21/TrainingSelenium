Feature: Hooks in cucumber

Scenario: Add new customer
Given User is on Add Customer Page
When User fills the Customer details
Then Customer is Added

Scenario: Edit Customer
Given User is on Edit Customer Page
When User edits Contact Details
Then Contact details Updated

Scenario: Delete Customer
Given User is on Delete Customer Page
When User Delete Customer
Then Customer Deleted
