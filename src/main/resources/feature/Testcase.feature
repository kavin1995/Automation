@tags
Feature: Verifying the sauce page
@tag1
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login

@tag1
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the product


@tag1
Scenario Outline: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the Add to cart button "<first>" ,"<last>" and "<pincode>"

Examples:
|first|last|pincode|
|praveen|kumar|600096|

@tag1
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click cart button


@tag1
Scenario Outline: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the filter button

Examples:
|name|Character|pin|
|sam|kumar|600073|

@tag2
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should use dynamic path

@tag2
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click logout


@tag2
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should all Add to Cart 

@tag2
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click logout

@tag2
Scenario Outline: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click all cart "<firstname>" ,"<Letter>" and "<code>"

Examples:
|firstname|Letter|code|
|Ram|kumar|690098|


@tag3
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click cart

@tag3
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click carts

@tag3
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click cart to contiune

@tag3
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should about

@tag3
Scenario: verify the login page
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click request






