Feature: Register to the web-site using valid email ID
Scenario: Register to the web-site
Given Sign in is visible in http://automationpractice.com/index.php
When Click on Sign in button
Then Authentication Page is displayed
And User enters valid email ID
And Clicks on Create Account Button