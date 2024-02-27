@PositionsPage
Feature: PositionsPage Feature

  # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
  @Case-3
  Scenario Outline: Search and filter all open positions
    Given Go To Url "<url>"
    When taps to All Open Positions on the Home Page
    Then should see "<title>" Title Text on the Positions Page
    When taps to "<unitChoice>" Unit CheckBox on the Positions Page
    Then should see Selected "<unitChoice>" CheckBox on the Positions Page
    When write to "<jobText>" Search For Job Textbox on the Positions Page
    Then should see all listed positions must contain the text "<jobText>" in their names on the Positions Page
    Examples:
      | url                               | title                   | unitChoice                    | jobText                    |
      | https://kariyer.baykartech.com/en | Open Job Positions      | Electronic System Development | Electrical                 |

