@amazon
Feature: Testing Amazon application

  @user1
  Scenario: Launch amazon application
    Given Launches application
    Then Verifies url

  @user2
  Scenario Outline: Login amazon application
    Given Launches application
    Then Verifies url
    Then user enter "<uname>" and "<pwd>"

    Examples: 
      | uname                 | pwd         |
      | yuvarajsrec4@gmai.com | B@positive5 |
      | malavi@gmail.com       | Malvai@123  |
