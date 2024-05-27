package MySteps;

import Page.TripPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;



public class TripSteps extends PageObject {

    TripPage tPage;

    @Step("user Has Been Landed On The Application HomePage")
    public void userHasBeenLandedOnTheApplicationHomePage() {
        tPage.userHasBeenLandedOnTheApplicationHomePage();
    }

    @Step("user Dismisses The Popup Window Appeared")
    public void userDismissesThePopupWindowAppeared() throws InterruptedException {
        tPage.userDismissesThePopupWindowAppeared();
    }

    @Step("user Clicks On The Required Mode Of Transport")
    public void userClicksOnTheRequiredModeOfTransport(String mode) {
        tPage.userClicksOnTheRequiredModeOfTransport(mode);
    }

    @Step("user Clicks On From And Enters His Preferred From Location")
    public void userClicksOnFromAndEntersHisPreferredFromLocation(String fLocation) throws InterruptedException {
        tPage.userClicksOnFromAndEntersHisPreferredFromLocation(fLocation);
    }

    @Step("user Clicks On To And Enters His Preferred To Location")
    public void userClicksOnToAndEntersHisPreferredToLocation(String tLocation) throws InterruptedException {
        tPage.userClicksOnToAndEntersHisPreferredToLocation(tLocation);
    }

    @Step("user Clicks On Travel Date And Selects His Preferred Date To Travel As")
    public void userClicksOnTravelDateAndSelectsHisPreferredDateToTravelAs(String monthYear, String date) {
        tPage.userClicksOnTravelDateAndSelectsHisPreferredDateToTravelAs(monthYear, date);
    }

    @Step("user Clicks Pn Class Button And Selects His Travel Mode Class")
    public void userClicksPnClassButtonAndSelectsHisTravelModeClass(String myClass) {
        tPage.userClicksPnClassButtonAndSelectsHisTravelModeClass(myClass);
    }

    @Step("user Clicks On The Search Button")
    public void userClicksOnTheSearchButton() {
        tPage.userClicksOnTheSearchButton();
    }

    @Step("user Selects His Preferred Train And His Preferred RailClass")
    public void userSelectsHisPreferredTrainAndHisPreferredRailClass(String trainName, String railClass) {
        tPage.userSelectsHisPreferredTrainAndHisPreferredRailClass(trainName, railClass);
    }


    public void userDismissesTheSecondWindowAppeared() throws InterruptedException {
        tPage.userDismissesTheSecondWindowAppeared();
    }
}
