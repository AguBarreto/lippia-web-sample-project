package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.SearchResultService;

public class LoginSteps extends PageSteps {

    @Given("The client is on Home Page")
    public void theClientIsOnHomePage() {
        HomeService.navegarWeb();
    }
}
