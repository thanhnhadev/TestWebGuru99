Feature:

  Scenario: User should be able to open Pager
    Given I open the application
    When  I select the iten Dashboard Page tap on click Macros
    When I select Macro Page tap on Trigger to add a trigger
    And I select On Trigger Page tap on Application
    And  Tap on App Install/Remove/Update
    And Select Application Removed radio button
    And Select Any Application and OK
    And On Macro Page, tap on Action to add an action
    And On Action page, tap on Logging
    And Select Clear Log
    And  Select System Log and OK
    And On Macro Page, tap on Constrains to add an contrains
    And Select Device State
    And Select Airplan Mode
    And Select Airplan Mode Disable and OK
    And On Macro Page, select add Local Variable
    And Add an Interger Variable with Name “Test Case”
    Then  Select new added Variable, and input Value
