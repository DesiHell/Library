Feature: fetching Books details

  Scenario: testing the Get call for Books details

  Given url "http://localhost:9192/books/1
  When method GET
    Then status 200
    Then print response