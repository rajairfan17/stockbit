Feature: SignUp

  Scenario: User can signup with email successfully
    Given Go To Stockbit Website
    And Click SignUp Button
    When User register with email
    And User input Name "raja irfan"
    And User input email "rajairfan382@gmail.com"
    And User input username "rajairfan"
    And User input password "rajairfan"
    And User input confirm password "rajairfan"
    And User click register button
    Then User successfully submit data
