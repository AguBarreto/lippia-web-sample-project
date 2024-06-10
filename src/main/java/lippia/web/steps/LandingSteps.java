package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LandingService;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LandingSteps extends PageSteps {

    @Given("The user is logged into the tracker page with the email {string} and password {string}")
    public void theUserIsLoggedIntoTheTrackerPageWithTheEmailAndPassword(String mail, String password) {
        HomeService.navegarWeb();
        HomeService.clickLogin();
        LoginService.clickLoginManually();
        LoginService.setEmail(mail);
        LoginService.setPassword(password);
        LoginService.clickLoginButton();
        LandingService.clickTrackerButton();
    }
}