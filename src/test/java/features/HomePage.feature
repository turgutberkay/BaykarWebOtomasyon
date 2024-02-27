@PositionsPage
Feature: PositionsPage Feature

  # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
  @Case-1
  Scenario Outline: Dynamic navbar control home page
    Given Go To Url "<url>"
    When taps to Close Button Teknofest on the Home Page
    When taps to "<navbar>" Navbar on the Home Page
    Then should see "<navbar>" page or Dropdown
    Examples:
      | url                           | navbar      |
      | https://www.baykartech.com/tr | HAKKIMIZDA      |


  @Case-2
  Scenario Outline: Static language element text control
    Given Go To Url "<url>"
    When taps to Close Button Teknofest on the Home Page
    Then should see "<pageTitle>" Page Title Text on the Home Page
    Then should see "<langIconText>" Lang Icon Text on the Home Page
    Then should see "<scrollDownText>" Scroll Down Text on the Home Page
    Examples:
      | url                           | pageTitle         | langIconText | scrollDownText |
      | https://www.baykartech.com/tr | BAYKAR Teknoloji  | EN           | Aşağı İn       |
      | https://www.baykartech.com/en | BAYKAR Technology | TR           | Scroll Down    |

