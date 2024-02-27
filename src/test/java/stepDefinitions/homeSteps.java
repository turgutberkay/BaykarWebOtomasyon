package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.General;
import pages.HomePage;

public class homeSteps {

    HomePage homePage = new HomePage();

    @When("taps to All Open Positions on the Home Page")
    public void tapsToAllOpenPositionsOnTheHomePage() {homePage.clickAllOpenPositions();}

    @When("taps to {string} Navbar on the Home Page")
    public void tapsToNavbarOnTheHomePage(String arg0) {homePage.clickOptionNavbar(arg0);}

    @Then("should see {string} page or Dropdown")
    public void shouldSeePageOrDropdown(String arg0){homePage.checkCorrectPage(arg0);}

    @When("taps to Close Button Teknofest on the Home Page")
    public void tapsToCloseButtonTeknofestOnTheHomePage() {homePage.clickTeknofestCloseButton();}

    @Then("should see {string} Page Title Text on the Home Page")
    public void shouldSeePageTitleTextOnTheHomePage(String arg0) {homePage.checkPageTitleText(arg0);}

    @Then("should see {string} Lang Icon Text on the Home Page")
    public void shouldSeeLangIconTextOnTheHomePage(String arg0) {homePage.checkLangIconText(arg0);}

    @Then("should see {string} Scroll Down Text on the Home Page")
    public void shouldSeeScrollDownTextOnTheHomePage(String arg0) {homePage.checkScrollDownText(arg0);}
}
