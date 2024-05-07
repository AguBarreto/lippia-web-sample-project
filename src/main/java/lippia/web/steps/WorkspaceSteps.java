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


    @And("hace click en workspace")
    public void haceClickEnWorkspace() {
        clickButtonWorkspace();
    }

    @And("hace click gestionar")
    public void haceClickGestionar() {
        clickButtonManage();
    }

    @And("hace click crear nuevo espacio de trabajo")
    public void haceClickCrearNuevoEspacioDeTrabajo() {
        buttonCreateNewWorkspace();
    }

    @And("ingresa un nombre al workpace")
    public void ingresaUnNombreAlWorkpace() {
        sendNameWorkspaceRandom();
    }


    @When("hace click en el button crear")
    public void haceClickEnCrear()  {
        clickButtonCreate();
    }

    @Then("se visualiza el nuevo workspace en el espacio de trabajo")
    public void seVisualizaElNuevoWorkspaceEnElEspacioDeTrabajo() {
        validateWorkspaceCreation();
        deleteWorkspace();
    }
}
