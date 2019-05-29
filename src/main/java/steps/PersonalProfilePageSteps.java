package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PersonalProfilePage;

public class PersonalProfilePageSteps extends BaseSteps {
    @Then("^User Profile page is opened$")
    public void userProfilePageIsOpened() throws Throwable {
        new PersonalProfilePage(driverFactory.getDriver()).toolbarPersonalProfileISVisible();
    }
}
