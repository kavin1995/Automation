
Feature: Verifying the cyclos page
@cyclos1
Scenario Outline: verify the cyclos in payment page

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click the submit button "<amount>" and "<message>"
And User should enter the value and click confirm button 
Examples:
|amount|message|
|200|PayDone|

@cyclos1
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment

@cyclos1
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payments

@cyclos1
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment mode

@cyclos1
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment modes

@cyclos2
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click Member account

@cyclos2
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click voucher "<value>"
Examples:
|value|
|200|

@cyclos2
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click theme

@cyclos2
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click banking


@cyclos2
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click market

@cyclos3
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click information

@cyclos3
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo

@cyclos3
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should click setting

@cyclos3
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should click contact

@cyclos3
Scenario: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should click password


