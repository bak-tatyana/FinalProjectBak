Scenario: Clear default table
Given the user is on the Ranorex web page
When the user press button 'Load'
Then vip count should be VIP count: 6
When the user press button 'Clear'
Then vip count should be VIP count: 0