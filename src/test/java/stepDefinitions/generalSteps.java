package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.General;

public class generalSteps {

    General general = new General();

    @Given("Go To Url {string}")
    public void goToUrl(String url) {general.goToUrl(url);}

}
