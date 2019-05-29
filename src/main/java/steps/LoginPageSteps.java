package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginPageSteps extends BaseSteps {

    @Given("^As a user i navigate to (.*) Login Page$")
    public void asAUserINavigateToCouponsComHomePage(String website) throws Throwable {
        new LoginPage(driverFactory.getDriver()).navigateTo(website);
    }

    @And("^On SignIn Page I enter email as (.*) and password as (.*) and login$")
    public void onSignInPageIEnterEmailAsGojektestGmailComAndPasswordAsQwAndLogin(String email, String password) throws Throwable {
        new LoginPage(driverFactory.getDriver()).enterEmail(email);
        new LoginPage(driverFactory.getDriver()).enterPassword(password);
        new LoginPage(driverFactory.getDriver()).clickOnSignInButton();
    }

//    @Then("^User Profile is displayed for selection$")
//    public void userProfileIsDisplayedForSelection() throws Throwable {
//        new LoginPage(driverFactory.getDriver()).userProfileElementIsVisible();
//        Thread.sleep(10000000);
//    }
}
