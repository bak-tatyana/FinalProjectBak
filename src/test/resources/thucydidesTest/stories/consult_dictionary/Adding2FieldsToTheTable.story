Scenario: Adding 2 fields to the table
Given the user is on the Ranorex web page
Given the user enter first name Frank
Given the user enter last name Sinatra
When the user press button 'Add' first time
Given the user enter first name Kings
Given the user enter last name Of Leon
When the user press button 'Add' second time
Then vip count should be 2