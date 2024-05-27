package Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class TripPage extends PageObject {


    @FindBy(xpath = "//label/*[text()='From']")
    public WebElementFacade btnFrom;
    @FindBy(xpath = "//input[@placeholder='From']")
    public WebElementFacade placeholderFrom;
    @FindBy(xpath = "//*[@class='commonModal__close']")
    public WebElementFacade btnDismiss;
    @FindBy(xpath = "//*[@class='imageSlideContainer']/section/span")
    public WebElement btnFrameClose;
    @FindBy(xpath = "//label/*[text()='To']")
    public WebElementFacade btnTo;
    @FindBy(xpath = "//input[@placeholder='To']")
    public WebElementFacade placeholderTo;
    @FindBy(xpath = "//*[@data-cy='travelDatelabel']")
    public WebElementFacade btnTravelDate;
    @FindBy(xpath = "(//*[@class='DayPicker-Caption']/div)[2]")
    public WebElementFacade labelMonthYear;
    @FindBy(xpath = "//*[@aria-label='Next Month']")
    public WebElementFacade btnNextMonth;
    @FindBy(xpath = "//label[@for='travelClass']//*[@data-cy='class']")
    public WebElementFacade btnClass;
    @FindBy(xpath = "//a[@data-cy='submit']")
    public WebElementFacade btnSubmit;

    public void userHasBeenLandedOnTheApplicationHomePage() {
        String title = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
        Assert.assertEquals(title, getDriver().getTitle());
    }

    public void userDismissesThePopupWindowAppeared() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()",btnFrameClose);
    }

    public void userClicksOnTheRequiredModeOfTransport(String mode) {
        List<WebElement> modeTransport = getDriver().findElements(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']//li"));
        for (WebElement modeItems : modeTransport) {
            if (modeItems.getText().equalsIgnoreCase(mode)) {
                modeItems.click();
            }
        }
    }

    public void userClicksOnFromAndEntersHisPreferredFromLocation(String fLocation) throws InterruptedException {
        btnFrom.click();
        placeholderFrom.sendKeys("Bidar");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//ul[@role='listbox']/li//p//*[contains(text(),'" + fLocation + "')]")).click();
    }

    public void userClicksOnToAndEntersHisPreferredToLocation(String tLocation) throws InterruptedException {
        btnTo.click();
        placeholderTo.sendKeys("Yelahanka");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//ul[@role='listbox']/li//p//*[contains(text(),'" + tLocation + "')]")).click();

    }

    public void userClicksOnTravelDateAndSelectsHisPreferredDateToTravelAs(String monthYear, String date) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", btnTravelDate);
        while (true) {
            String ak = labelMonthYear.getText();
            if (ak.equalsIgnoreCase(monthYear)) {
                break;
            }
            btnNextMonth.click();
        }
        getDriver().findElement(By.xpath("(//*[@class='DayPicker-Body'])[2]/div/div[contains(text(),'" + date + "')]")).click();
    }


    public void userClicksOnTheSearchButton() {
        btnSubmit.click();
    }

    public void userSelectsHisPreferredTrainAndHisPreferredRailClass(String trainName, String railClass) {

        if (trainName.equalsIgnoreCase("Bidr Ypr Exp")) {
            getDriver().findElement(By.xpath("(//div[contains(text(),'" + railClass + "')])[1]")).click();
        } else if (trainName.equalsIgnoreCase("Ned Sbc Exp"))
            getDriver().findElement(By.xpath("(//div[contains(text(),'" + railClass + "')])[2]")).click();
//        Thread.sleep(20000);
    }

    public void userClicksPnClassButtonAndSelectsHisTravelModeClass(String myClass) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", btnClass);
        getDriver().findElement(By.xpath("//ul[@class='travelForPopup']/li[contains(text(),'" + myClass + "')]")).click();
    }


    public void userDismissesTheSecondWindowAppeared() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("//div[@id='webengage-notification-container']/iframe")));
        getDriver().findElement(By.xpath("//a[@class='close']/i")).click();
    }
}

