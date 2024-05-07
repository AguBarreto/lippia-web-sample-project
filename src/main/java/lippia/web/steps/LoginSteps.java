package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.LoginResultsService.*;
import static lippia.web.services.LoginService.*;


public class LoginSteps extends PageSteps {

    @Given("^the client is on the login page$")
    public void home(){
        navegarWeb();
    }

    @When("click on Log in manually")
    public void clickTextLoginManually(){
        clickTextLogin();
    }
    @And("enter email and password")
    public void enterEmailAndPassword(){
        sendLoginCredential();
        clickButtonLogin();
    }

    @Then("the user view the main dashboard")
    public void validateMainDashboard(){
        clickAlert();
        validateMainPage();
    }

    @And("click on the logout button")
    public void clickOnTheLogoutButton() {
        clickButtonLogout();
    }

    @Then("the user close session successfully")
    public void theUserCloseSessionSuccessfully() {
        validateCloseSession();
    }
}
