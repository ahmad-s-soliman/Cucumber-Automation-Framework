@login @regression
Feature: WebDriver University - login page

  Background:
    Given I access webdriver university login page

@login1
  Scenario: Validate successful login with correct credentials
    When I enter username webdriver
    And I enter password webdriver123
    And I click on login button
    Then Alert with validation succeeded is displayed

  Scenario: Validate failed login with correct credentials
    When I enter username webdriver
    And I enter password webdriver1
    And I click on login button
    Then Alert with validation failed is displayed

    @smoke @ignore
  Scenario Outline: validated successful and failed login
    And I enter username <username>
    And I enter password <password>
    And I click on login button
    Then Alert with <message> is displayed

    Examples:
      | username  | password     | message              |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | webdriver1   | validation failed    |
      | test      | test         | validation failed    |