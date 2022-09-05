
@stories
Feature: uTest Page
  As an user, I want to register at uTest.com

  @scenario
  Scenario: The user completes the form
    Given The user is on the Register form page
      When The user completes the form
      Then The user sees "Welcome to the world's largest community of freelance software testers!"