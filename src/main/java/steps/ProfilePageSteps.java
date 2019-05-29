package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProfilePage;

public class ProfilePageSteps extends BaseSteps {
    @Then("^User Profile is displayed for selection$")
    public void userProfileIsDisplayedForSelection() throws Throwable {
        new ProfilePage(driverFactory.getDriver()).userPersonalProfileButtonIsVisible();
    }

    @When("^Click on User Profile Icon$")
    public void clickOnUserProfileIcon() throws Throwable {
        new ProfilePage(driverFactory.getDriver()).clickOnUserPersonalProfileButton();
    }

    @When("^Click on Logout$")
    public void clickOnLogout() throws Throwable {
        new ProfilePage(driverFactory.getDriver()).clickOnMenuButton();
        new ProfilePage(driverFactory.getDriver()).clickOnLogoutButton();
    }
}
