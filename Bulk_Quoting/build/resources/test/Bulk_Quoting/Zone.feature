Feature: Retrieve list of ZoneGuids

  Scenario Outline: Retrieve list of Zone guid for a country,division,modelYear
    Given Swetha sends request to the Bulk Quoting Service for a "<country>","<division>","<modelYear>"
    When they send a getzones request
    Then list of available zoneGuids should get displayed

    Examples:
      |country | division | modelYear |
      |US      |BM        |2021       |
