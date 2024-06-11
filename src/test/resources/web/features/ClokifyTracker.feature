
Feature: Consigna Final Lippia Web

  Background:
    Given The user is logged into the tracker page with the email "agustinbarreto2022@hotmail.com" and password "1234ab"

  @NewTrackerManual @TpFinal
  Scenario Outline: Create a new time tracker with a manual input option
    When The user clicks on the Manual option
    When The user enters <newData> the name of the time entry description with the day and time
    When The user inputs Start Time <StartTime>, Finish Time <FinishTime>, and Day <day>
    When The user clicks on init button
    Then The user verify <exist> exist time entry

    Examples:
      | newData | StartTime | FinishTime | day        | exist |
      | new     | 0900      | 0910       | 28/05/2024 | TRUE  |

  @NewTrackerTimer
  Scenario: Create a new time tracker with a timer option
    When The user clicks on Timer option
    When The user enters new the name of the time entry description with the day and time
    When The user clicks on init button
    When The user clicks on stop button
    Then The user verify TRUE exist time entry

  @DiscardNewTracker
  Scenario: Discard a new time tracker
    When The user clicks on Timer option
    When The user enters new the name of the time entry description with the day and time
    When The user clicks on init button
    When The user clicks on the 'manage time entry' button
    When The user clicks on Discard option
    When The user clicks on Discard button
    Then The user verify FALSE exist time entry

  @UpdateTracker
  Scenario: Update time tracker
    When The user add a new tracker entry
    When The user update Time-Entry-Description name
    When The user select the project option, enter a new project and associate
    When The user select the tag option, enter a new tag and associate
    When The user update billable
    When The user update input Time Start = 0915, Time Finish = 1400
    Then The user verify TRUE exist time entry