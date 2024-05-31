Feature: User verifies the functionality of Make My trip Application

  @Trip
  Scenario Outline: Verify that user is able to login the Application
    Given user has been landed on the Application Home Page
    Then user dismisses the popup window appeared
    Then user dismisses the second window appeared
    Then user clicks on the required mode of transport "<mode>"
    Then user clicks on From and enters his preferred from Location "<fLocation>"
    Then user clicks on To and enters his preferred to Location "<tLocation>"
    Then user clicks on TravelDate and selects his preferred date to travel as "<MonthYear>" "<date>"
    Then user clicks pn class button and selects his travel mode class "<class>"
    Then user clicks on the search button
    Then user selects his preferred train "<TrainName>" and his preferred rail class "<RailClass>"
    Examples:
      | mode   | fLocation             | tLocation                 | MonthYear | date | class         | TrainName    | RailClass |
      | Trains | Bidar Railway Station | Yelahanka Railway Station | July 2024 | 20   | Sleeper Class | Bidr Ypr Exp | SL        |



