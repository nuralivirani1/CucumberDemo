@home
Feature: Testing Facebook login page

@smoke
Scenario: Testing facebbok with valid username and valid password
Given I opened a chrome browser
Then I hit facebook "https://www.facebook.com" on to the browser
Then i entered "mohit3021@gmail.com" in username text field
Then i also entered "djghjdjhghj" in password text field
Then I click on signin button
@regression
Scenario: Testing facebbok with valid username and invalid password
Given I opened a chrome browser
Then I hit facebook "https://www.facebook.com" on to the browser
Then i entered "invalid_mohit@gmail.com" in username text field
Then i also entered "djghjdjhghj" in password text field
Then I click on signin button

@regression
Scenario: Testing facebbok with Invalid username and invalid password
Given I opened a chrome browser
Then I hit facebook "https://www.facebook.com" on to the browser
Then i entered "invalid_mohit@gmail.com" in username text field
Then i also entered "djghjdjhghj" in password text field
Then I click on signin button

