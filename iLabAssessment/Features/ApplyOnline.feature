Feature: Apply Online

  Scenario Outline: a user apply on iLab careers
    Given a user is on the iLab website
    When  a user clicks on careers
    Then a user should see work with iLab text
    When a user clicks on South Africa
    Then a user should see Current Openings text
    When a user clicks on Software Test Engineer Johannesburg
    Then a user should see Software Test Engineer Johannesburg text
    When a user click on Apply button
    And a user enters names as "<Your Name>"
    And a user enter email as "<Your email address>"
    And a user enters phone number
    And a user clicks on Send Application button
    Then a user should see You need to upload at least one file.

    Examples:
      |Your Name|Your email address|
      |Zintle   |automationAssessment@iLABQuality.com|
      |Lutho    |automationAssessment@iLABQuality.com|
