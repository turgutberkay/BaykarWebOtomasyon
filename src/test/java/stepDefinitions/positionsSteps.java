package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.General;
import pages.PositionsPage;

public class positionsSteps {

    PositionsPage positionsPage = new PositionsPage();

    @Then("should see {string} Title Text on the Positions Page")
    public void shouldSeeTitleTextOnThePositionsPage(String arg0) {
        positionsPage.checkTitleText(arg0);
    }

    @When("taps to {string} Unit CheckBox on the Positions Page")
    public void tapsToUnitCheckBoxOnThePositionsPage(String arg0) {
        positionsPage.clickUnitCheckbox(arg0);
    }

    @Then("should see Selected {string} CheckBox on the Positions Page")
    public void shouldSeeSelectedCheckBoxOnThePositionsPage(String arg0) {
        positionsPage.checkSelectedCheckbox(arg0);
    }

    @When("write to {string} Search For Job Textbox on the Positions Page")
    public void writeToSearchForJobTextboxOnThePositionsPage(String arg0){
        positionsPage.clickSearchForJobTextbox();
        positionsPage.sendKeysSearchForJobTextbox(arg0);
    }

    @Then("should see all listed positions must contain the text {string} in their names on the Positions Page")
    public void shouldSeeAllListedPositionsMustContainTheTextInTheirNamesOnThePositionsPage(String arg0) {positionsPage.checkAllPositionsContainTextNames(arg0);}
}
