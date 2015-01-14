Scenario: Adding a field to the table with parametrs: <firstName>, <lastName>, <category>, <gender>
Given the user is on the Ranorex web page
When the user enter <firstName> into First Name field, <lastName> into Last Name field, chose <category> from the list Category and choose <gender> from Gender
When the user press button Add
Then line is added to the table with the previously entered parameters <firstName> into the field First Name
And line is added to the table with the previously entered parameters <lastName> into the field Last Name
And line is added to the table with the previously entered parameters <gender> into the field Gender
And line is added to the table with the previously entered parameters <category> into the field Category

Examples:
|firstName|lastName|category|gender|
|1Fn|1Ln|Other|Female|
|2Fn|2Ln|Music|Female|
|3Fn|3Ln|Movie|Female|
|4Fn|4Ln|Science|Female|
|5Fn|5Ln|Sport|Female|
|6Fn|6Ln|Politics|Female|
|7Fn|7Ln|Other|Male|
|8Fn|8Ln|Music|Male|
|9Fn|9Ln|Movie|Male|
|10Fn|10Ln|Science|Male|
|11Fn|11Ln|Sport|Male|
|12Fn|12Ln|Politics|Male|


Scenario: Adding 2 fields to the table
Given the user is on the Ranorex web page
When the user enter first name Frank
When the user enter last name Sinatra
When the user press button 'Add' first time
When the user enter first name Kings
When the user enter last name Of Leon
When the user press button 'Add' second time
Then vip count should be VIP count: 2