package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static lippia.web.services.LoginService.*;
import static lippia.web.services.WorkspaceService.*;
import static lippia.web.services.WorkspaceResultService.*;

public class WorkspaceSteps extends PageSteps {

    @Given("the user is logged in with valid email and password")
    public void loginSuccesfully(){
        navegarWeb();
        clickTextLogin();
        sendLoginCredential();
        clickButtonLogin();
        clickAlert();
    }

    @And("And clicks on Workspace")
    public void haceClickEnWorkspace() {
        clickButtonWorkspace();
    }

    @And("clicks on Manage")
    public void haceClickGestionar() {
        clickButtonManage();
    }

    @And("clicks on Create New Workspace")
    public void haceClickCrearNuevoEspacioDeTrabajo() {
        buttonCreateNewWorkspace();
    }

    @And("enters a name for the workspace")
    public void ingresaUnNombreAlWorkpace() {
        sendNameWorkspaceRandom();
    }


    @When("clicks on the Create button")
    public void haceClickEnCrear()  {
        clickButtonCreate();
    }

    @Then("the new workspace is displayed in the workspace area")
    public void seVisualizaElNuevoWorkspaceEnElEspacioDeTrabajo() {
        validateWorkspaceCreation();
        deleteWorkspace();
    }
}
