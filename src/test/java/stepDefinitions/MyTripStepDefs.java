package stepDefinitions;

import MySteps.TripSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.makemytrip.com/")
public class MyTripStepDefs extends PageObject {
    @Steps
    TripSteps tSteps;

    @Managed()
    WebDriver driver;

    @Before
    public void openBrowser() {
//        getDriver().get("https://www.makemytrip.com/");
        open();
    }

    @After
    public void tearOut() {
        driver.quit();
    }

    @Given("user has been landed on the Application Home Page")
    public void userHasBeenLandedOnTheApplicationHomePage() {
        tSteps.userHasBeenLandedOnTheApplicationHomePage();
    }

    @Then("user dismisses the popup window appeared")
    public void userDismissesThePopupWindowAppeared() throws InterruptedException {
        tSteps.userDismissesThePopupWindowAppeared();
    }

    @Then("user clicks on the required mode of transport {string}")
    public void userClicksOnTheRequiredModeOfTransport(String mode) {
        tSteps.userClicksOnTheRequiredModeOfTransport(mode);
    }

    @Then("user clicks on From and enters his preferred from Location {string}")
    public void userClicksOnFromAndEntersHisPreferredFromLocation(String fLocation) throws InterruptedException {
        tSteps.userClicksOnFromAndEntersHisPreferredFromLocation(fLocation);
    }

    @Then("user clicks on To and enters his preferred to Location {string}")
    public void userClicksOnToAndEntersHisPreferredToLocation(String tLocation) throws InterruptedException {
        tSteps.userClicksOnToAndEntersHisPreferredToLocation(tLocation);
    }

    @Then("user clicks on TravelDate and selects his preferred date to travel as {string} {string}")
    public void userClicksOnTravelDateAndSelectsHisPreferredDateToTravelAs(String monthYear, String date) {
        tSteps.userClicksOnTravelDateAndSelectsHisPreferredDateToTravelAs(monthYear, date);
    }

    @Then("user clicks pn class button and selects his travel mode class {string}")
    public void userClicksPnClassButtonAndSelectsHisTravelModeClass(String MyClass) {
        tSteps.userClicksPnClassButtonAndSelectsHisTravelModeClass(MyClass);
    }

    @Then("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        tSteps.userClicksOnTheSearchButton();
    }

    @Then("user selects his preferred train {string} and his preferred rail class {string}")
    public void userSelectsHisPreferredTrainAndHisPreferredRailClass(String trainName, String railClass) {
        tSteps.userSelectsHisPreferredTrainAndHisPreferredRailClass(trainName, railClass);
    }



    @Then("user dismisses the second window appeared")
    public void user_dismisses_the_second_window_appeared() throws InterruptedException {
        tSteps.userDismissesTheSecondWindowAppeared();
    }
}
