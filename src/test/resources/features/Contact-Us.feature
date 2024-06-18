@contact-us @regression
Feature: WebDriver University - Contact Us Page

  Scenario: Validate successful submission - unique data
    Given I access webdriver university contact us page
    When I enter unique first name
    And I enter unique last name
    And I enter unique email address
    And I enter unique comment
    And I click on submit button
    Then I should be presented with a successful message submission

  Scenario: Validation successful submission - specific data
      Given I access webdriver university contact us page
      When I enter specific first name aaa
      And I enter specific last name sss
      And I enter specific email address aaasss@mail.com
      And I enter specific comment "how are you today?"
      And I click on submit button
      Then I should be presented with a successful message submission